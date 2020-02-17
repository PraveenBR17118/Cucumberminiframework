package stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class OrangeHRMsteps extends BaseClass
{

    @Before
    public void setup() throws IOException
    {
        logger= Logger.getLogger("SeleniumCucumber"); //Added logger
        PropertyConfigurator.configure("log4j.properties");//Added logger

        configProp=new Properties();
        FileInputStream configPropfile=new FileInputStream("config.properties");
        configProp.load(configPropfile);

    }

    @Given("I launch desired browser")
    public void i_launch_desired_browser()
    {
        //System.setProperty("webdriver.chrome.driver","/Users/praveen/Documents/IntelliJidea/Cucumber/SeleniumCucumber/Driver/chromedriver");
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Users/praveen/Documents/IntelliJidea/Cucumber/SeleniumCucumber/Driver/chromedriver");
//      //System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
//      //driver = new ChromeDriver();//Launch chrome driver

        String br=configProp.getProperty("browser");

        if(br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
            driver=new ChromeDriver();
            logger.info("Launching the chrome browser");
        }
        else if (br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
            driver = new FirefoxDriver();
            logger.info("Launching the firefox browser");
        }



        try {
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        logger.info("Opening the URL");
        try {
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page()
    {
        boolean status = driver.findElement(By.xpath("//img[@src='/webres_5df488ddad8b23.30204013/themes/default/images/login/logo.png']")).isDisplayed();
        logger.info("Verfying the logo");
        Assert.assertTrue(status);
    }

    @Then("close browser")
    public void close_browser()
    {
        try {
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        logger.warn("colosing the browser");
        driver.quit();
    }

}

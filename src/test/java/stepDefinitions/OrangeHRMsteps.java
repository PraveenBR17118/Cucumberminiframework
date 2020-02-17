package stepDefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps
{
     public WebDriver driver ;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser()
    {
        System.setProperty("webdriver.chrome.driver","/Users/praveen/Documents/IntelliJidea/Cucumber/SeleniumCucumber/Driver/chromedriver");
        driver = new ChromeDriver();//Launch chrome driver
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
        driver.quit();
    }

}

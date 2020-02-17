$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/OrangeHRM.feature");
formatter.feature({
  "name": "OrangeHRM Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Logo presence on OrangeHRM home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMsteps.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open orange hrm homepage",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMsteps.i_open_orange_hrm_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the logo present on page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMsteps.i_verify_that_the_logo_present_on_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMsteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});
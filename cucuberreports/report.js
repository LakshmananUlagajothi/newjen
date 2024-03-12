$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "",
  "description": "   Bookcart application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    Login should be success",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should naviagate to the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_should_naviagate_to_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login link button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_click_on_the_login_link_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the username as siva143",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_enter_the_username_as_siva(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the passwword as Siva12345",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_enter_the_passwword_as_Siva(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "loginn should be success",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.loginn_should_be_success()"
});
formatter.result({
  "status": "passed"
});
});
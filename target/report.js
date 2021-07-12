$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Cura.feature");
formatter.feature({
  "name": "Validate the login functionality of CURA website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the login of CURA with valid and invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter into the cura website",
  "keyword": "When "
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and enter",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter into appointment page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sekargnanas",
        "admin"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the login of CURA with valid and invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepRef.user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter into the cura website",
  "keyword": "When "
});
formatter.match({
  "location": "StepRef.user_should_enter_into_the_cura_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"sekargnanas\" and \"admin\" and enter",
  "keyword": "And "
});
formatter.match({
  "location": "StepRef.user_should_enter_and_and_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter into appointment page",
  "keyword": "And "
});
formatter.match({
  "location": "StepRef.user_should_enter_into_appointment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login of CURA with valid and invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepRef.user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter into the cura website",
  "keyword": "When "
});
formatter.match({
  "location": "StepRef.user_should_enter_into_the_cura_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"admin\" and \"admin\" and enter",
  "keyword": "And "
});
formatter.match({
  "location": "StepRef.user_should_enter_and_and_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter into appointment page",
  "keyword": "And "
});
formatter.match({
  "location": "StepRef.user_should_enter_into_appointment_page()"
});
formatter.result({
  "status": "passed"
});
});
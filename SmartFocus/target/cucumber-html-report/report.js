$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "register with shop courts",
  "description": "\r\nAs a user\r\nI want to be",
  "id": "register-with-shop-courts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Login to the shop courts account",
  "description": "",
  "id": "register-with-shop-courts;login-to-the-shop-courts-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Signup"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I m on page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter \u003cusername\u003e and \u003cpassword\u003e and submit",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I can see my \u003cmessages\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "register-with-shop-courts;login-to-the-shop-courts-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "messages"
      ],
      "line": 24,
      "id": "register-with-shop-courts;login-to-the-shop-courts-account;;1"
    },
    {
      "cells": [
        "selenium1986@gmail.com",
        "selenium1986",
        "Hi selenium"
      ],
      "line": 25,
      "id": "register-with-shop-courts;login-to-the-shop-courts-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Login to the shop courts account",
  "description": "",
  "id": "register-with-shop-courts;login-to-the-shop-courts-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Signup"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I m on page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter selenium1986@gmail.com and selenium1986 and submit",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I can see my Hi selenium",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.navigate()"
});
formatter.result({
  "duration": 16405055487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium1986@gmail.com",
      "offset": 8
    },
    {
      "val": "selenium1986",
      "offset": 35
    }
  ],
  "location": "LoginTest.enteruser_and_password(String,String)"
});
formatter.result({
  "duration": 4240809130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hi selenium",
      "offset": 13
    }
  ],
  "location": "LoginTest.verifyMessage(String)"
});
formatter.result({
  "duration": 248164728,
  "status": "passed"
});
formatter.after({
  "duration": 848235226,
  "status": "passed"
});
});
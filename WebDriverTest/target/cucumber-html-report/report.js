$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@reg"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify user can login",
  "description": "",
  "id": "login;verify-user-can-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on mypage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the country",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to loginpage",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.match({
  "location": "Home.setUp()"
});
formatter.result({
  "duration": 41714706559,
  "status": "passed"
});
formatter.match({
  "location": "Home.run()"
});
formatter.result({
  "duration": 1065217422,
  "status": "passed"
});
formatter.match({
  "location": "Home.navLogin()"
});
formatter.result({
  "duration": 5540236268,
  "status": "passed"
});
formatter.match({
  "location": "Home.navRegister()"
});
formatter.result({
  "duration": 5853363698,
  "status": "passed"
});
});
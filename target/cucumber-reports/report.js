$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sanity.feature");
formatter.feature({
  "line": 1,
  "name": "Verify admin can see the list of available users and can activate or de-activate",
  "description": "",
  "id": "verify-admin-can-see-the-list-of-available-users-and-can-activate-or-de-activate",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8495255460,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#  Background:"
    },
    {
      "line": 4,
      "value": "#    Given admin is on login page"
    },
    {
      "line": 5,
      "value": "#    When admin enters email as \"email\", password as \"password\""
    },
    {
      "line": 6,
      "value": "##    When admin enters email as \"email_test\", password as \"password_test\""
    },
    {
      "line": 7,
      "value": "#    And admin clicks on log in button"
    },
    {
      "line": 8,
      "value": "#    Then admin should login and see dashboard page"
    }
  ],
  "line": 12,
  "name": "Admin can login successfully with valid details",
  "description": "",
  "id": "verify-admin-can-see-the-list-of-available-users-and-can-activate-or-de-activate;admin-can-login-successfully-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "admin enters email as \"email\", password as \"password\"",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#    When admin enters email as \"email_test\", password as \"password_test\""
    }
  ],
  "line": 16,
  "name": "admin clicks on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "admin should login and see dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.admin_is_on_login_page()"
});
formatter.result({
  "duration": 228589552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 23
    },
    {
      "val": "password",
      "offset": 44
    }
  ],
  "location": "MyStepDefs.admin_enters_email_as_password_as(String,String)"
});
formatter.result({
  "duration": 368322515,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.admin_clicks_on_log_in_button()"
});
formatter.result({
  "duration": 7363818615,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.admin_should_login_and_see_dashboard_page()"
});
formatter.result({
  "duration": 249209528,
  "status": "passed"
});
formatter.after({
  "duration": 6566694,
  "status": "passed"
});
});
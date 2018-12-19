Feature: student mobileapp profile verfication
  Scenario: user signup
    Given user open userapp
    When user select signup
    And user enter the below details
    |first name|last name|email address|phone|password|retype password|
    And user click signup
    Then user should successfully signup

    Scenario:enter with invalid password
      Given user is on userapp
      When user enter the below details
      |email|password|
      |    jancilondon@gmail.com |  Janci1gfgvgyvgyvy23      |
      Then user should see "enter the valid password" message




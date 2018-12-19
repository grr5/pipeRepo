Feature: Verify admin can see the list of available users and can activate or de-activate

#  Background:
#    Given admin is on login page
#    When admin enters email as "email", password as "password"
##    When admin enters email as "email_test", password as "password_test"
#    And admin clicks on log in button
#    Then admin should login and see dashboard page


  @login
    Scenario: Admin can login successfully with valid details
    Given admin is on login page
    When admin enters email as "email", password as "password"
#    When admin enters email as "email_test", password as "password_test"
    And admin clicks on log in button
    Then admin should login and see dashboard page

    @negative_login
  Scenario Outline: : Admin can login

    Given admin is on login page
    When admin enters email "<email>", password "<password>"
    And admin clicks on log in button
    Then admin should login and see dashboard page

      Examples:
      |email            | password|
      |admin@gmail.com  |admin       |
      |ad@gmail.com     |admin@123    |
      |hchgdc@gmail.com |hdghdvvv    |
      |admin@gmail.com   |admin@123  |

      @user
    Scenario: admin should be able to see available user list

        Given admin is on login page
#        When admin enters email as "email", password as "password"
        When admin enters login details as below
        |email|password|
        |admin@gmail.com|admin@123|
        |jhggg|jkhjkhhkj|
        And admin clicks on log in button
        Then admin should login and see dashboard page
      Given admin is on dashboard page
      When admin clicks on user link
      Then admin should see the available user list successfully

        @user_active
        Scenario Outline: admin should be able to activate or de-activate a user

          Given admin is on dashboard page
          When admin clicks on user link
          Then admin should see usersListPage
          And admin search for a user with "<user_email>"in search field
          And admin selects activate type "<active_type>"
          Then the user "<user_email>" status "<active_type>" should be updated successfully

          Examples:
          |user_email|active_type|
          |email     |InActive  |
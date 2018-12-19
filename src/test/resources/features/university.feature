
@university
Feature: Verify admin can register and edit university

  Background:
    Given admin is on login page
    When admin enters email as "email", password as "password"
    And admin clicks on log in button
    Then admin should login and see dashboard page
    And admin clicks on university link

    @ravi
  @university_mandate
  Scenario Outline: : admin should be able to add university with mandatory fields successfully

    Given admin is on universityList page
    When admin clicks on register university link
    Then admin should see register university page
    When admin enters university name "<university>", domain "<domain>" and add image as "<image>"
    Then admin clicks on add_button
    And the added university "<university>" should be shown in the university list page

    Examples:
    |university   |domain   |image|
    |randomData|randomData|C:/Users/Ravi/Desktop/waga.jpg|

  @university_duplicate
  Scenario Outline: admin should not be able to add already existed university

      Given admin is on universityList page
      When admin clicks on register university link
      Then admin should see register university page
      When admin enters university name "<university>", domain "<domain>" and add image as "<image>"
      Then admin clicks on add_button
      And admin should see error message as "Oops!University is already Existing.."

      Examples:
        |university   |domain   |image|
        |gghhhgh      |hjvvvghv |C:/Users/Ravi/Desktop/waga.jpg|



  @university_negative
  Scenario Outline: admin should not be able to add university without mandatory fields

    Given admin is on universityList page
    When admin clicks on register university link
    Then admin should see register university page
    When admin enters university name "<university>", domain "<domain>" and add image as "<image>"
    Then admin clicks on add_button
    And admin should see a validation message as "Please fill this field"

    Examples:
      |university   |domain   |image|
      |             |hjvvvghv |C:/Users/Ravi/Desktop/waga.jpg|


  @university_active_deactive
  Scenario Outline: : admin should be able to de-activate a university successfully

    Given admin is on universityList page
    When admin search university "<university>" in search field
    And admin selects university active-type "<active_type>"
    Then the university "<active_type>" should be changed

    Examples:
      |university   |active_type   |
      |sai academy university-3|Active|

  @university_edit
  Scenario Outline: : admin should be able to edit already existed university with mandatory fields successfully

    Given admin is on universityList page
    When admin search university "<university>" in search field
    Then admin selects edit option
    When admin enters university name "<edited-university>", domain "<edited-domain>" and add image as "<edited-image>"
    Then admin clicks on add_button
    And the added university "<university>" should be shown in the university list page

    Examples:
      |university   |edited-university|edited-domain   |edited-image|
      |sai academy university-3|new university|new domain|C:/Users/Ravi/Desktop/waga.jpg|
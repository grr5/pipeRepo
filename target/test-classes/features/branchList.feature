@branch
Feature: Verify admin can register and edit a branch

  Background:
    Given admin is on login page
    When admin enters email as "email", password as "password"
    And admin clicks on log in button
    Then admin should login and see dashboard page
    And admin clicks on branch list

    @ravi
    @branch_mandatory
    Scenario Outline: admin should be able to register branch with mandatory fields successfully

      Given admin is on branch list page
      When admin clicks on register branch link
      Then admin should see add vendor branch page
      When admin select vendor "<vendor_List>", branch_name "<branch_name>", "<branch_email>", "<password>", "<address1>", "<latitude>", "<longitude>", "<city>", "<phone_number>"
      And admin clicks on add button
      Then the branch should be added successfully and the added branch "<branch_name>" should show in branch list

      Examples:
      |vendor_List | branch_name|branch_email|password|address1|latitude|longitude|city|phone_number|
      |wagamama_ravi|East ham branch1 |eastham@gmail.com|eastham|43, rudland, eastham|17.45|16.17|London|4564567564|
#      |wagamama_ravi|Stratford branch  |stratford@gmail.com |stratford |43, rudland, stratford |17.45|16.17|London|4564567564|

  @branch_negative
  Scenario Outline: admin should not be able to add vendor-branch without mandatory fields

    Given admin is on branch list page
    When admin clicks on register branch link
    Then admin should see add vendor branch page
    When admin select vendor "<vendor_List>", branch_name "<branch_name>", "<branch_email>", "<password>", "<address1>", "<latitude>", "<longitude>", "<city>", "<phone_number>"
        And admin clicks on add button
        Then admin should see a validation message "<Error_Message>"

    Examples:
      |vendor_List | branch_name|branch_email|password|address1|latitude|longitude|city|phone_number|Error_Message|
      |Pret A MANGER| |eastham@gmail.com|eastham|43, rudland, eastham|17.45|16.17|London|4564567564|Please fill in this field|
      |Pret A MANGER|Ilford  | |ilford |43, rudland, ilford |17.45|16.17|London|4564567564|Please fill in this field|



  @branch_edit
  Scenario Outline: admin should be able to edit a vendor-branch details with mandatory fields

      Given admin is on branch list page
      When admin enters vendor-branch name "<branch_name_to_edit>" in search field
      And selects edit button
    When admin select vendor "<vendor_List>", branch_name "<branch_name>", "<branch_email>", "<password>", "<address1>", "<latitude>", "<longitude>", "<city>", "<phone_number>"
      And admin clicks on add button
      Then the branch should be updated successfully and the updated branch "<branch_name>" should show in branch list

      Examples:
        |vendor_List | branch_name|branch_email|password|address1|latitude|longitude|city|phone_number|branch_name_to_edit|
        |Pret A MANGER|Stratford-pret |eastham@gmail.com|eastham|new address|17.45|16.17|London|4564567564|EastHam|



  @branch_all
  Scenario Outline: admin should be able to register branch with all fields successfully

    Given admin is on branch list page
    When admin clicks on register branch link
    Then admin should see add vendor branch page
    When admin select vendor "<vendor_List>", branch_name "<branch_name>", "<branch_email>", "<password>", "<address1>", "<address2>" "<latitude>", "<longitude>", "<area>" "<city>", "<phone_number>"
    And admin clicks on add button
    Then the branch should be added successfully and the added branch "<branch_name>" should show in branch list

    Examples:
      |vendor_List | branch_name|branch_email|password|address1|address2|latitude|longitude|area|city|phone_number|
    |Pret A MANGER|Stratford-pret|strt@gmail.com|stratford|43, rudland, Strat|43, rudland, strat 2|17.45|16.17|UK|London|4564567564|


    Scenario Outline:



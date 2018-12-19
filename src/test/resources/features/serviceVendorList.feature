@service_Vendor_List
Feature: Verify admin can see all available service vendor list and category and subcategory list

  Background:
    Given admin is on login page
    When admin enters email as "email", password as "password"
    And admin clicks on log in button
    Then admin should login and see dashboard page
    And admin clicks on service vendor list link

    @ravi
    @service_Vendor_List_Details
  Scenario Outline: admin should be able to see service vendor details
    Given admin is on service vendor list page
    When admin search service vendor name "<vendor_name>" in search field
    And admin selects wished service vendor name "<vendor_name>"
    Then admin should see all available service vendor details

    Examples:
    |vendor_name|
    |Banana apps |

   @service_Vendor_List_negative
  Scenario Outline: admin should not be able to see service vendor details-negative
    Given admin is on service vendor list page
    When admin search for not existed service vendor name "<vendor_name>" in search field
    And admin should see an error message as  "No matching records found"
    Then admin should  not see all available service vendor details

    Examples:
      |vendor_name|
      |Banana apps |
     |jkdhvjkhdk   |


     @service_Vendor_List_activate
  Scenario Outline: admin should be able to activate or deactivate a service vendor successfully

      Given admin is on service vendor list page
      When admin search service vendor name "<vendor_name>" in search field
      And admin selects active-type "<active-type>"
      Then the service vendor "<vendor_name>" active type "<active-type>" should be updated successfully

      Examples:
      |vendor_name|active-type|
      |Banana apps|Active     |


       @service_Vendor_List_services
      Scenario Outline: admin should be able to see available vendor services successfully

        Given admin is on service vendor list page
        When admin search service vendor name "<vendor_name>" in search field
        When admin selects vendor services
        Then the available services should display

        Examples:
        |vendor_name|
        |Banana apps |
  @service_Vendor_List_services_negative
  Scenario Outline: admin should  not  able to see vendor services

    Given admin is on service vendor list page
    When admin search vendor name "<vendor_name>" in search field
    And admin selects vendor services
    When admin search non existed vendor service name "<vendor service name>"
    Then admin should see the error message "No matching records found" display

    Examples:

      |vendor_name|vendor service name|
      |Banana apps |ghjfjdjkjkjk      |

  @service_Vendor_List_services_category
  Scenario Outline: admin should be able to activate or deactivate for catergory and subcategory

    Given admin is on service vendor list page
    When admin search service vendor name "<vendor_name>" in search field
    When admin selects vendor services
    And admin search for category "<category name >",sub category "<sub category name >"
    And admin selects active-type "<active-type>"
    Then the service category "<category name >",sub category "<sub category name >" active type "<active-type>" should be updated



    Examples:
      |vendor_name|category name| sub category name|
      |Banana apps |catering    |cocktail          |

  @service_Vendor_List_services_registered_users
  Scenario Outline: admin should be able to see available registered users

    Given admin is on service vendor list page
    When admin search service vendor name "<vendor_name>" in search field
    When admin selects registered users
    Then admin should see the list of registered users succssfully




    Examples:
      |vendor_name|
      |Banana apps|


  @service_Vendor_List_services_registered_users_negative
  Scenario Outline: admin should not be able to see registered users

    Given admin is on service vendor list page
    When admin search service vendor name "<vendor_name>" in search field
    When admin selects registered users
    And admin search for non existed registered users "<unregistered user name>"in search field
    Then admin should  see the error message "No matching records found" display


    Examples:
      |vendor_name|unregistered user name|
      |Banana apps|  hgfhhggj     |


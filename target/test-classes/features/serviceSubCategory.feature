Feature: Admin can able to see, add and edit sub category types

  Background:
    Given admin is on login page
    When admin enters email as "email", password as "password"
    And admin clicks on log in button
    Then admin should login and see dashboard page
    And admin clicks on service sub category page

    @ravi
    @service_sub_category
    Scenario Outline: Admin should be able to add service sub category type with mandatory fields successfully
      Given admin is on service sub category list page
      When admin selects add service sub category
      Then admin should see add service sub category page
      When admin selects service category type "<service_Category_Name>"
      And admin enters service sub category details "<sub_Category_Name>", "<sub_category_img>"
      Then the service sub category type "<sub_Category_Name>" should be added successfully

      Examples:
      |service_Category_Name|sub_Category_Name|sub_category_img|
#      |IT Consulting        |Providing Jobs   |C:/Users/Ravi/Desktop/Project/job.jpg|
#      |IT Consulting        |IT Support       |C:/Users/Ravi/Desktop/Project/itsupport.jpg|
      |IT Consulting        |online classes       |C:/Users/Ravi/Desktop/Project/itsupport.jpg|
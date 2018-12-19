@service_category
Feature: Verify admin can add and edit service category

  Background:
    Given admin is on login page
    When admin enters email as "email", password as "password"
    And admin clicks on log in button
    Then admin should login and see dashboard page
    And admin clicks on service category page

  @service_category_mandate
  Scenario Outline: admin should be able to add service category with mandatory fields successfully

    Given admin is on service_category_list page
    When admin selects add service category
    Then admin should see "add service category" page
    When admin enters category name "<Category_Name>", category description "<category_description>", category image "<category_image>", category cover image "<category_cover_image>", category video link "<category_video_link>"
    And admin clicks on submit button
#    Then the service category should be added successfully
    Then the service category "<Category_Name>" should be added successfully shown in category list

    Examples:
      | Category_Name | category_description | category_image                      | category_cover_image                | category_video_link |
      | IT Consulting |IT consulting services| C:/Users/Ravi/Desktop/Project/it1.jpg | C:/Users/Ravi/Desktop/Project/itcover.jpg | www.youtub.com |


  @service_category_mandate_negative
  Scenario Outline: admin should not able to add service category without mandatory fields

    Given admin is on service_category_list page
    When admin selects add service category
    Then admin should see "add service category" page
    When admin enters category name "<Category_Name>", category description "<category_description>", category image "<category_image>", category cover image "<category_cover_image>", category video link "<category_video_link>"
    And admin clicks on submit button
#    Then the service category should be added successfully
    Then admin should see a validation message as "Please fill this field"

    Examples:
      | Category_Name | category_description | category_image                      | category_cover_image                | category_video_link |
      | new category3 |                      | C:/Users/Ravi/Desktop/images/a2.jpg | C:/Users/Ravi/Desktop/images/a2.jpg | www.youtub.com      |
      | new category3 |                      | C:/Users/Ravi/Desktop/images/a2.jpg |                                     | www.youtub.com      |

  @service_category_mandate_edit
  Scenario Outline: admin should be able to edit service category with mandatory fields successfully

    Given admin is on service_category_list page
    When admin enters category name "<Category_Name>" in search field
    Then admin selects edit button
    When admin enters new category name "<Edited_Category_Name>", new category description "<Edited_category_description>", new category image "<Edited_category_image>", new category cover image "<Edited_category_cover_image>", new category video link "<Edited_category_video_link>"
    And admin clicks on submit
    Then the service category "<Edited_Category_Name>" should be updated successfully

    Examples:
      | Category_Name  | Edited_Category_Name    | Edited_category_description     | Edited_category_image               | Edited_category_cover_image         | Edited_category_video_link |
      | Fashion Design | edited Fashion Design-1 | this is new description new new | C:/Users/Ravi/Desktop/images/a2.jpg | C:/Users/Ravi/Desktop/images/a2.jpg | www.youtub.com             |

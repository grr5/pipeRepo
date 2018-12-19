Feature: Vendor mobile app
  Scenario: signup as a new vendor
    Given vendor open vendorapp
    When vendor click on sighup button
    And vendor enter the below details
    |company name|email|phone|password|retype password|

    Then vendor should be successfully signup

  Scenario: loggin new vendor first time
    Given vendor open vendorapp
    When vendor enter the below details
      |email|password|
      |qajanci@gmail.com|janci123|
    Then vendor should see the vendor details page
    When vendor enter the below details
    |upload profile pic|cover image|youtubeurl|description|address|city|state|
    Then vendor should be successfully loggin

    Scenario: vendor can edit profile
      Given vendor is on the vendor homepage
      When vendor select profile from more option
      And vendor select edit profile

      Scenario: vendor can change password
        Given vendor is on the vendor homepage
        When vendor select profile from more option
        And vendor select change password
        When vendor enter the below details
        |old password|new password|confirm password|
        And vendor click the save button
        Then vendor should see the "passward changed successfully" message




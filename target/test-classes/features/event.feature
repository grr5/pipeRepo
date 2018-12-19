Feature: verify admin can add a event and edit event
  @janci
  Scenario Outline: admin  should be able to add  an event with mantatory field
    Given admin is on login page
    When admin enters email as "email", password as "password"
    And admin clicks on log in button
    Then admin should login and see dashboard page
    Given admin is on vendorlist page
    When admin  add the event for vendor with name "<vendor name>"
    And admin can see the list of events page
    And admin can click on add event
    Then admin can see the creat event page
    When admin enters the event details as "<event name>","<event description>","<event start time>","<event end time>","<lognitude>","<event start date>","<event end date>","<event category>","<address>","<city>","<latitude>","<terms and conditions>","<image>"
    Then admin should able to see the added event "<event name>"
    Examples:
    |vendor name|event name|event description|event start time|event end time|lognitude|event start date|event end date|event category|address|city|latitude|terms and conditions|image|
#    |a_gosia2   |chrismas party|fun          |09:00           |06:57         |51.5653832|11/11/2018     |12/11/2018    |Celebration   |east   |london|-0.0000000|18+             |C:\Users\Ravi\Desktop\Project\image.jpg|
    |a_gosia2   |chrismas party5|fun          |09:00           |06:57         |51.5653832|11/11/2018     |12/11/2018    |Celebration   |east   |london|-0.0000000|18+             |C:\Users\Ravi\Desktop\Project\image.jpg|


    @ravi
    @test1
    Scenario: admin  should be able to add  an event with mantatory field
      Given admin is on login page
      When admin enters email as "email", password as "password"
      And admin clicks on log in button
      Then admin should login and see dashboard page

  @dataBase
  Scenario: admin  should be able to add
      Given admin is on vendorlist page
      When admin add the event for vendor
      |vendor|
      |a_gosia2|
      And admin can see the list of events page
      And admin can click on add event
      Then admin can see the creat event page
      When admin enters the event details
        |vendor name|event name|event description|event start time|event end time|lognitude|event start date|event end date|event category|address|city|latitude|terms and conditions|image|
        |a_gosia2   |chrismas part|fun          |09:00           |06:57         |51.5653832|11/11/2018     |12/11/2018    |Celebration   |east   |london|-0.0000000|18+             |C:\Users\Ravi\Desktop\Project\image.jpg|
        |a_gosia2   |chrismas part1|fun          |09:00           |06:57         |51.5653832|11/11/2018     |12/11/2018    |Celebration   |east   |london|-0.0000000|18+             |C:\Users\Ravi\Desktop\Project\image.jpg|

      Then admin should able to see the added event "<event name>"

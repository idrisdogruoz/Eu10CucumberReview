Feature: Vytrack application login test



  @wip
  Scenario:Happy login test
    Given user in  on login page
    When user  enters "user1" and "UserUser123" as credentials
    Then user  is  on the  dashboard page

Feature: 
   Bookcart application

  Scenario: 
    Login should be success

    #Given open chrome browser
    And User should naviagate to the application
    And User click on the login link button
    And User enter the username as siva143
    And User enter the passwword as Siva12345
    When user click on login button
    And loginn should be success
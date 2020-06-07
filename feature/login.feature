Feature:My Account Login feature
  Description:This feature will test login functionality
  Scenario: Login with valid username and password
    Given Open Browser
    When Enter the url "http://practice.automationtesting.in/"
    And click on My Account Menu
    And Enter registered username and password
    And Click on login Button
    Then User Must successfully login to application


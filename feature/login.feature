#Feature:My Account Login feature
 # Description:This feature will test login functionality
  #Scenario: Login with valid username and password
#    Given Open Browser
#    When Enter the url "http://practice.automationtesting.in/"
#    And click on My Account Menu
#    And Enter registered username and password
#    And Click on login Button
#    Then User Must successfully login to application

#Feature:My Account Login feature
#  Description:This feature will test login functionality
#  Scenario: Login with valid username and password
#    Given Open Browser
#    When Enter the url "http://practice.automationtesting.in/"
#    And click on My Account Menu
#    And Enter registered username "abcd.1234@gmail.com" and password "Zqfy4w@N8ecqs@P"
#    And Click on login Button
#    Then User Must successfully login to application

#Feature:My Account Login feature
#  Description:This feature will test login functionality
#  Scenario Outline: Login with valid username and password
#    Given Open Browser
#    When Enter the url "http://practice.automationtesting.in/"
#    And click on My Account Menu
#    And Enter registered username "<username>" and password "<password>"
#    And Click on login Button
#    Then verify login
#    Examples:
#      |username | password  |
#      |abcd.1234@gmail.com |Zqfy4w@N8ecqs@P|
#      |abcd.1234@gmail.com |Zqfy4w@N8ecqs@Pqrst|
#      |abcd.123456@gmail.com |Zqfy4w@N8ecqs@P|
#      |abcd.123456@gmail.com |Zqfy4w@N8ecqs@Pqrst|

#Feature:My Account Login feature
#  Description:This feature will test login functionality
#  Scenario: Login with valid username and password
#    Given Open Browser
#    When Enter the url "http://practice.automationtesting.in/"
#    And click on My Account Menu
#    And Enter registered username and password
#      |abcd.1234@gmail.com |Zqfy4w@N8ecqs@P|
#    And Click on login Button
#    Then User Must successfully login to application

Feature:My Account Login feature
  Description:This feature will test login functionality
  Scenario: Login with valid username and password
    Given Open Browser
    When Enter the url "http://practice.automationtesting.in/"
    And click on My Account Menu
    And Enter registered username and password
      |username            | password  |
      |abcd.1234@gmail.com |Zqfy4w@N8ecqs@P|
      |abcd.1234@gmail.com |Zqfy4w@N8ecqs@P|
    And Click on login Button
    Then User Must successfully login to application


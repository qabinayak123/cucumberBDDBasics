Cucumber Basics
===============
Generally 2 types of framework encountered in Automation.
1.Predefined Framework
2.UserDefined Framework

Predefined Framework
--------------------
1.Junit
2.TestNG
3.Cucumber
etc.

UserDefined Framework
----------------------
1.Data Driven Framework 2.Keyword Driven Framework 3.Hybrid Framework etc.

Further we can classify framework as TDD and BDD

TDD:The execution focuses and starts from Test case directly.ex:JUnit,TestNG.
     As this starts from test and code directly people need to no coding to understand the test cases.So its difficult 
     Non tech people to go through TDD framework.
 
BDD:The execution focuses on and starts from feature file.Which defines the scenario and steps to test that scenario.
     e.g Cucumber.These scenarios written in plain simple language which can be understood by non tech people like product managers.
     To specify steps in feature file we need to use a special language, called as Gherkin.

Feature File
-------------
Feature file contains all the feature of the application.
e.g: Application: ebanking
            Features: Login To application----->Steps
                      Add Customer------------->Steps
                      Edit Customer------------>Steps
                      -----------
                      -----------

Important Keywords used in Gherkin Langauge:
--------------------------------------------
Feature-Describe the feature of the application

Senario-Describe the scenarios for  particular feature

Given-Pre-requisite

When-Test steps

And-To continue steps

Then-expected

Feature File---->Step Definitions---->Test Runner

Cucumber Options
----------------
features-The path of the feature files

glue-The path to step definition files

format-To generate different types of reporting

monochrome-Display the console output in readable format.

strict-It will check if any step is not defined in step definition file.

dryRun-To check the mapping is proper between feature file and step definition file.

plugin-create report in html and Json/xml format.

e.g TestRunner

@Runwith(Cucumber.class)
@CucumberOptions(
   features = "feature",
   
   glue="stepDefinitions",
   
   dryRun=false,
   
   monochrome = true,
   
   strict = true,
   
   plugin={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}
   
) 
Data Driven Testing in Cucumber
-------------------------------
1.Using Scenario OutLine and example
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
Code:
/*    @When("Enter registered username {string} and password {string}")
    public void enter_registered_username_and_password(String usr, String pwd) {
        driver.findElement(By.id("username")).sendKeys(usr);
        driver.findElement(By.id("password")).sendKeys(pwd);
    }*/
2.Using dataTable with single input
Feature:My Account Login feature
  Description:This feature will test login functionality
  Scenario: Login with valid username and password
    Given Open Browser
    When Enter the url "http://practice.automationtesting.in/"
    And click on My Account Menu
    And Enter registered username and password
      |abcd.1234@gmail.com |Zqfy4w@N8ecqs@P|
    And Click on login Button
    Then User Must successfully login to application
 Code:
      @When("Enter registered username and password")
       public void enter_registered_username_and_password(DataTable credentials) {
           // Write code here that turns the phrase above into concrete actions
           // For automatic transformation, change DataTable to one of
           // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
           // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
           // Double, Byte, Short, Long, BigInteger or BigDecimal.
           //
           // For other transformations you can register a DataTableType.
           List<List<String>> data=credentials.asLists();
           driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
           driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
       }   
3.2.Using dataTable with multiple input     
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
 Code:
     @When("Enter registered username and password")
     public void enter_registered_username_and_password(DataTable credentials) {
         List<Map<String,String>> data=credentials.asMaps();
         driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
         driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
     }  
Cucumber Tags and Hooks
------------------------
Tags:-By using tagging feature we can execute/ignore specific test scenarios from a fetaure file.

feature file
@SanityTest
  Scenario: Verify Login
    Given This is a valid login test

  @SanityTest @EndToEndTest
  Scenario: Verify Logout
    Given This is a logout Test

  @RegressionTest
  Scenario: Verify search
    Given This is a serach test

  @RegressionTest @EndToEndTest
  Scenario: Verify Advance search
    Given This is advanced search test
Test Runner class Need to add tags
 tags = {"@SanityTest,@RegressionTest"} //will execute sanity or regression tags test  
 tags = {"@SanityTest","@RegressionTest"} //will execute sanity and regression tags test 
 tags={"~@SanityTest"} //will ignore the tags
   
Hooks:-@Before and @After

CUCUMBER FAQs
-------------
1>Explain cucumber briefly?
Cucumber is a tool that is based on BDD.The main aim of BDD is to make various project roles such as BA,QA,Developers etc.
,understand the application without diving deep into technical aspects.  

2>What is the lang used by Cucumber?

Gherkin is the lang used for cucumber.Simple english representation of the application behaviour.Gherkin lang uses several 
keywords to describe the behaviour of application such as Feature,Scenario,Scenario Outline,Given,When,Then etc.

3>What is meant by Feature file?
A feature file must provide a high level description of an application Under Test.The first line of the feature file must 
start with the keyword Feature following description of the AUT.
A feature file may include multiple scenarios within the same file.A feature file has the extension .feature

4>What are te various key words used in Cucumber for writing a scenario?
Given,When,Then,And

5>What is the purpose of using Scenario Outline in Cucumber?
Scenario Outline is a way of parameterization of scenarios.This is ideally used when the same scenario needs to be executed 
for multiple set of data,however the test steps remain the same.Scenario Outline must followed by the Keyword "Examples",which
Specify the set of values for each parameter.

6>What programming language used by Cucumber?
Cucumber tool provides support for multiple programming languages such as java,.Net,Ruby etc.It can also be integrated 
with multiple tools such as Selenium.

7>What is the purpose of Step definition file in cucumber?
A step definition file in Cucumber is used to segregate the feature files from the underlying code.
Each step of the feature file can be mapped to a corresponding method on the step definition file.
While feature files are written in an easily understandable lang such as Gherkin,Step definition files are written in 
programming lang such as Java ,.net etc.

8>What are the major advantages of Cucumber framework?
Cucumber is an Opensource tool.Plain text representation makes it easier for non technical users to understand the scenarios.
It bridges the communication gap between various project stake holders such as BA,Developers and QA.Automation test cases developed using cucumber are easier to maintain.
Easy to integrate with other tool.

9>Provide an example of feature file using Cucumber?
Feature:My Account Login feature
  Description:This feature will test login functionality
  Scenario: Login with valid username and password
    Given Open Browser
    When Enter the url 
    And click on My Account Menu
    And Enter registered username and password
    And Click on login Button
   Then User Must successfully login to application

10>Provide and Scenario Outline example in Cucumber?
Scenario Outline:Upload a file
Given The user is on upload file screen.
when user clicks on Browser button.
And user enters <filename> on to upload textbox.
And user clicks on the enter button.
Then verify that the file upload is successful.
Example:
|filename|
|file1|
|file2| 

11>What is the purpose of BDD in the rel world?
BDD is a methodology to understand the functionality of an application in simple plain text representation.
The main aim of BDD framework is to make various project roles such as BA,QA,Developers,Support Team to understand the
application without diving deep in to technical aspects.

12>What is the limit for the maximum number of scenarios that can be incuded in the feature file?
A feature file can contain a maxm of 10 scenarios,but the number can vary from project to project and from Org to Org.
But it is generally adviseable to limit the number of scenarios included in the feature file.

13>What is the use of Background Keyword in Cucumber?
Background keyword is used to group multiple given statements in to a single group.
This is generally used when the same set of given statementsare repeated in each scenario of the feature file.

14>What symbol is used for parameterization in Cucumber?
|- Pipe symbol

15>What is the purpose of examples keyword in Cucumber?
Examples Keyword is used to specify values for each parameter used in the scenario.Scenario Outline keyword must always 
be followed by the Keyword Examples.

16.What is the file extension for feature file?
.feature

17>provide and example of step definition file in cucmber?
@Given("^open chrome browser and lunch the application$")
public void Openbrowser(){
driver=new Chromedriver();
driver.manage().window().Mmximize();
driver.get("www.facebook.com")
}

18>What is purpose of Cucumber Option Tag?
Cucmber Options tag is used to provide a link between the feature files and step definition files.Each step of the 
feature file is mapped to a corresponding method on the step definition file.
Syntax
@CucumberOptions(features="Features",glue={"StepDefinition"})

19>When is Cucumber used in real time?
Cucumber tool is generally used in real time to write acceptance tests for an application.It is generally used by 
non-technical people such as BA and functional testers.

20>What is the maximum number of tseps that are to be written within a scenario?
The maximum number of steps to be written in a scenario is 3-4 steps.



   


                                 
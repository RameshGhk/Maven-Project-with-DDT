# Maven-Project-with-DDT
Maven Project with Data Driven Testing

***************************************************************************************************************************************
# Introduction
## Consider the following user story: 
As a client I want to search for 10 different products and add to the shopping cart of www.Amazon.com.

## Without framework:
Based on the given user story, one has to write 10 test cases to validate the user requirements. In each test case, code has to be written to find the search box element, to send keys and click on search option. 
Once the product is searched, again code has to be written for finding add to shopping cart element.
As a results there is a lot of code duplication and increases the efforts required to write automation. Down the line it is difficult to maintain as number of test cases increases.

## With framework:
One can to write re-usable methods to find search box element, send keys, click on search link and add to shopping cart element. These methods can be re-used to search for 10 different products. This way of doing will result in:

Defining the company’s / Team’s way of doing things.

Common and structured standards of coding.

Every member of the team should follow the same standards.

Less efforts required to write automation.

Easy to maintain.

Increase in speed and accuracy of automation process.

## Page Object Model 
It is a design pattern to create Object Repository for web UI elements.

One page class for each web page in the application.

Page class – finds the web elements of the web page.

Page class- contains page methods which perform actions on those web elements.

## Advantages of  Page Object Model

Makes our code cleaner and easy to understand.

Easy to visualize each step of scenario, view and edit test cases intuitively.

Shorten the learning curve for testers and helps QA teams to meet timelines.

Reduce the redundancy of the code.

Re-usability of code.

# About the project
Maven Project with TestNG-Test automation framework is developed using selenium and Java to automate 
the product searching, adding to shopping cart and validating the added items in the shopping cart of Amazon.
Page Objects pattern with Data driven testing method is used to:
There is no hardcoding in code files. The input required to invoke the broswer instance are passed through properties file.
Diiferent sets of inputs are passed to test cases using DataProviderClass and excel.

## Project Maven-Project-with-DDT consists of:

1)basicsetup package:
  Consists a Generic class "BaseClass" where test set up and test tear down methods are defined. This class can be used in any
  other test class to pass the driver instance with all the required inputs like broswer, url and login details etc to execute the test

2)pageobjects package:
  All page classes are written under this package. 
  All the methods that are defined to find and send the required keys to perform action on  web elements, can be re used in test classes   to perform the test.
  
3)testclass package:
  All the test cases are wriiten in test class which read input data from DataProviderClass or Excel to perform the test.

***************************************************************************************************************************************
# How to run test
Test can be easily executeable with few changes and with just two clicks

pre-requisits
Install Java and set up.
Install Maven and set up

1) Provide all the required inputs in the properties file that is "testdata.properties"
Inputs like 
-->driver type and driver path to invoke the browser
-->url to invoke

2) Provide the "testdata.properties" file path in the "BaseClass".

3) Navigate to the project folder using cmd or terminal and run the below commands

mvn compile

mvn test

****************************************************************************************************************************************
# Reports
HTML reports like emailable reort.html, index.html are generated under target folder. 
These reports are very useful to analyse the results in a quick and more convenient way.

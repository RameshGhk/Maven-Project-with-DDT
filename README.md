# Maven-Project-with-DDT
Maven Project with Data Driven Testing

***************************************************************************************************************************************
## About the project
Maven Project with TestNG-Test automation framework is developed using selenium and Java to automate 
the product searching, adding to shopping cart and validating the added items in the shopping cart of Amazon.

Page Objects pattern with Data driven testing method is used to:

==> Have consistency in the coding
==> Avoid redundancy in the coding (code duplication)
==> Avoid hard coding

There is no hardcoding in code files. 
The input required to invoke the broswer instance are passed through properties file.
Diiferent sets of inputs are passed to test cases using DataProviderClass and excel
All the inputs are passed through properties file

Project Maven-Project-with-DDT consists of:

1) basicsetup package

2)pageobjects package
  All page classes are written under this package
  
3)testclass package

***************************************************************************************************************************************
## How to run test
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
## Reports
HTML reports like emailable reort.html, index.html are generated under target folder. 
These reports are very useful to analyse the results in a quick and more convenient way.

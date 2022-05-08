
Feature: JBK Offline Website

Scenario Outline: Create User
Given User is on LoginPage
When User enters valid credentials
Then User should be on Dashboard Page
When User clickes on user side tab
Then User should be on UserPage links and clicks on Add user btn
When User enter data in all mandatory fields "<username>", "<mobile>","<email>","<course>","<gender>","<state>","<password>","<friendmobile>"
Then user gets the alert msg for sucesfully creating user


 Examples: 
| username  | mobile  | email          |course   |gender|state      |password|friendmobile|
| Anish     | 7878785 | anish@Test.com |Java     |Male  |Maharashtra|6767676767|456789876787|
| Shane     | 98985454 | Shane@Test.com |Python     |Male  |HP|12345gghg76|423487667878|
     

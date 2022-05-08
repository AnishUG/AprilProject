Feature: JBK Offline Application

Scenario Outline: Login with Valid Credentials

Given User is on Login Page
When User enter correct "<username>" and "<password>"
Then user should navigate to Dashboard page

Examples:
|username            |password  |
|kiran@gmail.com  |123456|


Scenario Outline: Login with InValid Credentials

Given User is on Login Page
When User enter incorrect "<username>" and "<password>"
Then user should get error msg and keeps on Login Page

Examples:
|username            |password  |
|Andy@gmail.com   |667bbn|
|Shane@Test.com   |32565y|

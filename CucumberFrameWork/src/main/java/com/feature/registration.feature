Feature: JBK Offline Website

Scenario Outline: Registration of user

Given user is on Registration Page
When user enters all mandatory fields "<Name>","<Mobile>","<Email>","<Password>"
Then Alert msg should get displayed

Examples:

|Name|Mobile|Email|Password|
|Anish|78787878|an@Test.com|8778787878|


Scenario Outline: Validation for Registration of user

Given user is on Registration Page
When user miss to enter data in any fields "<Name>","<Mobile>","<Email>","<Password>"
Then Error msg should get displayed

Examples:

|Name|Mobile|Email|Password|
|Anish|78787878|an@Test.com||
||78787878|an@Test.com|676676767|



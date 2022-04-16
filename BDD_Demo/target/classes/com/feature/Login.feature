Feature: JBK Offline application

@Login

Scenario Outline: Login Test

Given user is on login page

When user enter "<uname>" and "<pass>"

Then user should be on home page

When user enters invalid "<username>" and "<password>"

Then user should be on login page

Examples:
|uname            |pass  |
|kiran@gmail.com  |123456|
|mangesh@gmail.com|qwerty|
|neelam@gmail.com |sfdjjl|

@User

Scenario Outline: Users Test

Given user is on login page

When user enter credentials

When user clicks on User button

Then user should be on User link

When user clicks on Add User Button

Then user should be Add user page

When user enter "<Username>", "<Mobile>","<Email>","<Courses>","<Gender>","<State>","<Password>","<FriendMobile>"

Then user see a alert msg

Examples:
|Username|Mobile   |Email      |Courses|Gender|State      |Password|FriendMobile|
|Anish   |898989898|an@test.com|Java   |Male  |Maharashtra|88776787|678786567677|
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "JBK Offline application",
  "description": "",
  "id": "jbk-offline-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login Test",
  "description": "",
  "id": "jbk-offline-application;login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cuname\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should be on login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "jbk-offline-application;login-test;",
  "rows": [
    {
      "cells": [
        "uname",
        "pass"
      ],
      "line": 18,
      "id": "jbk-offline-application;login-test;;1"
    },
    {
      "cells": [
        "kiran@gmail.com",
        "123456"
      ],
      "line": 19,
      "id": "jbk-offline-application;login-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2273884700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Login Test",
  "description": "",
  "id": "jbk-offline-application;login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter \"kiran@gmail.com\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should be on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_login_page()"
});
formatter.result({
  "duration": 1026702700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kiran@gmail.com",
      "offset": 12
    },
    {
      "val": "123456",
      "offset": 34
    }
  ],
  "location": "LoginStepDefs.user_enter_and(String,String)"
});
formatter.result({
  "duration": 1121198400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 7000500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 21
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 38
    }
  ],
  "location": "LoginStepDefs.user_enters_invalid_and(String,String)"
});
formatter.result({
  "duration": 44496200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#email\"}\n  (Session info: chrome\u003d100.0.4896.88)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-JETEBKU\u0027, ip: \u0027192.168.43.253\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.88, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\anish\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59456}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 40b3c0c7692669d78333cc904eb5838d\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat com.stepdefs.LoginStepDefs.user_enters_invalid_and(LoginStepDefs.java:71)\r\n\tat ✽.When user enters invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"(Login.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 61045700,
  "status": "passed"
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "jbk-offline-application;login-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22,
      "id": "jbk-offline-application;login-test;;1"
    },
    {
      "cells": [
        "mangesh@gmail.com",
        "qwerty"
      ],
      "line": 23,
      "id": "jbk-offline-application;login-test;;2"
    },
    {
      "cells": [
        "neelam@gmail.com",
        "sfdjjl"
      ],
      "line": 24,
      "id": "jbk-offline-application;login-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1250249800,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Login Test",
  "description": "",
  "id": "jbk-offline-application;login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cuname\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters invalid \"mangesh@gmail.com\" and \"qwerty\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should be on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_login_page()"
});
formatter.result({
  "duration": 777475700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cuname\u003e",
      "offset": 12
    },
    {
      "val": "\u003cpass\u003e",
      "offset": 26
    }
  ],
  "location": "LoginStepDefs.user_enter_and(String,String)"
});
formatter.result({
  "duration": 349216100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 6807700,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cJavaByKiran | [Dashboard]\u003e but was:\u003cJavaByKiran | [Log in]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.stepdefs.LoginStepDefs.user_should_be_on_home_page(LoginStepDefs.java:65)\r\n\tat ✽.Then user should be on home page(Login.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "mangesh@gmail.com",
      "offset": 21
    },
    {
      "val": "qwerty",
      "offset": 45
    }
  ],
  "location": "LoginStepDefs.user_enters_invalid_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 71288900,
  "status": "passed"
});
formatter.before({
  "duration": 1623003300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Login Test",
  "description": "",
  "id": "jbk-offline-application;login-test;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cuname\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters invalid \"neelam@gmail.com\" and \"sfdjjl\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should be on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_login_page()"
});
formatter.result({
  "duration": 842737500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cuname\u003e",
      "offset": 12
    },
    {
      "val": "\u003cpass\u003e",
      "offset": 26
    }
  ],
  "location": "LoginStepDefs.user_enter_and(String,String)"
});
formatter.result({
  "duration": 343927600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 8061800,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cJavaByKiran | [Dashboard]\u003e but was:\u003cJavaByKiran | [Log in]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.stepdefs.LoginStepDefs.user_should_be_on_home_page(LoginStepDefs.java:65)\r\n\tat ✽.Then user should be on home page(Login.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "neelam@gmail.com",
      "offset": 21
    },
    {
      "val": "sfdjjl",
      "offset": 44
    }
  ],
  "location": "LoginStepDefs.user_enters_invalid_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 66046200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Users Test",
  "description": "",
  "id": "jbk-offline-application;users-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@User"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user enter credentials",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user clicks on User button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user should be on User link",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user clicks on Add User Button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user should be Add user page",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user enter \"\u003cUsername\u003e\", \"\u003cMobile\u003e\",\"\u003cEmail\u003e\",\"\u003cCourses\u003e\",\"\u003cGender\u003e\",\"\u003cState\u003e\",\"\u003cPassword\u003e\",\"\u003cFriendMobile\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "user see a alert msg",
  "keyword": "Then "
});
formatter.examples({
  "line": 46,
  "name": "",
  "description": "",
  "id": "jbk-offline-application;users-test;",
  "rows": [
    {
      "cells": [
        "Username",
        "Mobile",
        "Email",
        "Courses",
        "Gender",
        "State",
        "Password",
        "FriendMobile"
      ],
      "line": 47,
      "id": "jbk-offline-application;users-test;;1"
    },
    {
      "cells": [
        "Anish",
        "898989898",
        "an@test.com",
        "Java",
        "Male",
        "Maharashtra",
        "88776787",
        "678786567677"
      ],
      "line": 48,
      "id": "jbk-offline-application;users-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1581526600,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Users Test",
  "description": "",
  "id": "jbk-offline-application;users-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@User"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user enter credentials",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user clicks on User button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user should be on User link",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user clicks on Add User Button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user should be Add user page",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user enter \"Anish\", \"898989898\",\"an@test.com\",\"Java\",\"Male\",\"Maharashtra\",\"88776787\",\"678786567677\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "user see a alert msg",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_login_page()"
});
formatter.result({
  "duration": 919991200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_enter_credentials()"
});
formatter.result({
  "duration": 1198437500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_clicks_on_User_button()"
});
formatter.result({
  "duration": 246950600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_User_link()"
});
formatter.result({
  "duration": 5956000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_clicks_on_Add_User_Button()"
});
formatter.result({
  "duration": 271311900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_Add_user_page()"
});
formatter.result({
  "duration": 4750800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anish",
      "offset": 12
    },
    {
      "val": "898989898",
      "offset": 21
    },
    {
      "val": "an@test.com",
      "offset": 33
    },
    {
      "val": "Java",
      "offset": 47
    },
    {
      "val": "Male",
      "offset": 54
    },
    {
      "val": "Maharashtra",
      "offset": 61
    },
    {
      "val": "88776787",
      "offset": 75
    },
    {
      "val": "678786567677",
      "offset": 86
    }
  ],
  "location": "LoginStepDefs.user_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 935265700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_see_a_alert_msg()"
});
formatter.result({
  "duration": 8950600,
  "status": "passed"
});
formatter.after({
  "duration": 4215270900,
  "status": "passed"
});
});
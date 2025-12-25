Feature: Login,Registration and PasswordRecovery 

Scenario Outline:
Given user is on Ecommerce register page
When user select appropriate gender 
And Firstname as <FirstName> , LastName as <LastName> and Email as <Email>
And Password as <Password> and Confirm Password <CnfPassword>
Then user should able to register and logout succusesfully

Examples:

| FirstName | LastName | Email        | Password | CnfPassword |
| Harshit   | Pande    | hp@gmail.com | HP@123   | HP@123      |
| Rutvik    | Patil    | rp@gmail.com | RP@123   | RP@123      |

@Login
Scenario:
Given user is on Ecommerce main page
When user go to login
And enter Invalid email as <Email> and password as <Password> and click on login
Then user should able login succusesfully 

Examples:
| Email        | Password |
| so@gmail.com | So@1234  |
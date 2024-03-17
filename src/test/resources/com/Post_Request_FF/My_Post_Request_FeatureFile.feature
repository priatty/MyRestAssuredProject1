@regression
Feature: Post request testing1

Scenario: 1post request validation
Given create user with data
Then validate user created
Then validate user ID have non null value

@smoke
Scenario: 2post request validation
Given create user with data
Then validate user created
Then validate user ID have non null value


Scenario: 3post request validation
Given create user with data from file
Then validate user created
Then validate user ID have non null value

@smoke
Scenario: 4post request validation
Given create user "Priyanka" with data from file
Then Validate all headers

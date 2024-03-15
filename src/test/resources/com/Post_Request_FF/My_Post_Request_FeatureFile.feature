Feature: Post request testing

Scenario: post request validation
Given create user with data
Then validate user created
Then validate user ID have non null value


Feature: Validation For Book Store Data

Scenario: 1Test Git Pocket Guide is Present in response Json
Given hit the book store Api
Then Validate As Status Code 
Then Validate Git Pocket Guide is Present
Then Learning JavaScript Design Patterns is Present


Scenario: 2 Test Book is Present in response Json
Given hit the book store Api
Then Validate As Status Code
Then validate "Git Pocket Guide" at jsonpath "books[0].title" title present
Then validate "Learning JavaScript Design Patterns" at jsonpath "books[1].title" title present
Then validate "Designing Evolvable Web APIs with ASP.NET" at jsonpath "books[2].title" title present
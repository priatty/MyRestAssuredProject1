Feature: 1Validation for bookstore data using data driven

Scenario Outline: 1Validate Data in json response with Data table
Given Hit the book store API
Then validate as status code
Then validate data <ExpValue> from <jsonpath> response
Examples:
	| ExpValue                  | jsonpath            |
  |	'Git Pocket Guide'			  |	'books[0].title'		|
  |	'A Working Introduction'	|	'books[0].subTitle'	|
  |	'Richard E. Silverman'	  |	'books[0].author'		|
	|	'Richard E.'	            |	'books[0].author'		|  
	
#last one Richard E. is written for marking  one test case fail

	
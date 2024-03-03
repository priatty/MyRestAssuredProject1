Feature: Validation for bookstore data using data table

Scenario: Validate Data in json response with Data table
Given Hit the book store API
Then validate as status code
Then validate data from response
  |	Git Pocket Guide			  |	books[0].title		|
	|	A Working Introduction	|	books[0].subTitle	|
	|	Richard E. Silverman		|	books[0].author		|
	|	No Starch Press  				|	books[7].publisher|


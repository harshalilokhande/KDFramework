Feature: This feature read data from excelsheet in cucumber 
 Scenario Outline: 
 Given I have two numbers from <row-number>
 When I add them
 Then Verify if result is prime
 
 Examples:
 |row-number|
 |1|
 |2|
 |3|
 |4|
 |5|
 |6|
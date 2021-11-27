
Feature: This feature describes the parameterization in cucumber
Scenario: Passing single numeric parameter to the Gherkin steps
  Given I have integers 51 and 6
  When I add them
  Then print result
  
@Regression
Scenario: Passing single string parameter to the Gherkin steps
   Given I have "India" and "India"
   Then print them in alphabetic order
   
   @Smoke @Regression
   Scenario: Passing float parameter to the Gherkin steps
   Given I have two float numbers 2.34 and 4.35
   Then add both float numbers
   And Print float result
   
   
   Scenario: Passing list of parameters to the Gherkin steps
   Given I have following numbers:
   |10|
   |23|
   |43|
   |25|
   |54|
   |21|
   Then print all numbers from list
   
   Scenario: Passing table of parameters to the gherkin step
   Given I have following table:
   |first list|11|12|13|14|15|16|
   |second list|17|18|19|20|21|22|
   Then print all numbers from table
   
   
   Scenario Outline:
 Given I have <num1> and <num2>
 When I add them
 Then Verify if result is prime
 
 Examples:
 |num1|num2|
 |9   |2   |
 |13  |3   |
 |2   |7   |
 |5   |4   |
 |6   |12  |
 |11  |92  |
 
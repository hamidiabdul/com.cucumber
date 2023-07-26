

Feature: login feature test for saucedemo

  
    Scenario Outline:  Succcessfull login with credential
    Given I will open ChromeDriver
    When I will write username "<username>"
    When I will write password "<password>"
    And I will click login button
    And I will be redirected to the page reads products
    Then i will refresh the page
    Then I will close Browser

	     Examples:
	     |password    |username     |
	     |secret_sauce|standard_user|
	     
	     
	
 

Feature: Login functinality scenarios 

@Login @One 
Scenario: Verify whether the User is able to login with valid credentials 
	Given I launch the application 
	And I naviage to Account Login page 
	When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran" 
	Then I should see that the User is able to successfully login 
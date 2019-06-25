Feature: Leaftap application 
Background:
Given Start application 
Scenario: Login with Demosalesmanager 
	Given Enter the username as Demosalesmanager 
	And Enter the password as crmsfa 
	When I click on the login button 
	Then verify login is success 
	
Scenario: Login with DemoCsr 
	Given Enter the username as DemoCSR
	And Enter the password as crmsfa 
	When I click on the login button 
	Then verify login is success
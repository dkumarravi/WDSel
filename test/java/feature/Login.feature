Feature: Leaftap application

Scenario Outline: Login with Demosalesmanager 
	Given Enter the username as "<username>"
	And Enter the password as "<pas>" 
	When I click on the login button 
	Then verify login is success 
	Examples: 
		|username|pas|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
		
		#Scenario: Login with DemoCsr 
		#	Given Enter the username as DemoCSR
		#	And Enter the password as crmsfa 
		#	When I click on the login button 
		#	Then verify login is success
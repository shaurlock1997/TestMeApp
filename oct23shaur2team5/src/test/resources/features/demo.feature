Feature: Sign-up
	Sign-up should be quick and friendly
	
Scenario: Successful sign-up 
	New users should get a confirmation mail and be greeted
	personally by the site once signed in.
	
	Given I have chosen to sign up
	When I sign up with valid details 
	Then I should receive a confirmation email
	And I should see a personalized greeting message
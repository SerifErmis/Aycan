
Feature: Default



	Scenario: CLONE - 1.Verify user can add mentions about only department employees.

	Scenario: Verify user can not add mentions about department.
		When user click add mention button
		And user click employees and departments button
		And user click one of the department for selection
		And user click send message button
		Then user should not see any mention in the message
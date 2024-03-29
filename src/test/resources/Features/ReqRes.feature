Feature: ReqRes API Automation

Scenario: List All Users
Given User should be "https://reqres.in/api/users?page=2"
When user perform GET operation
Then user can validate status code
And user can validate API response
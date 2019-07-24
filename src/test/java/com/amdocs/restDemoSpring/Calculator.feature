Feature: A calculator consuming a REST web service
	Scenario: Addition with REST api
	Given A REST URL as "http://localhost:8040/api/v1/add?first=4&second=6"
	When i invoke the api
	Then the output is 10.0

	Scenario: Subtract with REST api
	Given A REST URL to subtract as "http://localhost:8040/api/v1/subtract?first=10&second=6"
	When i invoke the api to subtact
	Then the output is 4.0

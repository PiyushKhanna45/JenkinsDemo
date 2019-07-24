package com.amdocs.restDemoSpring;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, classes = RestDemoSpringApplication.class)
public class Steps {
	
	private String url;
	private double result;
	
	@Given("A REST URL as {string}")
	public void aRESTURLAs(String url) {
	    this.url = url;
	}

	@When("i invoke the api")
	public void iInvokeTheApi() {
	    RestTemplate template = new RestTemplate();
	    result = template.getForObject(url, Double.class);
	}

	@Then("the output is {double}")
	public void theOutputIs(Double expectedResult) {
	   assertEquals(expectedResult, result, 0.01);
	}

	@Given("A REST URL to subtract as {string}")
	public void aRESTURLToSubtractAs(String url) {
	   this.url = url;
	}

	@When("i invoke the api to subtact")
	public void iInvokeTheApiToSubtact() {
		 RestTemplate template = new RestTemplate();
		 result = template.getForObject(url, Double.class);
	}


}

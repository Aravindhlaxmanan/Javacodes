package Stepdefinition;

import io.cucumber.java.en.Given;

public class hooksandtags {
	
	@Given("I want to print first scenario")
	public void i_want_to_print_first_scenario() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("firststep");
	}

	@Given("I want to print second scenario")
	public void i_want_to_print_second_scenario() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("secondstep");
	}

}

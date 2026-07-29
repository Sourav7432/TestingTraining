package stepDefinition;

import io.cucumber.java.en.*;

public class LoginSteps3 {

    @When("User clicks Login")
    public void clickLogin() {

        System.out.println("Clicked Login");

    }

    @Then("Validation message should appear")
    public void validation() {

        System.out.println("Validation Message");

    }

}
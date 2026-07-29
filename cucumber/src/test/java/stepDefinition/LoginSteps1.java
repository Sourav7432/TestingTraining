package stepDefinition;

import io.cucumber.java.en.Given;

public class LoginSteps1 {

    @Given("User opens Google")
    public void user_opens_google() {
        System.out.println("Google opened successfully");
    }
}
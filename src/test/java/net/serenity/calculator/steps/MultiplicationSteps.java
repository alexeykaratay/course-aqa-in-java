package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MultiplicationSteps {

    @Steps
    UserSteps user;

    @Given("I have searched for <search_query>")
    public void givenIHaveSearchedForCalculator(@Named("search_query") String search_query) {
        user.searchForCalculator(search_query);
    }

    @When("I multiply the <first_number> by the <second_number>")
    public void whenIMultiplyTheNumbers(@Named("first_number") Double firstNumber, @Named("second_number") Double secondNumber) {
        user.produceMultiplication(firstNumber, secondNumber);
    }

    @Then("I get the <composition>")
    public void thenIGetTheComposition(@Named("composition") Double composition) {
        user.checkResultMultiplication(composition);
    }
}
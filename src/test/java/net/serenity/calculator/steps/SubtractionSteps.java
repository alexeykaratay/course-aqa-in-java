package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SubtractionSteps {
    @Steps
    UserSteps user;

    @Given("I have searched for <search_query>")
    public void givenIHaveSearchedForCalculator(@Named("search_query") String search_query) {
        user.searchForCalculator(search_query);
    }

    @When("I deduct the <first_number> by the <second_number>")
    public void whenIDoSubtractionOfNumbers(@Named("first_number") Double firstNumber, @Named("second_number") Double secondNumber) {
        user.produceSubtraction(firstNumber, secondNumber);
    }

    @Then("I get the <difference>")
    public void thenIGetTheDifference(@Named("difference") Double difference) {
        user.checkResultSubtraction(difference);
    }

}

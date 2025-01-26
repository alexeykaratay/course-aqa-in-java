package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DivisionSteps {

    @Steps
    UserSteps user;

    @Given("I have searched for <search_query>")
    public void givenIHaveSearchedForCalculator(@Named("search_query") String searchQuery) {
        user.searchForCalculator(searchQuery);
    }

    @When("I devide the <first_number> by the <second_number>")
    public void whenIDevideTheNumbers(@Named("first_number") Double firstNumber, @Named("second_number") Double secondNumber) {
        user.produceDivision(firstNumber, secondNumber);
    }

    @Then("I get the <quotient>")
    public void thenIGetTheQuotient(@Named("quotient") Double quotient) {
        user.checkResultDivision(quotient);
    }
}
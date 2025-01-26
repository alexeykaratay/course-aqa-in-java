package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DivisionByZeroSteps {

    @Steps
    UserSteps user;

    @Given("I have searched for <search_query>")
    public void givenIHaveSearchedForCalculator(@Named("search_query") String searchQuery) {
        user.searchForCalculator(searchQuery);
    }

    @When("I devide the <first_number> by zero")
    public void whenIDevideByZero(@Named("first_number") Double firstNumber) {
        user.produceDivision(firstNumber, 0);
    }

    @Then("I get <infinity>")
    public void thenIGetInfinity(@Named("infinity") String infinity) {
        user.checkResultDivisionByZero(infinity);
    }
}

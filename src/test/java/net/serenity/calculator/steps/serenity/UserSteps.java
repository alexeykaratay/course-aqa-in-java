package net.serenity.calculator.steps.serenity;

import net.serenity.calculator.pages.GoogleCalculatorPage;
import net.serenity.calculator.pages.GoogleSearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class UserSteps {
    @Steps
    GoogleSearchPage searchPage;

    @Steps
    GoogleCalculatorPage calculatorPage;

    @Step
    public void searchForCalculator(String searchQuery) {
        searchPage.open();

        searchPage.searchForString(searchQuery);
        try {
            searchPage.submitForm();
        } catch (Exception ex) {
        }
        searchPage.titleShouldMatch(searchQuery);
    }

    @Step
    public void produceAddition(double num1, double num2) {

        calculatorPage.addition(num1, num2);
    }

    @Step
    public void produceSubtraction(double num1, double num2) {
        calculatorPage.subtraction(num1, num2);
    }

    @Step
    public void produceDivision(double num1, double num2) {
        calculatorPage.division(num1, num2);
    }

    @Step
    public void produceMultiplication(double num1, double num2) {
        calculatorPage.multiplication(num1, num2);
    }

    @Step
    public void checkResultAddition(Double sum) {
        calculatorPage.checkResult(sum);
    }

    @Step
    public void checkResultSubtraction(Double difference) {
        calculatorPage.checkResult(difference);
    }

    @Step
    public void checkResultMultiplication(Double composition) {
        calculatorPage.checkResult(composition);
    }

    @Step
    public void checkResultDivision(Double quotient) {
        calculatorPage.checkResult(quotient);
    }

    @Step
    public void checkResultDivisionByZero(String infinity) {
        calculatorPage.checkResult(infinity);
    }
}

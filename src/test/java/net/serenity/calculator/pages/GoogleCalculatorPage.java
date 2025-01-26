package net.serenity.calculator.pages;

import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class GoogleCalculatorPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"cwbt43\"]/div/span")
    WebElementFacade zeroButton;

    @FindBy(xpath = "//*[@id=\"cwbt33\"]/div/span")
    WebElementFacade oneButton;

    @FindBy(xpath = "//*[@id=\"cwbt34\"]/div/span")
    WebElementFacade twoButton;

    @FindBy(xpath = "//*[@id=\"cwbt35\"]/div/span")
    WebElementFacade threeButton;

    @FindBy(xpath = "//*[@id=\"cwbt23\"]/div/span")
    WebElementFacade fourButton;

    @FindBy(xpath = "//*[@id=\"cwbt24\"]/div/span")
    WebElementFacade fiveButton;

    @FindBy(xpath = "//*[@id=\"cwbt25\"]/div/span")
    WebElementFacade sixButton;

    @FindBy(xpath = "//*[@id=\"cwbt13\"]/div/span")
    WebElementFacade sevenButton;

    @FindBy(xpath = "//*[@id=\"cwbt14\"]/div/span")
    WebElementFacade eightButton;

    @FindBy(xpath = "//*[@id=\"cwbt15\"]/div/span")
    WebElementFacade nineButton;

    @FindBy(xpath = "//*[@id=\"cwbt46\"]/div/span")
    WebElementFacade plusButton;

    @FindBy(xpath = "//*[@id=\"cwbt36\"]/div/span")
    WebElementFacade minusButton;

    @FindBy(xpath = "//*[@id=\"cwbt26\"]/div/span")
    WebElementFacade multiplicationButton;

    @FindBy(xpath = "//*[@id=\"cwbt16\"]/div/span")
    WebElementFacade devideButton;

    @FindBy(xpath = "//*[@id=\"cwbt45\"]/div/span")
    WebElementFacade equalsButton;

    @FindBy(xpath = "//*[@id=\"cwbt44\"]/div/span")
    WebElementFacade dotButton;

    @FindBy(xpath = "//*[@id=\"cwos\"]")
    WebElementFacade res;

    @Step
    public void checkResult(double expectedRes) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(res);
        assertEquals(Double.parseDouble(res.getText()), expectedRes, 0.0001);
    }

    @Step
    public void checkResult(String expectedRes) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(res);
        assertEquals(res.getText(), expectedRes);
    }

    @Step
    public void addition(Double num1, Double num2) {
        Map<Character, WebElementFacade> hashMap = createMapOfButtons();
        inputNumber(hashMap, num1);
        plusButton.click();
        inputNumber(hashMap, num2);
        equalsButton.click();
    }

    @Step
    public void multiplication(Double num1, Double num2) {
        Map<Character, WebElementFacade> hashMap = createMapOfButtons();
        inputNumber(hashMap, num1);
        multiplicationButton.click();
        inputNumber(hashMap, num2);
        equalsButton.click();
    }

    @Step
    public void division(Double num1, Double num2) {
        Map<Character, WebElementFacade> hashMap = createMapOfButtons();
        inputNumber(hashMap, num1);
        devideButton.click();
        inputNumber(hashMap, num2);
        equalsButton.click();
    }

    @Step
    public void subtraction(Double num1, Double num2) {
        Map<Character, WebElementFacade> hashMap = createMapOfButtons();
        inputNumber(hashMap, num1);
        minusButton.click();
        inputNumber(hashMap, num2);
        equalsButton.click();
    }

    private Map<Character, WebElementFacade> createMapOfButtons() {
        Map<Character, WebElementFacade> hashMap = new HashMap<Character, WebElementFacade>();
        hashMap.put('0', zeroButton);
        hashMap.put('1', oneButton);
        hashMap.put('2', twoButton);
        hashMap.put('3', threeButton);
        hashMap.put('4', fourButton);
        hashMap.put('5', fiveButton);
        hashMap.put('6', sixButton);
        hashMap.put('7', sevenButton);
        hashMap.put('8', eightButton);
        hashMap.put('9', nineButton);
        hashMap.put('.', dotButton);
        return hashMap;
    }

    private void inputNumber(Map<Character, WebElementFacade> hashMap, Double num) {
        for (int i = 0; i < num.toString().length(); i++) {
            if (hashMap.containsKey(num.toString().charAt(i))) {
                hashMap.get(num.toString().charAt(i)).click();
            }
        }
    }
}

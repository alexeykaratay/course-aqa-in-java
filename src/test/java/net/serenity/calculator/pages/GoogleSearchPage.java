package net.serenity.calculator.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class GoogleSearchPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"lst-ib\"]")
    WebElementFacade search;

    public GoogleSearchPage() {
        setDefaultBaseUrl("http://www.google.com");
    }

    @Step
    public void searchForString(String searchString) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(search);
        search.sendKeys(searchString, Keys.ENTER);
    }

    @Step
    public void submitForm() throws Exception {
        search.submit();
    }

    @Step
    public void titleShouldMatch(String matchTitle) {
        assertTrue(this.getTitle().contains(matchTitle));
    }
}

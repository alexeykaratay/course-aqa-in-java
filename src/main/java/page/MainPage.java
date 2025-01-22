package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class='pay__wrapper']")
    private WebElement blockOnlinePay;
    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement blockTitleOnlinePay;
    @FindBy(xpath = "//img[@alt='Visa']")
    private WebElement logoVisa;
    @FindBy(xpath = "//img[@alt='Verified By Visa']")
    private WebElement logoVerifiedByVisa;
    @FindBy(xpath = "//div[@class='pay__partners']//img[@alt='MasterCard']")
    private WebElement logoMastercard;
    @FindBy(xpath = "//div[@class='pay__partners']//img[@alt='MasterCard Secure Code']")
    private WebElement logoMastercardSecureCode;
    @FindBy(xpath = "//div[@class='pay__partners']//img[@alt='Белкарт']")
    private WebElement logoBelcard;
    @FindBy(xpath = "//button[@id='cookie-agree']")
    private WebElement buttonAcceptCookie;
    @FindBy(xpath = "//a[contains(text(), 'Подробнее о сервисе')]")
    private WebElement buttonMoreAboutService;
    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement fieldPhone;
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement fieldSum;
    @FindBy(xpath = "//button[@class='button button__default']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//span[contains(text(),'Оплата')]")
    private WebElement payWindow;
    @FindBy(xpath = "iframe[@class='bepaid-iframe']")
    private WebElement iframe;

    public MainPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public MainPage scrolToBlock() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blockOnlinePay);
        return this;
    }

    public boolean logoVisaIsEnabled() {
        return logoVisa.isEnabled();
    }

    public boolean logoVerifiedByVisaIsEnabled() {
        return logoVerifiedByVisa.isEnabled();
    }

    public boolean logoMastercardIsEnabled() {
        return logoMastercard.isEnabled();
    }

    public boolean logoMastercardSecureCodeIsEnabled() {
        return logoMastercardSecureCode.isEnabled();
    }

    public boolean logoBelcardIsEnabled() {
        return logoBelcard.isEnabled();
    }

    public String getTextFromBlockTitle() {
        return blockTitleOnlinePay.getText();
    }

    public MainPage acceptCookie() {
        if (buttonAcceptCookie.isDisplayed()) {
            buttonAcceptCookie.click();
            return this;
        }
        return this;
    }

    public void clickButtonMoreAboutService() {
        buttonMoreAboutService.click();
    }

    public void inputPhoneNumber(String string) {
        fieldPhone.sendKeys(string);
    }

    public void inputSum(String string) {
        fieldSum.sendKeys(string);
        fieldSum.submit();
    }

    public void clickContinue() {
        buttonContinue.click();
    }

    public boolean payWindowIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOf(payWindow));
        return payWindow.isDisplayed();
    }
}

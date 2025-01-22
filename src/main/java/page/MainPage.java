package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends Page {

    public static final String MAIN_PAGE_URL = "https://www.mts.by/";
    public static final String TITLE_OF_BLOCK_PAY_ONLINE = "Онлайн пополнение\nбез комиссии";
    public static final String PHONE_NUMBER = "297777777";
    public static final String SUM = "10.00";
    public static final String FIELD_MOBILE_NUMBER = "Номер телефона";
    public static final String FIELD_SUM = "Сумма";
    public static final String FIELD_EMAIL = "E-mail для отправки чека";
    public static final String FIELD_INTERNET_NUMBER = "Номер абонента";
    public static final String FIELD_INSTALLMENT_NUMBER = "Номер счета на 44";
    public static final String FIELD_DEBT_NUMBER = "Номер счета на 2073";

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
    @FindBy(xpath = "//button[@class='btn btn_gray cookie__cancel']")
    private WebElement buttonCancelCookie;
    @FindBy(xpath = "//a[contains(text(), 'Подробнее о сервисе')]")
    private WebElement buttonMoreAboutService;
    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement fieldPhone;
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement fieldSum;
    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement fieldEmail;
    @FindBy(xpath = "//button[@class='button button__default']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//span[contains(text(),'Оплата')]")
    private WebElement payWindow;
    @FindBy(xpath = "//iframe[@class='bepaid-iframe']")
    private WebElement iframe;
    @FindBy(xpath = "//button[@class='select__header']")
    private WebElement typeButton;
    @FindBy(xpath = "//p[contains(text(), 'Домашний интернет')]")
    private WebElement typeInternet;
    @FindBy(xpath = "//p[contains(text(), 'Рассрочка')]")
    private WebElement typeInstallments;
    @FindBy(xpath = "//p[contains(text(), 'Задолженность')]")
    private WebElement typeDebt;
    @FindBy(xpath = "//input[@id='internet-phone']")
    private WebElement fieldInternetNumber;
    @FindBy(xpath = "//input[@id='score-instalment']")
    private WebElement fieldInstallmentsNumber;
    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement fieldDebtNumber;
    @FindBy(xpath = "//span[contains(text(),'BYN')]")
    private WebElement sumHeader;
    @FindBy(xpath = "//span[contains(text(),'Номер')]")
    private WebElement numberHeader;
    @FindBy(xpath = "//button[@class='colored disabled']")
    private WebElement buttonSum;

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

    public MainPage cancelCookie() {
        try {
            buttonCancelCookie.click();
        } catch (NoSuchElementException e) {
        } catch (WebDriverException e) {
            System.out.println("Не удалось кликнуть на кнопку отмены куки: " + e.getMessage());
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

    public String getTextFieldPhoneNumber() {
        return fieldPhone.getAttribute("placeholder");
    }

    public String getTextFieldSum() {
        return fieldSum.getAttribute("placeholder");
    }

    public String getTextFieldEmail() {
        return fieldEmail.getAttribute("placeholder");
    }

    public void clickTypeButton() {
        typeButton.click();
    }

    public void changeTypeForInternet() {
        typeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(typeInternet));
        typeInternet.click();
    }

    public void changeTypeForInstallments() {
        typeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(typeInstallments));
        typeInstallments.click();
    }

    public void changeTypeForDebt() {
        typeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(typeDebt));
        typeDebt.click();
    }

    public String getTextFieldInternetNumber() {
        return fieldInternetNumber.getAttribute("placeholder");
    }

    public String getTextFieldInstallmentNumber() {
        return fieldInstallmentsNumber.getAttribute("placeholder");
    }

    public String getTextFieldDebtNumber() {
        return fieldDebtNumber.getAttribute("placeholder");
    }

    public String getTextSumHeader() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOf(sumHeader));
        return sumHeader.getText();
    }

    public String getTextNumberHeader() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(numberHeader));
        return numberHeader.getText();
    }

    public String getTextSumButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(buttonSum));
        return buttonSum.getText();
    }
}

package page;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

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
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }
}

package page;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static final String MAIN_PAGE_URL = "https://www.mts.by/";
    public static final String TITLE_OF_BLOCK_PAY_ONLINE = "Онлайн пополнение\nбез комиссии";
    public static final String PHONE_NUMBER = "297777777";
    public static final String SUM = "10";
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }
}

package page;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    protected Page() {
        PageFactory.initElements(driver, this);
    }
}

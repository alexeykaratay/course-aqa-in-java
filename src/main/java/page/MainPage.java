package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage extends BasePage {

    BasketPage basketPage = new BasketPage();
    @FindBy(xpath = "//p[@class='product-card__order-wrap']")
    private List<WebElement> addToCartButton;
    @FindBy(xpath = "//div[@class='popup popup-list-of-sizes shown slideUp']")
    private List<WebElement> windowSize;
    @FindBy(xpath = "//label[@class='j-quick-order-size-fake sizes-list__button']")
    private WebElement size;
    @FindBy(xpath = "//h2[@class='product-card__brand-wrap product-card__brand-wrap--no-wrap']")
    private List<WebElement> productName;
    @FindBy(xpath = "//ins[@class='price__lower-price red-price']")
    private List<WebElement> productPrice;
    @FindBy(xpath = "//span[@class='navbar-pc__icon navbar-pc__icon--basket']")
    private WebElement basketButton;

    public MainPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public MainPage clickAddToCartButton(int i) {
        addToCartButton.get(i).click();
        try {
            if (!windowSize.isEmpty()) {
                size.click();
            } else return this;
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден: " + e.getMessage());
        }
        return this;
    }

    public String getName(int i) {
        String name = productName.get(i).getText();
        int slashIndex = name.indexOf('/');
        return name.substring(slashIndex + 1).trim();
    }

    public Integer getPrice(int i) {
        String priceString = productPrice.get(i).getText();
        return Integer.parseInt(priceString.replaceAll(" ₽", "").replace(" ", ""));
    }

    public BasketPage clickBuscketButton() {
        basketButton.click();
        return basketPage;
    }
}

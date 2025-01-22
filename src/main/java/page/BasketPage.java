package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketPage {

    @FindBy(xpath = "//span [@class='good-info__good-name']")
    private List<WebElement> namesOfProducts;
    @FindBy(xpath = "//div[@class='list-item__price-new red-price']")
    private List<WebElement> pricesOfProducts;
    @FindBy(xpath = "//p[@class='b-top__total line']/span/span")
    private WebElement totalPrice;


    public String getName(int i) {
        String name = namesOfProducts.get(i).getText();
        return name;
    }

    public Integer getPrice(int i) {
        String priceString = pricesOfProducts.get(i).getText();
        Integer price = Integer.parseInt(priceString.replaceAll(" ₽", "").replace(" ", ""));
        return price;
    }

    public Integer getTotalPrice() {
        String priceString = totalPrice.getText();
        Integer price = Integer.parseInt(priceString.replaceAll(" ₽", "").replace(" ", ""));
        return price;
    }
}

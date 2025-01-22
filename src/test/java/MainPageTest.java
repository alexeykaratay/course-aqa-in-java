import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;
import service.BasketPageService;

import java.util.Map;

public class MainPageTest extends BaseTest {

    private MainPageService mainPageService = new MainPageService();
    private BasketPageService basketPageService = new BasketPageService();

    @BeforeMethod
    public void openPage() {
        mainPageService.openPage();
    }

    @Test
    public void verifyWildberis() {
        Map<String, Integer> mapGoodsFromMainPage = mainPageService.addGoods();
        Map<String, Integer> mapGoodsFromBasket = basketPageService.verifyGoods();
        Integer sum = mapGoodsFromMainPage.values().stream()
                .mapToInt(Integer::intValue)
                .sum();

        SoftAssert softAssert = new SoftAssert();
        for (String key : mapGoodsFromMainPage.keySet()) {
            softAssert.assertTrue(mapGoodsFromBasket.containsKey(key), "Товар отсутствует: " + key);
            softAssert.assertEquals(mapGoodsFromMainPage.get(key), mapGoodsFromBasket.get(key),
                    "Цены товара " + key + " не равны.");
        }
        softAssert.assertEquals(sum, basketPageService.getTotalPrice(), "Общие суммы не равны");
        softAssert.assertAll();
    }
}

package service;


import page.MainPage;

import java.util.LinkedHashMap;
import java.util.Map;

import static page.BasePage.COUNT_GOODS;
import static page.MainPage.MAIN_PAGE_URL;

public class MainPageService {

    private final MainPage mainPage = new MainPage();

    public MainPageService openPage() {
        mainPage.openPage(MAIN_PAGE_URL);
        return this;
    }

    public Map<String, Integer> addGoods() {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < COUNT_GOODS; i++) {
            mainPage.clickAddToCartButton(i);
            map.put(mainPage.getName(i), mainPage.getPrice(i));
        }
        mainPage.clickBuscketButton();
        return map;
    }
}

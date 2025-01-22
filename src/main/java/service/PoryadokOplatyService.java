package service;

import io.qameta.allure.Step;
import page.PorydokOplatyPage;

public class PoryadokOplatyService {

    PorydokOplatyPage porydokOplatyPage = new PorydokOplatyPage();

    @Step("get current url")
    public String getCurrentUrl() {
        String url = porydokOplatyPage.getCurrentUrl();
        return url;
    }
}

package service;

import io.qameta.allure.Step;
import page.PorydokOplatyBasePage;

public class PoryadokOplatyService {

    PorydokOplatyBasePage porydokOplatyPage = new PorydokOplatyBasePage();

    @Step("get current url")
    public String getCurrentUrl() {
        String url = porydokOplatyPage.getCurrentUrl();
        return url;
    }
}

package service;

import page.PorydokOplatyBasePage;

public class PoryadokOplatyService {
    PorydokOplatyBasePage porydokOplatyPage = new PorydokOplatyBasePage();

    public String getCurrentUrl() {
        String url = porydokOplatyPage.getCurrentUrl();
        return url;
    }
}

package service;

import page.PorydokOplatyPage;

public class PoryadokOplatyService {
    PorydokOplatyPage porydokOplatyPage = new PorydokOplatyPage();

    public String getCurrentUrl() {
        String url = porydokOplatyPage.getCurrentUrl();
        return url;
    }
}

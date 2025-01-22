package service;

import page.MainPage;

import static page.MainPage.MAIN_PAGE_URL;

public class MainPageService {

    private final MainPage mainPage = new MainPage();

    public MainPageService openPage() {
        mainPage.openPage(MAIN_PAGE_URL)
                .scrolToBlock();
        return this;
    }

    public boolean logoVisaIsEnabled() {
        return mainPage.logoVisaIsEnabled();
    }

    public boolean logoVerifiedByVisaIsEnabled() {
        return mainPage.logoVerifiedByVisaIsEnabled();
    }

    public boolean logoMastercardIsEnabled() {
        return mainPage.logoMastercardIsEnabled();
    }

    public boolean logoMastercardSecureCodeIsEnabled() {
        return mainPage.logoMastercardSecureCodeIsEnabled();
    }

    public boolean logoBelcardIsEnabled() {
        return mainPage.logoBelcardIsEnabled();
    }

    public String getTextFromBlockTitle() {
        return mainPage.getTextFromBlockTitle();
    }

    public void clickMoreAboutService() {
        mainPage.clickButtonMoreAboutService();
    }

    public void acceptCookie() {
        mainPage.acceptCookie();
    }

    public void inputForm(String phoneNumber, String sum) {
        mainPage.inputPhoneNumber(phoneNumber);
        mainPage.inputSum(sum);
    }

    public boolean payWindowIsDisplayed() {
        return mainPage.payWindowIsDisplayed();
    }
}

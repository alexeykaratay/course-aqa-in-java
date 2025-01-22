package service;

import io.qameta.allure.Step;
import page.MainPage;

import static page.MainPage.MAIN_PAGE_URL;

public class MainPageService {

    private final MainPage mainPage = new MainPage();

    @Step("Open page")
    public MainPageService openPage() {
        mainPage.openPage(MAIN_PAGE_URL)
                .scrolToBlock();
        return this;
    }

    @Step("verify logo Visa")
    public boolean logoVisaIsEnabled() {
        return mainPage.logoVisaIsEnabled();
    }

    @Step("verify logo Visa")
    public boolean logoVerifiedByVisaIsEnabled() {
        return mainPage.logoVerifiedByVisaIsEnabled();
    }

    @Step("verify logo Mastercard")
    public boolean logoMastercardIsEnabled() {
        return mainPage.logoMastercardIsEnabled();
    }

    @Step("verify logo Mastercard secure")
    public boolean logoMastercardSecureCodeIsEnabled() {
        return mainPage.logoMastercardSecureCodeIsEnabled();
    }

    @Step("verify logo Belcard")
    public boolean logoBelcardIsEnabled() {
        return mainPage.logoBelcardIsEnabled();
    }

    @Step("get title")
    public String getTextFromBlockTitle() {
        return mainPage.getTextFromBlockTitle();
    }

    @Step("click more about service")
    public void clickMoreAboutService() {
        mainPage.clickButtonMoreAboutService();
    }

    @Step("cancel cookie form")
    public void cancelCookie() {
        mainPage.cancelCookie();
    }

    @Step("input form")
    public void inputForm(String phoneNumber, String sum) {
        mainPage.inputPhoneNumber(phoneNumber);
        mainPage.inputSum(sum);
    }

    @Step("verify pay window")
    public boolean payWindowIsDisplayed() {
        return mainPage.payWindowIsDisplayed();
    }

    @Step("get mobile number")
    public String getTextMobileNumber() {
        return mainPage.getTextFieldPhoneNumber();
    }

    @Step("get sum")
    public String getTextFieldSum() {
        return mainPage.getTextFieldSum();
    }

    @Step("get email")
    public String getTextFieldEmail() {
        return mainPage.getTextFieldEmail();
    }

    @Step("change type form for internet")
    public void changeTypeForInternet() {
        mainPage.changeTypeForInternet();
    }

    @Step("change type form for installments")
    public void changeTypeForInstallments() {
        mainPage.changeTypeForInstallments();
    }

    @Step("change type form for debt")
    public void changeTypeForDebt() {
        mainPage.changeTypeForDebt();
    }

    @Step("get internet number")
    public String getTextFieldInternetNumber() {
        return mainPage.getTextFieldInternetNumber();
    }

    @Step("get installment number")
    public String getTextFieldInstallmentNumber() {
        return mainPage.getTextFieldInstallmentNumber();
    }

    @Step("get debt number")
    public String getTextFieldDebtNumber() {
        return mainPage.getTextFieldDebtNumber();
    }

    @Step("get text sum header")
    public String getTextSumHeader() {
        String[] arr = mainPage.getTextSumHeader().split(" ");
        return arr[0];
    }

    @Step("get text number header")
    public String getTextNumberHeader() {
        String[] arr = mainPage.getTextNumberHeader().split(":");
        return arr[2];
    }

    @Step("get text sum button")
    public String getTextSumButton() {
        String[] arr = mainPage.getTextSumButton().split(" ");
        return arr[1];
    }
}

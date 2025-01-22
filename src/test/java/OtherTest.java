import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;

import static page.BasePage.*;

public class OtherTest {

    private MainPageService mainPageService = new MainPageService();

    @BeforeMethod
    public void openPage() {
        mainPageService.openPage();
        mainPageService.cancelCookie();
    }

    @Description("Verify text in fields mobile")
    @Test(testName = "Verify text in fields mobile")
    public void verifyTextInFieldsMobile() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextMobileNumber(), FIELD_MOBILE_NUMBER,
                "Текст поля 'Номер телефона' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Description("Verify text in fields internet")
    @Test(testName = "Verify text in fields internet")
    public void verifyTextInFieldsInternet() {
        mainPageService.changeTypeForInternet();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextFieldInternetNumber(), FIELD_INTERNET_NUMBER,
                "Текст поля 'Номер абонента' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Description("Verify text in fields installments")
    @Test(testName = "Verify text in fields installments")
    public void verifyTextInFieldsInstallments() {
        mainPageService.changeTypeForInstallments();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextFieldInstallmentNumber(), FIELD_INSTALLMENT_NUMBER,
                "Текст поля 'Номер счёта на 44' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Description("Verify text in fields debt")
    @Test(testName = "Verify text in fields debt")
    public void verifyTextInFieldsDebt() {
        mainPageService.changeTypeForDebt();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextFieldDebtNumber(), FIELD_DEBT_NUMBER,
                "Текст поля 'Номер счёта на 2073' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Description("Verify input values")
    @Test(testName = "Verify input values")
    public void verifyInputValues() {
        mainPageService.inputForm(PHONE_NUMBER, SUM);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextSumHeader(), SUM,
                "Сумма не соответствует введенной");
        softAssert.assertEquals(mainPageService.getTextNumberHeader(), "375" + PHONE_NUMBER,
                "Номер телефона не соответствует введенному");
        softAssert.assertEquals(mainPageService.getTextSumButton(), SUM,
                "Сумма не соответствует введенной");
        softAssert.assertAll();
    }
}

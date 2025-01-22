import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;
import service.PoryadokOplatyService;

import static page.BasePage.*;

public class MainPageTest extends BaseTest {

    private MainPageService mainPageService = new MainPageService();
    PoryadokOplatyService poryadokOplatyService = new PoryadokOplatyService();

    @BeforeMethod
    public void openPage() {
        mainPageService.openPage();
        mainPageService.cancelCookie();
    }

    @Description("Verify title of block")
    @Test(testName = "Test title")
    public void verifyTitleOfBlock() {
        Assert.assertEquals(mainPageService.getTextFromBlockTitle(), TITLE_OF_BLOCK_PAY_ONLINE,
                "Заголовок блока не соответствует или отсутствует");
    }

    @Description("Verify logo")
    @Test(testName = "Verify logo")
    public void verifyLogo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPageService.logoVisaIsEnabled(), "Логотип 'Visa' отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoVerifiedByVisaIsEnabled(), "Логотип 'Verified by Visa' отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoMastercardIsEnabled(), "Логотип 'Mastercard' отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoMastercardSecureCodeIsEnabled(), "Логотип 'Mastercard Secure' Code отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoBelcardIsEnabled(), "Логотип 'Belcard' отсутсвуте!");
        softAssert.assertAll();
    }

    @Description("Verify click button more about service")
    @Test(testName = "Verify click button more about service")
    public void verifyClickButtonMoreAboutService() {
        mainPageService.clickMoreAboutService();
        Assert.assertEquals(poryadokOplatyService.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                "Ссылка 'Подробнее о сервисе' не работает");
    }

    @Description("Verify button continue")
    @Test(testName = "Verify button continue")
    public void verifyButtonContinue() {
        mainPageService.inputForm(PHONE_NUMBER, SUM);
        Assert.assertTrue(mainPageService.payWindowIsDisplayed(), "Кнопка 'Продолжить' неисправна");
    }
}

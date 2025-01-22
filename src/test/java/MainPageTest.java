import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;
import service.PoryadokOplatyService;

import static page.MainPage.*;

public class MainPageTest extends BaseTest{

    private MainPageService mainPageService = new MainPageService();
    PoryadokOplatyService poryadokOplatyService = new PoryadokOplatyService();

    @BeforeMethod
    public void openPage() {
        mainPageService.openPage();
    }

    @Test
    public void verifyTitleOfBlock() {
        Assert.assertEquals(mainPageService.getTextFromBlockTitle(), TITLE_OF_BLOCK_PAY_ONLINE,
                "Заголовок блока не соответствует или отсутствует");
    }

    @Test
    public void verifyLogo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPageService.logoVisaIsEnabled(), "Логотип 'Visa' отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoVerifiedByVisaIsEnabled(), "Логотип 'Verified by Visa' отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoMastercardIsEnabled(), "Логотип 'Mastercard' отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoMastercardSecureCodeIsEnabled(), "Логотип 'Mastercard Secure' Code отсутсвуте!");
        softAssert.assertTrue(mainPageService.logoBelcardIsEnabled(), "Логотип 'Belcard' отсутсвуте!");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void verifyClickButtonMoreAboutService() {
        mainPageService.acceptCookie();
        mainPageService.clickMoreAboutService();
        Assert.assertEquals(poryadokOplatyService.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                "Ссылка 'Подробнее о сервисе' не работает");
    }

    @Test(priority = 2)
    public void verifyButtonContinue() {
        mainPageService.acceptCookie();
        mainPageService.inputForm(PHONE_NUMBER, SUM);
        Assert.assertTrue(mainPageService.payWindowIsDisplayed(), "Кнопка 'Продолжить' не активна");
    }
}

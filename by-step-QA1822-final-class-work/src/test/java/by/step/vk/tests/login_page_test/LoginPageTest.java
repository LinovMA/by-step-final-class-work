package by.step.vk.tests.login_page_test;

import by.step.vk.tests.block.BaseUITestsClass;
import by.step.vk.tests.service.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseUITestsClass {

    private LoginService loginService;

    @BeforeEach
    public void openLoginPage ()  {
        driver.navigate().to("https://vk.com/");
    }

    @Test
    public void verifySafeButton (){
    loginService = new LoginService(driver);
        Assertions.assertEquals(false, loginService.getLoginPage().getLoginBlock().checkBoxElement.isDisplayed());
    }
}

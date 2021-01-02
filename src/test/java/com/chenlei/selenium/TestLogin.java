package com.chenlei.selenium;

import com.chenlei.selenium.po.HomePage;
import com.chenlei.selenium.po.SignInPage;
import net.bytebuddy.matcher.ElementMatcher;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;

public class TestLogin {
    @Test
    public void testLogin() {
        ChromeDriver driver = new ChromeDriver();
        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = signInPage.loginValidUser("userName", "password");
        assertThat(homePage.getMessageText(), is("Hello userName"));
    }

    private void assertThat(String messageText, ElementMatcher.Junction<Object> hello_userName) {

    }
}

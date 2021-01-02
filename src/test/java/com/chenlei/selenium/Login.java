package com.chenlei.selenium;


import net.bytebuddy.matcher.ElementMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.bytebuddy.matcher.ElementMatchers.is;

public class Login {
    public void testlogin(){
        ChromeDriver driver = new ChromeDriver();
        driver.findElement(By.name("user_name")).sendKeys("testUser");
        driver.findElement(By.name("password")).sendKeys("my supersecret password");
        driver.findElement(By.name("sign-in")).click();

        // verify h1 tag is "Hello userName" after login
        driver.findElement(By.tagName("h1")).isDisplayed();
        assertThat(driver.findElement(By.tagName("h1")).getText(), is("Hello userName"));
    }

    private void assertThat(String h1, ElementMatcher.Junction<Object> hello_userName) {

    }


}

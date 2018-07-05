package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basics {
    public WebDriver driver;

    @BeforeMethod
    public void openSite() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.gmail.com");
        System.out.println(driver.getTitle());
    }

    public void username(String username) {
        driver.findElement(By.id("identifierId")).sendKeys(username);
        driver.findElement(By.id("identifierNext")).click();
    }

    public void password(String pw) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
        driver.findElement(By.id("passwordNext")).click();
    }

    public void invalidLogin() {
        driver.getPageSource().contains("Wrong password");
    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

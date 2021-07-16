package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        if (text != null) {
            click(locator);
            driver.findElement(locator).sendKeys(Keys.CONTROL + "a");
            driver.findElement(locator).sendKeys(Keys.DELETE);
            driver.findElement(locator).sendKeys(text);
        }
    }
}

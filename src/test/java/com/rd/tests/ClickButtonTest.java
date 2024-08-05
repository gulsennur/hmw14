package com.rd.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class ClickButtonTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.cssSelector("li#item-0")).click();
        driver.findElement(By.cssSelector("button#doubleClickBtn")).click();

        WebElement messageElement = driver.findElement(By.cssSelector("p#doubleClickMessage"));
        String message = messageElement.getText();
        Assert.assertEquals("You have done a double click", message);

        driver.quit();
    }
}

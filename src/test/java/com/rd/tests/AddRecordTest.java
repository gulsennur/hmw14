package com.rd.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class AddRecordTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.cssSelector("button#addNewRecordButton")).click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        firstNameInput.sendKeys("Deneme");

        WebElement lastNameInput = driver.findElement(By.cssSelector("input#lastName"));
        lastNameInput.sendKeys("DENEME");

        WebElement ageInput = driver.findElement(By.cssSelector("input#age"));
        ageInput.sendKeys("29");

        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        emailInput.sendKeys("deneme@example.com");

        WebElement salaryInput = driver.findElement(By.cssSelector("input#salary"));
        salaryInput.sendKeys("5000");

        WebElement departmentInput = driver.findElement(By.cssSelector("input#department"));
        departmentInput.sendKeys("IT");

        driver.findElement(By.cssSelector("button#submit")).click();

        WebElement editButton = driver.findElement(By.cssSelector("div.rt-tr:nth-child(1) > div.rt-td:nth-child(7) > div > button"));
        editButton.click();

        WebElement editFirstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        editFirstNameInput.clear();
        editFirstNameInput.sendKeys("Update_name");

        driver.findElement(By.cssSelector("button#submit")).click(); WebElement editedFirstName = driver.findElement(By.cssSelector("div.rt-tr:nth-child(1) > div.rt-td:nth-child(1)"));
        String editedName = editedFirstName.getText();
        Assert.assertEquals("Update_name", editedName);

        driver.quit();
    }
}

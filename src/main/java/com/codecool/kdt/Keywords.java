package com.codecool.kdt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class Keywords extends Repository {

    private WebDriver driver;

    void openTheBaseUrl() {
        System.setProperty(chromeDriver, chromeDriverProperty);
        driver = new ChromeDriver();
        driver.navigate().to(baseUrl);
        driver.findElement(By.linkText(inputForms)).click();
    }

    void closeDriver() {
        driver.close();
    }


    void navigation() {
        driver.findElement(By.linkText(simpleFormDemo)).click();
    }

    boolean validateNavigation() {
        return driver.findElement(By.id(singleInputFieldId)).isDisplayed();
    }


}

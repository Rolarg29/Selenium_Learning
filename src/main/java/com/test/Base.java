package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Base {
    public static WebDriver driver = WebDriverSingleton.driver;

    public static final String url = "https://rahulshettyacademy.com/locatorspractice/";
    public static final By forgotPass = By.linkText("Forgot your password?");
    public static final By resetButton = By.cssSelector(".reset-pwd-btn");
    public static final By errMessage = By.cssSelector("form p");
    public static final By goLoginBtn = By.cssSelector(".go-to-login-btn");
    public static final By userName = By.cssSelector("#inputUsername");
    public static final By userPassword = By.cssSelector("input[type*='pass']");
    public static final By rightPanel = By.cssSelector(".overlay-panel.overlay-right");
    public static final By checkBox1 = By.id("chkboxOne");
    public static final By checkBox2 = By.xpath("//div/span[2]/input");
    public static final By signInButton = By.xpath("//button[contains(@class,'submit')]");

    public static void click(By locator) {
        driver.findElement(locator).click();
    }

    public static void visit(String url) {
        driver.get(url);
    }

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public static void waitForClickable(By locator) {//creado por mi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForView(By locator) {//creado por mi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForInvisible(By locator) {//creado por mi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static String splitText(String text, String pattern) {
        String[] passwordArray = text.split(pattern);
        return passwordArray[1].split(pattern)[0];
    }

    public static void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }


    public static String getPassword() {
        visit(url);
        click(checkBox1);
        click(checkBox2);
        click(forgotPass);
        waitForClickable(resetButton);
        click(resetButton);
        String passwordText = getText(errMessage);
        return splitText(passwordText, "'");
    }
}

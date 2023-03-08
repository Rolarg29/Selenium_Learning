package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roliz\\Documentos\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        String name = "Rolando";

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();

    }
}

package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        //invoke the web driver and creating a new instance of the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roliz\\Documentos\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        String name = "Rolando";

        //open the website
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //locate the element you want to use and the action (username)  --ID LOCATOR
        driver.findElement(By.id("inputUsername")).sendKeys(name);

        //locate the password input and send the value --NAME LOCATOR
        driver.findElement(By.name("inputPassword")).sendKeys("123456");

        //locate the Sign-In button and click it to perform the action  --CLASSNAME LOCATOR
        driver.findElement(By.className("signInBtn")).click();

        //EXPLICIT WAIT --will wait until the element is visible, also prints out the text of the element   --CSS SELECTOR LOCATOR
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.error")));
        System.out.println(element.getText());

        //Clicks the Forgot password text link
        driver.findElement(By.linkText("Forgot your password?")).click();

        //selects the name input field and fills in the value
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);

        //Selects and fills email input field
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rolurzmguera@gmail.com");

        //Selects and fills phone number input field
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8182838485");

        //wait for the transition to complete
        Thread.sleep(500);//INTERCEPTION ERROR interview question

        //click Reset Login button --CUSTOM CSS SELECTOR LOCATOR
        driver.findElement(By.cssSelector("form div button + button")).click();//(".reset-pwd-btn");

        //get the text from the message
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //click go to login button
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();

        //select username input again
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);

        //select password input again
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        //select both remember and agree terms checkbox
        Thread.sleep(500);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//div/span[2]/input")).click();

        //click the sign-in button
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        //wait for the page to load
        Thread.sleep(1500);

        System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");

        //get the text from the logged in message
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals("You are successfully logged in.", driver.findElement(By.tagName("p")).getText());

        //locating Log out button
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        // //button[text()='Log Out']   xpath only -- locating by text

        driver.close();
    }
}

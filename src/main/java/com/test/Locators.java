package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        //selenium driver will perform action using locators within the HTML elements of the website
        /*
        Locators in HTML elements

        ID
        Xpath
        CSS selector
        name
        Class name
        Tag name
        Link Text
        Partial Link text
         */

        //CSS selector --> tagname.classname / tagname#id
        //CSS selector --> tagname[atrribute="value"] generic syntax
        //CSS selector --> tagname[atrribute="value"]:nth-child(index) generic syntax
        //xpath --> /html/body/div[2]/div[2]/div[2]/

        //invoke the web driver and creating a new instance of the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roliz\\Documentos\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //open the website
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //locate the element you want to use and the action (username)  --ID LOCATOR
        driver.findElement(By.id("inputUsername")).sendKeys("Rolando");

        //locate the password input and send the value --NAME LOCATOR
        driver.findElement(By.name("inputPassword")).sendKeys("123456");

        //locate the Sign-In button and click it to perform the action  --CLASSNAME LOCATOR
        driver.findElement(By.className("signInBtn")).click();

        //implicit wait --will monitor the page for a certain amount of time
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//DEPRECATED

        //find error message with css selector
        //System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        //EXPLICIT WAIT --will wait until the element is visible, also prints out the text of the element   --CSS SELECTOR LOCATOR
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.error")));
        System.out.println(element.getText());

        //Link text locator --must have an anchor tag <a></a>
        driver.findElement(By.linkText("Forgot your password?")).click();
        //driver.findElement(By.xpath("//div[contains(@class,'pwd')]")).click();

        //XPATH LOCATOR //tag-name[@attribute="value"][i] i = index when multiple elements are matching
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rolando");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rolurzmguera@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rolaaaaxxx@gmail.com");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8182838485");//from parent to childs only tag names and index

        //wait for the transition to complete
        Thread.sleep(500);//INTERCEPTION ERROR interview question

        //click Reset Login button --CUSTOM CSS SELECTOR LOCATOR
        driver.findElement(By.cssSelector("form div button + button")).click();//(".reset-pwd-btn");

        //get the text from the message with tagnames (parenttag childtag)
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //click go to login button .classname
        //driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        //select username input again #id
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rolando");

        //select password input again using css selector with regular expression  (partial text)
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        //driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");

        //button[contains(@class,'sign')] -- Regular expression xpath

        //select both remember and agree terms checkbox
        Thread.sleep(500);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//div/span[2]/input")).click();

        //click the sign-in button
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        Thread.sleep(3000);
        driver.findElement(By.className("logout-btn")).click();

        driver.quit();





    }
}

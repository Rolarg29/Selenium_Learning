package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {

        //invoking browser
        //Chrome browser -- Chromedriver -> https://chromedriver.chromium.org/downloads
        //WebDriver -- blank interface

        //webdriver methods + chromedriver class methods
        //ChromeDriver driver = new ChromeDriver();

        //webdriver methods ONLY
        //WebDriver driver1 = new ChromeDriver();

        //selenium will invoke chromedriver.exe --> invoke Chrome browser
        //code --> chromedriver --> chrome browser

        //Code is interpreted by the driver in order to control the browser

        //Chrome browser
        //webdriver.chrome.driver --> chromedriver.exe (value of the path)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roliz\\Documentos\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        //Firefox browser
        //Webdriver.gecko.driver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\roliz\\Documentos\\geckodriver-v0.32.2-win64\\geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();


        //Edge browser
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\roliz\\Documentos\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver2 = new EdgeDriver();


        //common code for all drivers
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");//get method will access the website in the browser through HTTP request
        System.out.println(driver.getTitle());//prints the title of the website
        System.out.println(driver.getCurrentUrl());//prints the url of the website
        Thread.sleep(2000);//wait for page to load
        driver.close();//close the current browser
        //driver.quit();//close ALL associated windows





    }
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginFormTest {
        private WebDriver driver;


        @BeforeSuite
        public void setup() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\roliz\\Documentos\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver(options);
//            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        }

        @Test
        public void testValidLogin() throws InterruptedException {
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
            WebElement emailField = driver.findElement(By.id("username"));
            emailField.sendKeys("rahulshettyacademy");
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("learning");
            WebElement submitButton = driver.findElement(By.id("signInBtn"));
            submitButton.click();
            Thread.sleep(2500);
            String expectedUrl = "https://rahulshettyacademy.com/angularpractice/shop";
            Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        }

        @Test
        public void testInvalidLogin() throws InterruptedException {
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
            WebElement emailField = driver.findElement(By.id("username"));
            emailField.sendKeys("rahulshettyacademy1");
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("erronea");
            WebElement submitButton = driver.findElement(By.id("signInBtn"));
            submitButton.click();
            Thread.sleep(2000);//wait for page to load
            String expectedErrorMessage = "Incorrect username/password.";
            WebElement errorMessage = driver.findElement(By.className("alert"));
            Assert.assertEquals(errorMessage.getText(), expectedErrorMessage);
        }

        @AfterSuite
        public void tearDown() {
            driver.quit();
        }
    }



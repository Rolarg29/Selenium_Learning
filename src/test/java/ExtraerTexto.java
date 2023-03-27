import com.test.WebDriverSingleton;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static com.test.Base.*;
import static java.lang.Thread.*;

public class ExtraerTexto {

    @BeforeSuite
    public void setUp(){
        WebDriverSingleton.initialize();
    }

    @Test
    public void extractPassword() throws InterruptedException {
        String password = getPassword();
        click(goLoginBtn);
        type("Rolando", userName);
        type(password, userPassword);
        sleep(500);
        click(signInButton);
    }

    @AfterSuite
    public void tearDown(){
        WebDriverSingleton.quit();
    }



}

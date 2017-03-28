import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Freakanomic on 3/27/17.
 */
public class BrowserTest {

    WebDriver driver;

    @Before
    public void setup(){
        ChromeDriverManager.getInstance().setup();

    }

    @Test
    public void login() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(1000);
        System.out.println("Logged in successfully");
    }

    @After

    public void tearDown(){
        driver.quit();
    }
}

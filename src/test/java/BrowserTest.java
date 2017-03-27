import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Freakanomic on 3/27/17.
 */
public class BrowserTest {

    @Test
    public void login(){
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Logged in successfully");
        //driver.quit();
        driver.close();
        //driver.navigate().to("www.yahoo.com");
    }
}

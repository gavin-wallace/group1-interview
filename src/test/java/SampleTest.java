import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void method(){
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get("https://www.google.com");
    }



}

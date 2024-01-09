package aslan_interviews;

import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Automation {
    @Test
    public void test(){
        Driver.getDriver().get("https://www.google.com");

    }
}

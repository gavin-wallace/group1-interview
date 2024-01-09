package pages.LCP_Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LCP_HomePage {
    @FindBy(xpath = "//a[.='Multiple Windows']")
    public WebElement multipleWindows;

    public LCP_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

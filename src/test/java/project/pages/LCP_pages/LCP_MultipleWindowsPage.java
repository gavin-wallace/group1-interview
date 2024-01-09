package project.pages.LCP_pages;

import project.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LCP_MultipleWindowsPage {

    @FindBy (xpath = "//div[@style='text-align: center;']")
    public WebElement poweredByLoopCampMessage;

    @FindBy (xpath = "//a[.='Click Here']")
    public WebElement clickHereLink;


    public LCP_MultipleWindowsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void main(String[] args) {
        Driver.getDriver().get("https://loopcamp.vercel.app/windows.html");

        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@class='example']"));
        System.out.println(element.getText());

        WebElement element2 = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println(element2.getText());
    }


    /*
#  Validate title is "Windows"
#  Click - click here
#  Switch to new window and validate title
#  */

}

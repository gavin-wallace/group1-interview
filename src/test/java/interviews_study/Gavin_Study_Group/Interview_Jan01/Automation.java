package interviews_study.Gavin_Study_Group.Interview_Jan01;

import interviews_study.Gavin_Study_Group.Interview_Jan01.Pages.DocuportMyUploadsPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static interviews_study.Gavin_Study_Group.Interview_Jan01.Pages.DocuportMyUploadsPage.*;
import static project.Utilities.ConfigurationReader.*;
import static project.Utilities.Driver.*;
import static java.time.Duration.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.testng.Assert.*;

public class Automation {
    /*
    1. Explain the difference among Selenium, Driver, Bonigarcia, Maven, POM file and Browser.
    2. What is Configuration Properties file used for? How do we access it?
    3. Can you create a Singleton class and explain how we use it in automation?
    4. Go to beta.docuport.app website. Login as a Client. From My Uploads take the table
        headers and put them into a list. And do this all using POM model
     */

    WebDriverWait wait;

    @Test
    public void name (){
        getUsername().sendKeys(USERNAME_ClIENT);
        getPassword().sendKeys(PASSWORD);
        getLoginButton().click();

        wait.until(elementToBeClickable(getContinueButton())).click();
        wait.until(elementToBeClickable(getThreeLines())).click();
        wait.until(elementToBeClickable(getMyUploads())).click();

        //List<WebElement> listOfTableHeaders = DocuportMyUploadsPage.getTableHeaders();
        System.out.println(getTableHeaders().size());
    }

    @BeforeMethod
    public void setUp(){
        getDriver();
        getDriver().get(getProperty("docuport.url"));
        new DocuportMyUploadsPage();
        wait = new WebDriverWait(getDriver(), ofSeconds(10));
        assertTrue(getDriver().getTitle().contains("Docuport"));

    }
}

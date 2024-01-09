package interviews_study.Gavin_Study_Group.Interview_Jan01.Pages;

import project.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.*;

public class DocuportMyUploadsPage {

    public static final String USERNAME_ClIENT = "b1g2_client@gmail.com";
    public static final String PASSWORD = "Group2";

    public DocuportMyUploadsPage(){
        initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//label[.='Username or email']//following-sibling::input")
    private static WebElement username;

    @FindBy (xpath = "//label[.='Password']//following-sibling::input")
    private static WebElement password;

    @FindBy (xpath = "//span[.=' Log in ']/..")
    private static WebElement loginButton;

    @FindBy (xpath = "//span[.=' Continue ']/..")
    private static WebElement continueButton;

    @FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-menu theme--light']")
    private static WebElement threeLines;

    @FindBy(xpath = "//span[.='My uploads']")
    private static WebElement myUploads;

    @FindBy (xpath = "//thead[@class= 'v-data-table-header']//th")
    private static List<WebElement> tableHeaders;

    public static WebElement getUsername() {
        return username;
    }
    public static WebElement getPassword() {
        return password;
    }
    public static WebElement getLoginButton() {
        return loginButton;
    }
    public static WebElement getContinueButton() {
        return continueButton;
    }
    public static WebElement getThreeLines() {
        return threeLines;
    }
    public static WebElement getMyUploads() {
        return myUploads;
    }
    public static List<WebElement> getTableHeaders() {
        return tableHeaders;
    }
}

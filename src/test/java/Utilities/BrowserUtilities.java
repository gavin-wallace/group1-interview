package Utilities;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class BrowserUtilities {

    /**
     * validate if driver switched to expected url and title
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author Aslan
     * implements assertion
     *
     */

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle){
        expectedTitle = expectedTitle.toLowerCase();
        expectedUrl = expectedUrl.toLowerCase();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String eachWindow : windowHandles) {
            driver.switchTo().window(eachWindow);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }
        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    public static void switchToWindow (WebDriver driver, String targetTitle){
        String original = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }

        driver.switchTo().window(original);
    }
    /**
     * @param driver
     * @param expectedTitle
     * returns void, assertions implemented
     */
    public static void validateTitle(WebDriver driver, String expectedTitle){
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.titleIs(driver.getTitle()));
        assertTrue(driver.getTitle().contains(expectedTitle));
    }

    /**
     * Click any link from loop practise website
     * @param nameOfPage
     * @author Aslan
     */
    public static void loopLinkClick(String nameOfPage){
        Driver.getDriver().get("https://loopcamp.vercel.app/");
        WebElement link = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfPage + "']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
    }

    /**
     * Moves the mouse to given element
     * @param element on which to hover
     * @author Aslan
     */
    public static void hoverOver(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /** Scrolls down to an element using JavaScript
     * @param element
     * @author Aslan
     */
    public static void scrollToElement(WebElement element){
//    Actions actions = new Actions(Driver.getDriver());
//    actions.scrollToElement(element).perform();
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /** Click on an element using JavaScript
     * @param element
     * @author Aslan
     */
    public static void clickWithJS(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    /** Double Click on an element using JavaScript
     * @param element
     * @author Aslan
     */
    public static void doubleClick(WebElement element){
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }
    /**
     * Waits for the provided element to be visible on the page
     * @param element
     * @param timeToWaitInSec
     * @return
     * @author nadir
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    /**
     * Waits for the provided element to be invisible on the page
     * @param element
     * @param timeToWaitInSec
     * @return
     * @author nadir
     */
    public static void waitForInVisibility(WebElement element, int timeToWaitInSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    /**
     * performs a pause
     * @param seconds
     * @author nadir
     */
    public static void justWait (int seconds){
        try{
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    /**
     Waits for the provided element to be invisible on the page
     @param element
     @param timeToWaitInSec
     @return WebElement
     @author gavin
     */
    public static WebElement waitForClickable (WebElement element, int timeToWaitInSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

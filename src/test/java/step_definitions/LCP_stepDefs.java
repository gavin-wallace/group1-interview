package step_definitions;

import Utilities.BrowserUtilities;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LCP_Pages.LCP_HomePage;
import pages.LCP_Pages.LCP_MultipleWindowsPage;

import java.util.Set;

import static Utilities.Driver.getDriver;
import static org.testng.AssertJUnit.assertTrue;

public class LCP_stepDefs {

    LCP_MultipleWindowsPage lcpObj1 = new LCP_MultipleWindowsPage();
    LCP_HomePage lcpHomePage = new LCP_HomePage();
    @Given("user is on LCP Multiple Windows page")
    public void user_is_on_lcp_multiple_windows_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("lcpHomePage"));
        lcpHomePage.multipleWindows.click();
        // assertTrue(Driver.getDriver().getCurrentUrl().contains("https://loopcamp.vercel.app/windows.html"));
    }
    @Then("validate Powered by Loopcamp message is displayed")
    public void validate_powered_by_loopcamp_message_is_displayed() {
       String actual = lcpObj1.poweredByLoopCampMessage.getText();
       String expected = "Powered by LOOPCAMP";
       assertTrue(actual.contains(expected));
    }
    @Then("url title is as Windows")
    public void url_title_is_as_windows() {
        assertTrue(getDriver().getTitle().contains("Windows"));
    }
    @When("user clicks on Click Here button")
    public void user_clicks_on_click_here_button() {
        BrowserUtilities.waitForClickable(lcpObj1.clickHereLink, 5).click();
    }
    @Then("validate window switch and switched window title")
    public void validate_window_switch_and_switched_window_title() {
        Set<String> windows = Driver.getDriver().getWindowHandles();
        String windowID = Driver.getDriver().getWindowHandle();

        for (String eachWindow : windows) {
            windowID = eachWindow;
        }

        assertTrue(Driver.getDriver().switchTo().window(windowID).getTitle().contains("New Window"));
    }
}

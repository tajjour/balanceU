package com.harvard.group3.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by Damian on 11/23/2016.
 */
public class GoogleTestDefinitions {

    WebDriver driver;

    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage() throws Throwable {
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("ignoreZoomSetting", true);
        caps.setCapability("initialBrowserUrl", "http://www.google.com");
        driver = new InternetExplorerDriver(caps);
        //throw new PendingException();
    }

    @And("^I search for cheese!$")
    public void iSearchForCheese() throws Throwable {
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
        //throw new PendingException();
    }


    @Then("^I should see search results for cheese!$")
    public void iShouldSeeSearchResultsForCheese() throws Throwable {
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());

        // Confirm page title is valid.
        assertEquals("Cheese! - Google Search", driver.getTitle());

        //Close the browser
        driver.quit();
    }
}

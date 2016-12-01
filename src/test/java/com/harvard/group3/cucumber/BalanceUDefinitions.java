package com.harvard.group3.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by tajjour on 2016-11-13.
 */
public class BalanceUDefinitions {

    WebDriver driver;

    @When("^I follow the URL to the application$")
    public void iFollowTheURLToTheApplication() throws Throwable {
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("ignoreZoomSetting", true);
        caps.setCapability("initialBrowserUrl", "http://localhost:9090");
        driver = new InternetExplorerDriver(caps);
    }

    @Then("^I should see the application$")
    public void iShouldSeeTheApplication() throws Throwable {
        // Confirm page title is valid.
        assertEquals("Welcome to BalanceU", driver.getTitle());

        //Close the browser
        driver.quit();
    }

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() throws Throwable {
        // Go to the welcome page.
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("ignoreZoomSetting", true);
        caps.setCapability("initialBrowserUrl", "http://localhost:9090");
        driver = new InternetExplorerDriver(caps);
    }

    @Then("^I should see the welcome and instructions$")
    public void iShouldSeeTheWelcomeAndInstructions() throws Throwable {
        // Check for opening statement on welcome page.
        assertTrue(driver.getPageSource().contains("BalanceU"));

        //Close the browser
        driver.quit();
    }

    @When("^I follow the URL to the class list$")
    public void iFollowTheURLToTheClassList() throws Throwable {
        // Click the link to the class list.
        driver.findElement(By.linkText("Course List")).click();
    }

    @Then("^I should see the class list$")
    public void iShouldSeeTheClassList() throws Throwable {
        // Confirm the class list is viewable
        String innerText = driver.findElement(By.xpath("//table/thead/tr/th")).getText();
        assertEquals("Name", innerText);

        //Close the browser
        driver.quit();
    }
}

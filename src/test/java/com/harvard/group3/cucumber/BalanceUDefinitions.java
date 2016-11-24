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

/**
 * Created by tajjour on 2016-11-13.
 */
public class BalanceUDefinitions {

    WebDriver driver;

    @When("^I follow the URL to the application$")
    public void iFollowTheURLToTheApplication() throws Throwable {
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("ignoreZoomSetting", true);
        caps.setCapability("initialBrowserUrl", "http://localhost:63342/balanceU/templates/index.html?_ijt=76io73j4u9og74oua4vam0fsmo");
        driver = new InternetExplorerDriver(caps);
    }

    @Then("^I should see the application$")
    public void iShouldSeeTheApplication() throws Throwable {
        // Confirm page title is valid.
        assertEquals("BalanceU Course Input Page", driver.getTitle());

        //Close the browser
        driver.quit();
    }

    @Given("^I am on the Class List page$")
    public void iAmOnTheClassListPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I view the university drop-down menu$")
    public void iViewTheUniversityDropDownMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the list of universities that have reviews$")
    public void iShouldSeeTheListOfUniversitiesThatHaveReviews() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select Harvard University from the university drop-down menu$")
    public void iSelectHarvardUniversityFromTheUniversityDropDownMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the list of reviewed Harvard University classes$")
    public void iShouldSeeTheListOfReviewedHarvardUniversityClasses() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

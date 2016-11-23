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

/**
 * Created by tajjour on 2016-11-13.
 */
public class BalanceUDefinitions {

/*    @Given("^I am a guest$")
    public void iAmAGuest() throws Throwable {
        //tbd --- include validation of guest access oncle log-in functionality is created
        throw new PendingException();
    }

    @When("^I follow the URL to the application$")
    public URLConnection iFollowTheURLToTheApplication() throws Throwable {
        *//*

        try {

        URL myURL = new URL("http://54.183.213.247:8080/");
        URLConnection myURLConnection = myURL.openConnection();
        myURLConnection.connect();
        return myURLConnection;
        }
        catch (Exception e)
        {
        throw new PendingException();
        }

        *//*
        throw new PendingException();

    }

    @Then("^I should see the application$")
    public void iShouldSeeTheApplication() throws Throwable {
        *//*
        URLConnection myURLConnection = iFollowTheURLToTheApplication();
        BufferedReader in = new BufferedReader(new InputStreamReader(
        myURLConnection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        System.out.println(inputLine);
        in.close();

        inputLine.contains("BalanceU");
        *//*

        throw new PendingException();
    }*/

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

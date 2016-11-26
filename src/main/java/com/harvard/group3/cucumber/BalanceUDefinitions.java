package com.harvard.group3.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.net.URLConnection;

/**
 * Created by tajjour on 2016-11-13.
 */
public class BalanceUDefinitions {

    @Given("^I am a guest$")
    public void iAmAGuest() throws Throwable {
        //tbd --- include validation of guest access oncle log-in functionality is created
        throw new PendingException();
    }

    @When("^I follow the URL to the application$")
    public URLConnection iFollowTheURLToTheApplication() throws Throwable {
        /*

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

        */
        throw new PendingException();

    }


    @Then("^I should see the application$")
    public void iShouldSeeTheApplication() throws Throwable {
        /*
        URLConnection myURLConnection = iFollowTheURLToTheApplication();
        BufferedReader in = new BufferedReader(new InputStreamReader(
        myURLConnection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        System.out.println(inputLine);
        in.close();

        inputLine.contains("BalanceU");
        */

        throw new PendingException();
    }

    @Given("^I am on the Class List page$")
    public void iAmOnTheClassListPage() throws Throwable {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        /*WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        driver.quit();        throw new PendingException();*/
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

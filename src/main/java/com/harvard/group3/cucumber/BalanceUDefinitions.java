package com.harvard.group3.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import java.net.*;
import java.io.*;
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
        try {
            URL myURL = new URL("http://54.183.213.247:8080/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            return myURLConnection; }
        catch (Exception e) {
        throw new PendingException();}
    }

    @Then("^I should see the application$")
    public void iShouldSeeTheApplication() throws Throwable {
        URLConnection myURLConnection = iFollowTheURLToTheApplication();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                myURLConnection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

        inputLine.contains("BalanceU");

        throw new PendingException();
    }
}

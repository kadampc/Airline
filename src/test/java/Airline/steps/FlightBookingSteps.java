package Airline.steps;


import net.thucydides.core.annotations.Steps;
import Airline.steps.serenity.FlightBookingEndUserSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Arya on 25/07/2017.
 */
public class FlightBookingSteps {

    @Steps
    FlightBookingEndUserSteps FlightBookingEndUserSteps;

    @Given("User is on flight booking page")
    public void flight()
    {
        FlightBookingEndUserSteps.flightBookingOpen();
        FlightBookingEndUserSteps.flightBooking();
    }

    @When("User enters 'UserID' 'Password' and click on Submit button")
    public void enterCredentials(String UserID, String Password)
    {
        FlightBookingEndUserSteps.enterCredentials(UserID,Password);
    }

    @When("Select 'Departure' and 'Arrival' destination")
    public void flightFinder(String Departure, String Arrival)
    {
        FlightBookingEndUserSteps.flightFinder(Departure,Arrival);
    }

    @When("Select Service class and click on Continue")
    public void selectClass()
    {
        FlightBookingEndUserSteps.selectClass();
    }

    @When("Click the Continue button on Select Flight page")
    public void selectFlight()
    {
        FlightBookingEndUserSteps.selectFlight();
    }

    @When("Enters 'FirstName' 'LastName' and 'CreditCard' details")
    public void bookaFlight(String FirstName, String LastName, String CreditCard)
    {
        FlightBookingEndUserSteps.bookaFlight(FirstName,LastName,CreditCard);
    }

    @When("Select the Ticketless Travel checkbox and Click on Secure Purchase")
    public void securePurchase()
    {
        FlightBookingEndUserSteps.securePurchase();
    }

    @Then("Flight Confirmation page displayed")
    public void flightConfirmed()
    {
        FlightBookingEndUserSteps.flightConfirmed();
    }
}

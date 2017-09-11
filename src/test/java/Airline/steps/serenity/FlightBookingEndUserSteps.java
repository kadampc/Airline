package Airline.steps.serenity;

import Airline.pages.FlightBookingPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by Arya on 25/07/2017.
 */
public class FlightBookingEndUserSteps {

    FlightBookingPage FlightBookingPage;

    @Step
    public void flightBookingOpen()
    {
        FlightBookingPage.open();
    }

    @Step
    public void flightBooking()
    {
        FlightBookingPage.flightBooking();
    }

    @Step
    public void enterCredentials(String UserID, String Password)
    {
        FlightBookingPage.enterCredentials(UserID, Password);
    }

    @Step
    public void flightFinder(String Departure, String Arrival)
    {
        FlightBookingPage.flightFinder(Departure,Arrival);
    }

    @Step
    public void selectClass()
    {
        FlightBookingPage.selectClass();
    }

    @Step
    public void selectFlight()
    {
        FlightBookingPage.selectFlight();
    }

    @Step
    public void bookaFlight(String FirstName, String LastName, String CreditCard)
    {
        FlightBookingPage.bookaFlight(FirstName,LastName,CreditCard);
    }

    @Step
    public void securePurchase()
    {
        FlightBookingPage.securePurchase();
    }

    @Step
    public void flightConfirmed()
    {
        FlightBookingPage.flightConfirmed();
    }


}

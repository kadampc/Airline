package Airline.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Arya on 25/07/2017.
 */

@DefaultUrl("http://newtours.demoaut.com/mercurywelcome.php")
public class FlightBookingPage extends PageObject {

    @FindBy (name = "userName")
    WebElementFacade userName;

    @FindBy (name = "password")
    WebElementFacade password;

    @FindBy (name = "login")
    WebElementFacade login;

    @FindBy (name = "fromPort")
    WebElementFacade fromPort;

    @FindBy (name = "toPort")
    WebElementFacade toPort;

    @FindBy (xpath = "//input[@value='Business']")
    WebElementFacade servClass;

    @FindBy (name = "findFlights")
    WebElementFacade findFlights;

    @FindBy (name = "reserveFlights")
    WebElementFacade reserveFlights;

    @FindBy (name = "passFirst0")
    WebElementFacade Firstname;

    @FindBy (name = "passLast0")
    WebElementFacade Lastname;

    @FindBy (name = "creditnumber")
    WebElementFacade creditnumber;

    @FindBy (name = "ticketLess")
    WebElementFacade Ticketcheckbox;

    @FindBy (name = "buyFlights")
    WebElementFacade buyFlights;

    public void flightBooking()
    {
        getDriver().manage().window().maximize();
    }

    public void enterCredentials(String UserID, String Password)
    {
        waitForRenderedElements(By.xpath("//img[@src='/images/hdr_findflight.gif']"));
        userName.clear();
        userName.sendKeys(UserID);
        password.clear();
        password.sendKeys(Password);
        login.click();
    }

    public void flightFinder(String Departure, String Arrival)
    {
        waitForRenderedElements(By.xpath("//font[@face='ARIAL, HELVETICA']"));
        String Flightdetails = getDriver().findElement(By.xpath("//font[@face='ARIAL, HELVETICA']")).getText();
        Assert.assertEquals("  Flight Details",Flightdetails);
        fromPort.selectByVisibleText(Departure);
        toPort.selectByVisibleText(Arrival);
    }

    public void selectClass()
    {
        servClass.click();
        findFlights.click();
    }

    public void selectFlight()
    {
        waitForRenderedElements(By.xpath("//img[@src='/images/masts/mast_selectflight.gif']"));
        String selectFlight = getDriver().findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif']//.[@size='2']")).getText();
        Assert.assertEquals("Select your departure and return flight from the selections below. Your total price will be higher than quoted if you elect to fly on a different airline for both legs of your travel.",selectFlight);
        reserveFlights.click();
    }

    public void bookaFlight(String FirstName, String LastName, String CreditCard)
    {
        waitForRenderedElements(By.xpath("//img[@src='/images/masts/mast_book.gif']"));
        String bookFlight = getDriver().findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif']//.[@size='2']")).getText();
        Assert.assertEquals("Please review your travel itinerary and make your purchase.",bookFlight);
        Firstname.sendKeys(FirstName);
        Lastname.sendKeys(LastName);
        creditnumber.sendKeys(CreditCard);
    }

    public void securePurchase()
    {
        Ticketcheckbox.click();
        buyFlights.click();
    }

    public void flightConfirmed()
    {
       waitForRenderedElements(By.xpath("//img[@src='/images/masts/mast_confirmation.gif']"));
       String flightConfirmation = getDriver().findElement(By.xpath("//font[@size='+1']")).getText();
       Assert.assertEquals("Your itinerary has been booked!", flightConfirmation);
       System.out.println(flightConfirmation);
    }
}

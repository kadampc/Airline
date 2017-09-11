Meta:

Narrative:
As a user
I want to book flight ticket
So that I can get the confirmed booking

Scenario: Booking of Flight Ticket
Given User is on flight booking page
When User enters 'UserID' 'Password' and click on Submit button
And Select 'Departure' and 'Arrival' destination
And Select Service class and click on Continue
And Click the Continue button on Select Flight page
And Enters 'FirstName' 'LastName' and 'CreditCard' details
And Select the Ticketless Travel checkbox and Click on Secure Purchase
Then Flight Confirmation page displayed

Examples:
|UserID|Password|Departure|Arrival|FirstName|LastName|CreditCard|
|mercury|mercury|Sydney|London|Prasad|Kadam|1234567890123456|
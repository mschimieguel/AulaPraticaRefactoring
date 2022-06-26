import java.util.Enumeration;

public class HtmlStatement extends Statement {

    protected String getInitialString(Customer aCustomer) {
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
        return result;
    }

    protected String getFiguresString(Rental aRental) {
        String result = aRental.getMovie().getTitle()+ ": " +
        String.valueOf(aRental.getCharge()) + "<BR>\n";

        return result;
    }

    protected String getOwedString(Customer aCustomer) {
        String result = "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        return result;
    }

    protected String getEarnedString(Customer aCustomer) {
        String result = "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
        return result;
    }
}
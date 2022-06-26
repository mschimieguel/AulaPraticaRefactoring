import java.util.Enumeration;

public class TextStatement extends Statement {

    protected String getInitialString(Customer aCustomer) {
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";

        return result;
    }

    protected String getFiguresString(Rental aRental) {
        String result = "\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(aRental.getCharge()) + "\n";

        return result;
    }

    protected String getOwedString(Customer aCustomer) {
        String result = "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        return result;
    }

    protected String getEarnedString(Customer aCustomer) {
        String result = "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
    }
}
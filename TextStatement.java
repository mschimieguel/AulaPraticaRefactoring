import java.util.Enumeration;

public class TextStatement extends Statement {

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getInitialString(aCustomer);

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      //show figures for this rental
      result += getFiguresString(each);
    }

    //add footer lines
    result += getOwedString(aCustomer);
    result += getEarnedString(aCustomer);
    return result;
  }

  private String getInitialString(Customer aCustomer) {
    String result = "Rental Record for " + aCustomer.getName() +
    "\n";

    return result;
  }

  private String getFiguresString(Rental aRental) {
    String result = "\t" + aRental.getMovie().getTitle()+ "\t" +
        String.valueOf(aRental.getCharge()) + "\n";

    return result;
  }

  private String getOwedString(Customer aCustomer) {
    String result = "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
    return result;
  }

  private String getEarnedString(Customer aCustomer) {
    String result = "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
    return result;
  }
}
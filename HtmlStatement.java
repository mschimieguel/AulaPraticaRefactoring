import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
    String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
    return result;
  }

  private String getFiguresString(Rental aRental) {
    String result = aRental.getMovie().getTitle()+ ": " +
      String.valueOf(aRental.getCharge()) + "<BR>\n";

    return result;
  }

  private String getOwedString(Customer aCustomer) {
    String result = "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    return result;
  }

  private String getEarnedString(Customer aCustomer) {
    String result = "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
    return result;
  }
}
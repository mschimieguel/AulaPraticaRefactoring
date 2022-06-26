public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
   public Double getCharge() {
      double thisAmount = 0; 
      switch (this.getMovie().getPriceCode()) {
         case Movie.REGULAR:
         thisAmount += 2;
            if (this.getDaysRented() > 2)
              return thisAmount += (this.getDaysRented() - 2) * 1.5;
            
         case Movie.NEW_RELEASE:
         return thisAmount += this.getDaysRented() * 3;
            
         case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (this.getDaysRented() > 3)
            return thisAmount += (this.getDaysRented() - 3) * 1.5;
         default:
            throw new java.lang.Error("this is very bad");
      }
   }
}
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class FareCalculator {
    public static void main(String[] args) {
        int numberOfPassengers=3;
        double totalCharges=378.97;
        double farePerPerson=totalCharges/numberOfPassengers;
        System.out.println("fare per person is :"+farePerPerson);

        BigDecimal passengerCount=BigDecimal.valueOf(numberOfPassengers);
        BigDecimal amountToBePaid=BigDecimal.valueOf(totalCharges);
        BigDecimal farePerPassenger=amountToBePaid.divide(passengerCount,4, RoundingMode.HALF_DOWN);

        System.out.println("Rounded Fare with Int 4 is  "+ farePerPassenger);
    }
}

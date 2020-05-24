import java.text.NumberFormat;
import java.util.Locale;

public class FormattingCurrency {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);     

        double dollarAmount = 1234567.12245678;
        
        System.out.println("The amount is " +
                formatter.format(dollarAmount) +
                ", which is cool!");
    }
}

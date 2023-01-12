import java.util.*;
import java.text.*;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat frances = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = frances.format(payment);

        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usa.format(payment);

        NumberFormat chinas = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinas.format(payment);

        NumberFormat indias = NumberFormat.getCurrencyInstance(new Locale("EN", "In"));
        String india = indias.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

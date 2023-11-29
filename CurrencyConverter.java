import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        convertCurrency();
    }

    static void convertCurrency() {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Allow the user to choose the base and target currencies
        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Step 2: Fetch real-time exchange rates (for demonstration, using a fixed rate)
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("Invalid currency selection. Exiting program.");
            return;
        }

        // Step 3: Take input from the user for the amount they want to convert
        System.out.print("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
        double amountToConvert = scanner.nextDouble();

        // Step 4: Currency Conversion
        double convertedAmount = amountToConvert * exchangeRate;

        // Step 5: Display Result
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }

    // For demonstration purposes, using a fixed exchange rate
    static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Replace this with a call to a real-time exchange rate API
        // For simplicity, using a fixed rate of 1.2 for demonstration
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 1.2;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 0.83;
        } else {
            // Return -1 to indicate an invalid currency pair
            return -1;
        }
    }
}

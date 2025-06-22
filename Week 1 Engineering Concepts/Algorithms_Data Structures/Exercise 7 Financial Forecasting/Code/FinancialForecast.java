import java.util.Scanner;

public class FinancialForecast {

    // Recursive method
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }

        // Recursive case
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the present value (₹): ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (in %): ");
        double growthRatePercent = scanner.nextDouble();
        double growthRate = growthRatePercent / 100.0;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);

//Time Complexity: O(n), where n is the number of years
// Use iteration for reliability and memoization to cache results, both preventing stack overflow and reducing repeated recursive calls.

       
}


import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //
        double principal, interest, term, premium, percent, price, downpayment;

        System.out.print("Enter the price of the house: ");
        price = input.nextDouble();

        System.out.print("What percentage are you putting down? ");
        percent = input.nextDouble() / 100;

        /*
         * System.out.print("Enter the principal amount: ");
         * principal = input.nextDouble();
         */

        System.out.print("Enter the interest rate: ");
        interest = input.nextDouble() / 100;

        System.out.print("Enter the term of the loan (in years): ");
        term = input.nextDouble();

        // Calculate the monthly mortgage premium
        downpayment = price * percent;
        principal = price - downpayment;
        premium = (principal * (interest / 12)) / (1 - Math.pow(12 / (12 + interest), term * 12));
        System.out.println(
                "****** This program calculate the Monthly Mortgage Premium for a Fixed_Rate Mortgage ******");
        System.out.printf("The downpayment is $%.4f\n", downpayment);
        System.out.printf("The bank will finance $%.4f\n", principal);
        System.out.printf("The Monthly Principal & Interest is $%.4f\n", premium);
        System.out.printf("Mortgage = Mortgage Insurance + Taxes, Insurance and Assessments\n");
    }

}

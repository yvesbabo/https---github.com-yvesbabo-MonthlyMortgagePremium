
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        // This program calculate the Monthly Payment for a Fixed_Rate Mortgage 
        // 
        Scanner input = new Scanner(System.in);
        //
        double principal, interest, term, premium;

        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        interest = input.nextDouble() / 100;

        System.out.print("Enter the term of the loan (in years): ");
        term = input.nextDouble();

        // Calculate the monthly mortgage premium
        premium = (principal * (interest / 12)) / (1 - Math.pow(12 / (12 + interest), term * 12));
        System.out.println("***** This program calculate the Monthly Payment for a Fixed_Rate Mortgage *****");
        System.out.printf("The monthly mortgage premium is $%.4f", premium);

    }

}

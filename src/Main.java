import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float firstNumberAhyod,secondNumberAhyod,sum,difference, product, quotient;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:(and press Enter)");
        firstNumberAhyod = scanner.nextFloat();

        System.out.println("Enter the second number:(and press Enter)");
        secondNumberAhyod = scanner.nextFloat();


        sum = firstNumberAhyod + secondNumberAhyod;

        difference = firstNumberAhyod - secondNumberAhyod;

        product = firstNumberAhyod * secondNumberAhyod ;

        quotient = firstNumberAhyod / secondNumberAhyod;

        System.out.printf("Sum: %.2f\n", sum);

        System.out.printf("Difference: %.2f\n", difference);

        System.out.printf("Product: %.2f\n", product);

        System.out.printf("Quotient: %.2f\n", quotient);



    }
}
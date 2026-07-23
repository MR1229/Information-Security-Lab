import java.util.Scanner;

public class EuclideanGCDLCM {

    public static int gcd(int firstNumber, int secondNumber) {

        while (secondNumber != 0) {
            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        return firstNumber;
    }

    public static long lcm(int firstNumber, int secondNumber) {

        return ((long) firstNumber * secondNumber) / gcd(firstNumber, secondNumber);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("\nGCD = " + gcd(firstNumber, secondNumber));
        System.out.println("LCM = " + lcm(firstNumber, secondNumber));

        scanner.close();
    }
}

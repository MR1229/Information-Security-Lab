import java.util.Scanner;

public class ModularArithmetic {

    static int modularAddition(int a, int b, int mod) {
        return (a + b) % mod;
    }

    static int modularSubtraction(int a, int b, int mod) {
        return ((a - b) % mod + mod) % mod;
    }

    static int modularMultiplication(int a, int b, int mod) {
        return (a * b) % mod;
    }

    static int modularInverse(int b, int mod) {

        for (int i = 1; i < mod; i++) {

            if ((b * i) % mod == 1)
                return i;
        }

        return -1;
    }

    static int modularDivision(int a, int b, int mod) {

        int inverse = modularInverse(b, mod);

        if (inverse == -1)
            return -1;

        return (a * inverse) % mod;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int b = scanner.nextInt();

        System.out.print("Enter Modulus : ");
        int mod = scanner.nextInt();

        System.out.println("\nModular Addition = " + modularAddition(a, b, mod));
        System.out.println("Modular Subtraction = " + modularSubtraction(a, b, mod));
        System.out.println("Modular Multiplication = " + modularMultiplication(a, b, mod));

        int division = modularDivision(a, b, mod);

        if (division == -1)
            System.out.println("Modular Division is not possible.");
        else
            System.out.println("Modular Division = " + division);

        scanner.close();
    }
}

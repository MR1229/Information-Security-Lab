import java.util.Scanner;

public class PlayfairCipher {

    static char[][] matrix = new char[5][5];

    // Generate Playfair Matrix
    static void generateMatrix(String key) {

        boolean[] visited = new boolean[26];

        key = key.toUpperCase().replace("J", "I");

        StringBuilder result = new StringBuilder();

        for (char ch : key.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z' && !visited[ch - 'A']) {
                visited[ch - 'A'] = true;
                result.append(ch);
            }
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            if (ch == 'J')
                continue;

            if (!visited[ch - 'A']) {
                result.append(ch);
            }
        }

        int index = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                matrix[i][j] = result.charAt(index++);
            }
        }
    }

    // Display Matrix
    static void displayMatrix() {

        System.out.println("\nPlayfair Matrix:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Key : ");
        String key = scanner.nextLine();

        generateMatrix(key);

        displayMatrix();

        scanner.close();
    }
}

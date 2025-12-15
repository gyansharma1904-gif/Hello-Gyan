import java.util.Scanner;

public class ConcentricPattern {

    public static void printPattern(int n) {
        int num = 1;

        for (int i = 1; i <= n; i++) {

            int[] row = new int[i];

            // fill row values
            for (int j = 0; j < i; j++) {
                row[j] = num++;
            }

            // print even row in reverse
            if (i % 2 == 0) {
                for (int j = row.length - 1; j >= 0; j--) {
                    System.out.print(row[j] + " ");
                }
            } 
            // print odd row normally
            else {
                for (int j = 0; j < row.length; j++) {
                    System.out.print(row[j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}

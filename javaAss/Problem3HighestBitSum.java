import java.util.*;

public class Problem3HighestBitSum {

    // Returns position of highest set bit (0-based)
    public static int highestBitPosition(int x) {
        int pos = -1;
        while (x > 0) {
            pos++;
            x >>= 1;
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            sum += highestBitPosition(val);
        }
        System.out.println(sum);
        sc.close();
    }
}

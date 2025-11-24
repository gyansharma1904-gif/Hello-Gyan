import java.util.*;

public class Problem2ArrayChallenge {

    public static String ArrayChallenge(int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int d = arr[3];
        int x = arr[4];
        if (a > b) {
            int temp = a; a = b; b = temp;
        }
        if (c > d) {
            int temp = c; c = d; d = temp;
        }

        int startOverlap = Math.max(a, c);
        int endOverlap = Math.min(b, d);

        int overlapCount = 0;
        if (endOverlap >= startOverlap) {
            overlapCount = endOverlap - startOverlap + 1;
        }

        return (overlapCount >= x) ? "true" : "false";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(ArrayChallenge(arr));
        sc.close();
    }
}

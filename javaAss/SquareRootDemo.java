// SquareRootDemo.java
public class SquareRootDemo {
    public static double calculateSquareRoot(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number: " + n);
        }
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        int[] tests = {16, -4};
        for (int t : tests) {
            try {
                System.out.println("sqrt(" + t + ") = " + calculateSquareRoot(t));
            } catch (IllegalArgumentException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }
}

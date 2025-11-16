// MultiCatchDemo.java
public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            // 1) ArithmeticException:
            int x = 10 / 0;

            // 2) NullPointerException:
            String s = null; int len = s.length();

            // 3) ArrayIndexOutOfBoundsException:
            int[] a = new int[2]; int v = a[5];

            System.out.println("No exception was thrown (uncomment a test case).");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

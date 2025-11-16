// NestedTryCatchDemo.java
public class NestedTryCatchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        try { // outer
            try { // inner
                int a = 10 / 0; // will throw ArithmeticException
                System.out.println(a);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Caught ArithmeticException -> " + e.getMessage());
            }

            System.out.println("Now accessing arr[5]");
            System.out.println(arr[5]); // will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Caught ArrayIndexOutOfBoundsException -> " + e.getMessage());
        }
    }
}

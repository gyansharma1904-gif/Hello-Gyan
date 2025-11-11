// FinallyDemo.java
public class FinallyDemo {
    public static int testFinallyReturn() {
        try {
            System.out.println("Inside try, about to return 1");
            return 1;
        } finally {
            System.out.println("Finally block executed even after return.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned value: " + testFinallyReturn());

        try {
            throw new RuntimeException("Test exception");
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally executes after exception handling too.");
        }
    }
}

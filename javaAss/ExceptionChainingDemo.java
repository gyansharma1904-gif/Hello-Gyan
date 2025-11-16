// ExceptionChainingDemo.java
public class ExceptionChainingDemo {
    public static void doSomething() throws Exception {
        try {
            int x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            // Chain: create new Exception and set cause
            Exception ex = new Exception("Higher-level exception: calculation failed");
            ex.initCause(e); // chain original exception
            throw ex;
        }
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            e.getCause().printStackTrace(System.out); // show original
        }
    }
}

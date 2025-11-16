// NullUnboxingDemo.java
public class NullUnboxingDemo {
    public static void main(String[] args) {
        Integer maybeNull = null;

        try {
            int n = maybeNull; // triggers NullPointerException on unboxing
            System.out.println("Unboxed value: " + n);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Tried to unbox a null Integer.");
        }
    }
}

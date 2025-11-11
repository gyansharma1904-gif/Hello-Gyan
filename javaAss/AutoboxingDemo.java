// AutoboxingDemo.java
public class AutoboxingDemo {
    public static Integer addTen(Integer x) {
        // unboxing happens when we use x in arithmetic, boxing happens when returning
        return x + 10; // x is unboxed to int, addition done, result autoboxed to Integer
    }

    public static void main(String[] args) {
        Integer a = Integer.valueOf(5); // wrapper
        Integer result = addTen(a);
        System.out.println("Original: " + a + ", after addTen: " + result);
    }
}

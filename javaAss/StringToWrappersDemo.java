// StringToWrappersDemo.java
public class StringToWrappersDemo {
    public static void main(String[] args) {
        String s = "12345";
        Integer i = Integer.valueOf(s);
        Double d = Double.valueOf(s); // becomes 12345.0
        Boolean b = Boolean.valueOf(s); // "true" (case-insensitive) -> true; anything else -> false

        System.out.println("String: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("Boolean (valueOf): " + b + "  // only 'true' gives true");
    }
}

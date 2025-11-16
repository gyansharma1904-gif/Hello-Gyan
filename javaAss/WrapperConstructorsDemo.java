// WrapperConstructorsDemo.java
public class WrapperConstructorsDemo {
    public static void main(String[] args) {
        // Using valueOf (recommended)
        Integer i1 = Integer.valueOf(10);
        Double d1 = Double.valueOf(3.14);
        Boolean b1 = Boolean.valueOf(true);

        Integer i2 = new Integer(20);
        Double d2 = new Double(2.718);
        Boolean b2 = new Boolean(false);

        System.out.println("i1=" + i1 + ", i2=" + i2 + ", d1=" + d1 + ", b1=" + b1);
    }
}

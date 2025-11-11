// WrapperToPrimitiveDemo.java
public class WrapperToPrimitiveDemo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        Double d = Double.valueOf(9.81);
        Boolean b = Boolean.valueOf(true);

        int pi = i.intValue();
        double pd = d.doubleValue();
        boolean pb = b.booleanValue();

        System.out.println("Primitive values: int=" + pi + ", double=" + pd + ", boolean=" + pb);
    }
}

// ParseIntDemo.java
public class ParseIntDemo {
    public static void main(String[] args) {
        String[] inputs = {"123", "12a3", ""};
        for (String s : inputs) {
            try {
                int n = Integer.parseInt(s);
                System.out.println("Parsed integer: " + n);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Unable to parse '" + s + "' to int.");
            }
        }
    }
}

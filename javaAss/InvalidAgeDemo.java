// InvalidAgeDemo.java
public class InvalidAgeDemo {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is invalid. Must be 18 or older.");
        }
    }
    public static void main(String[] args) {
        int[] testAges = {15, 18, 21};
        for (int age : testAges) {
            try {
                System.out.println("Validating age: " + age);
                validateAge(age);
                System.out.println("Age " + age + " is valid.");
            } catch (InvalidAgeException e) {
                System.out.println("Caught InvalidAgeException: " + e.getMessage());
            }
        }
    }
}

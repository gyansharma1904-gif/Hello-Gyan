import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidSchoolException extends Exception {
    public InvalidSchoolException(String message) {
        super(message);
    }
}

public class Problem6SchoolException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mark: ");
            int mark = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter School Name: ");
            String school = sc.nextLine();

            if (!"ABESIT".equalsIgnoreCase(school.trim())) {
                throw new InvalidSchoolException("Invalid School Name. Only ABESIT is allowed.");
            }

            // If everything is okay
            System.out.println("Name: " + name);
            System.out.println("Mark: " + mark);
            System.out.println("School: " + school);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (InvalidSchoolException e) {
            // custom message using getMessage
            System.out.println("InvalidSchoolException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Exception occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

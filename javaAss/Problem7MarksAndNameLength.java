import java.util.InputMismatchException;
import java.util.Scanner;

// User defined exception
class MarksException extends Exception {
    public MarksException(String message) {
        super(message);
    }
}

public class Problem7MarksAndNameLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Registration Number: ");
            String regNo = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mark: ");
            int mark = sc.nextInt();

            if (mark < 0 || mark > 100) {
                throw new MarksException("check mark range");
            }

            if (name == null) {
                throw new NullPointerException("Name is null");
            }

            int nameLength = name.length();
            System.out.println("Registration Number: " + regNo);
            System.out.println("Name: " + name);
            System.out.println("Name Length: " + nameLength);
            System.out.println("Mark: " + mark);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        } catch (MarksException e) {
            // show custom message with getMessage
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Exception occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

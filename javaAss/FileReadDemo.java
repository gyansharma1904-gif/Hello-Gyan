// FileReadDemo.java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        // Replace "test.txt" with a real path when you run.
        String path = "test.txt";
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            System.out.println("Contents of " + path + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File not found - " + path);
        } catch (IOException e) {
            System.out.println("IOException occurred while reading the file: " + e.getMessage());
        }
    }
}

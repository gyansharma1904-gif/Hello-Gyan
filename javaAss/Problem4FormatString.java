import java.util.*;

public class Problem4FormatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        // Replace underscores with spaces
        String s = input.replace('_', ' ');

        // Make everything lowercase first
        s = s.toLowerCase();

        char[] chars = s.toCharArray();
        boolean startOfWord = true;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (startOfWord) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    startOfWord = false;
                }
            } else if (chars[i] == ' ') {
                startOfWord = true;
            } else {
                // Other characters (if any) – just continue
                startOfWord = false;
            }
        }

        String result = new String(chars);
        System.out.println(result);
    }
}

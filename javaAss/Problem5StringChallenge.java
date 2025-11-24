import java.util.*;

public class Problem5StringChallenge {

    public static String StringChallenge(String str) {
        // Split by any non-letter characters
        String[] parts = str.split("[^A-Za-z]+");
        StringBuilder camel = new StringBuilder();

        for (String part : parts) {
            if (part.length() == 0) continue;
            String lower = part.toLowerCase();
            String word = Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
            camel.append(word);
        }

        String challengeToken = "vd01qaskc5e";
        String combined = camel.toString() + challengeToken;

        // Replace every 3rd character (1-based) with 'X'
        StringBuilder finalOut = new StringBuilder(combined);
        for (int i = 2; i < finalOut.length(); i += 3) { // 0-based index 2,5,8,...
            finalOut.setCharAt(i, 'X');
        }

        return finalOut.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        // First, you can also print the camelCase alone if needed:
        // But as per examples, they mainly care about final output.
        String output = StringChallenge(input);
        System.out.println(output);
    }
}

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Process each character in the sentence
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) { // Consider only letters (ignore spaces, digits, etc.)
                charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the character-frequency map
        System.out.println("Character-Frequency Map:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordLengthMap = new HashMap<>();

        System.out.println("Enter 5 English words:");
        for (int i = 0; i < 5; i++) {
            String word = scanner.next();
            wordLengthMap.put(word, word.length());
        }

        // Print the word-length map
        System.out.println("Word-Length Map:");
        for (Map.Entry<String, Integer> entry : wordLengthMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

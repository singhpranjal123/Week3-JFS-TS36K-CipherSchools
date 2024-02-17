import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        showNumbers(limit);
    }

    public static void showNumbers(int limit) {
        Map<Integer, String> numberLabels = new HashMap<>();

        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                numberLabels.put(i, "EVEN");
            } else {
                numberLabels.put(i, "ODD");
            }
        }

        // Print the number labels
        for (Map.Entry<Integer, String> entry : numberLabels.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

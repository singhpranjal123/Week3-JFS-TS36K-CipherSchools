import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> marksMap = new HashMap<>();

        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            int marks = scanner.nextInt();
            String result = (marks >= 45) ? "Pass" : "Fail";
            marksMap.put(marks, result);
        }

        // Print the marks-pass/fail map
        System.out.println("Marks-Pass/Fail Map:");
        for (Map.Entry<Integer, String> entry : marksMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}

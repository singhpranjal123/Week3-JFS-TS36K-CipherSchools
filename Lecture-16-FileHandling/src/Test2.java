import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        // Ask the user to enter a directory path
        String directoryPath = getUserInput("");

        // Create the specified directory
        createDirectory(directoryPath);

        // Create 1000 empty files within the directory
        createEmptyFiles(directoryPath, 1000);
    }

    private static String getUserInput(String prompt) {
        System.out.print(prompt);
        return System.console().readLine();
    }

    private static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            boolean created = directory.mkdirs();
            if (created) {
                System.out.println("Directory created: " + directoryPath);
            } else {
                System.out.println("Error creating directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }

    private static void createEmptyFiles(String directoryPath, int numFiles) {
        for (int i = 1; i <= numFiles; i++) {
            String fileName = directoryPath + File.separator + i + ".txt";
            File file = new File(fileName);
            try {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created: " + fileName);
                } else {
                    System.out.println("Error creating file: " + fileName);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f= new File("d:\\myTestFile.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File Created Successfully!!");
    }
}
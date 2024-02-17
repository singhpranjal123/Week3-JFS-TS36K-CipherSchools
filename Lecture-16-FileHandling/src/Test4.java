import java.io.FileWriter;
import java.io.IOException;

public class Test4 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("",true);

        fw.write("I am the Earth \n");
        fw.write("I am The forest Green \n");
        fw.write("I am the four winds blowing \n");
        fw.write("I am the Earth \n");
        fw.flush();
        fw.close();

        System.out.println("Successfully prepared");

    }
}

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("d:\\myTestFile.txt");
        if(f.exists()){
            System.out.println("Printing File Details");
            System.out.println("-----------");

            System.out.println(f.getName());
            System.out.println(f.length());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());

            System.out.println("--------------");
        }


        f.mkdir();


    }
}

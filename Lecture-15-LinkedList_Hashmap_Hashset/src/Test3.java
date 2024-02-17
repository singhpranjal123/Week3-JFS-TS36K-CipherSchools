import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {


    HashSet myset = new HashSet();
    myset.add("green");
    myset.add("red");
    myset.add("orange");
    myset.add("red");
    myset.add("green");
    myset.add("orange");

        System.out.println(myset);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("red");
        lhs.add("orange");
        lhs.add("red");
        lhs.add("green");
        lhs.add("orange");
        System.out.println(lhs);

        TreeSet ts = new TreeSet();

        //treeset allows nulls
        //sort the data in desc order
        ts.add("Cat");
        ts.add("apple");
        ts.add("Ball");
        ts.add(null);
        System.out.println(ts);



}
}

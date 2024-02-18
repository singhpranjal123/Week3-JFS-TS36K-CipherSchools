
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
interface mathX{
    void add(int n1, int n2);
}


public class Main implements mathX{
    public  void add(int n1 , int n2){
        System.out.println(n1+n2);
    }
    public static void change(String m ){
        System.out.println(m.toUpperCase());
    }
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<>();
        lang.add("Java");
        lang.add("CSharp");
        lang.add("Python");
        lang.add("PHP");
        lang.forEach(Main::change);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Bye");
        list.add("World");

//        list.forEach(System.out.println);

        for(String s : list) {
            change(s);
        }
        change(list.get(0));
        change(list.get(1));
        change(list.get(2));

        List<Integer> list1 = Arrays.asList(5,-3,6,7,8,-9,2);
        List<Integer> result= list1.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(result);
        program obj = new program();
        obj.doAction();

        mathX oobj = (int x ,int y)->{
            System.out.println(x+y);
        };
        oobj.add(10,20);
        List<Integer> list2 = Arrays.asList(12,-44,19,21,-55,77);
        List<Integer> result2 = list1.stream().filter(e->e<0).collect(Collectors.toList());
        System.out.println(result);

        List<Object> mylist = Arrays.asList(true,100,"hello",200,false,"welcome",300,true,false);
        List<Object> result3= mylist.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
        System.out.println(result3);
        int total =(int)mylist.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList()).count();
        System.out.println(total);

        List<String> color =Arrays.asList("red","green","red","orange","green","red");
        List<String> result4=color.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(result4);
    }


}

class program {
    static void Converter(int args) {
        int arg = 0;
        System.out.println(Math.abs(arg));
    }

    void doAction() {
        List<String> numbers = new ArrayList<String>();
        numbers.forEach(program::Converter);
    }

    private static void Converter(String s) {
   }
}
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myll = new LinkedList();
        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");

        System.out.println(myll.get(1));

        myll.addLast("Gamora");

        myll.addFirst("AntMan");
        myll.add(2,"Natasha");
        Iterator itr = myll.iterator();

        while(itr.hasNext()) {
//            itr.remove();
            System.out.println(itr.next());
        }

        System.out.println("==============");
        System.out.println("Whos at the top"+myll.peek());
        System.out.println("hey first one get out "+myll.poll());

        System.out.println("Whos there standing at the ;ast !"+myll.pop());
        System.out.println("================");
        Iterator it = myll.iterator();

        while(it.hasNext()) {
//            itr.remove();
            System.out.println(it.next());
        }
    }
}
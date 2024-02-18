
class worker1 implements Runnable{
    public void run(){
        for (int i = 1; i <=20 ; i++) {
            System.out.println("Thread One is Working");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class worker2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=20 ; i++) {
            System.out.println("Hello From Thread Two");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Test1 {
    Thread t1,t2;
    Test1(){
        t1=new Thread(new worker1());
        t2=new Thread(new worker2());

        t1.setPriority(5);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        new Test1();
    }
}

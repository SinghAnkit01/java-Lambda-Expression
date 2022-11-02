// import java.util.ArrayList;

public class thread implements Runnable {

    thread() {
        Thread t1 = new Thread(this);
        t1.start();

    }

    public void name() {
        System.out.println("method");
    }

    public static void main(String[] args) {

        thread t = new thread();
        t.name();
        // callling name() and after constructor.
        // first thread:

        // Runnable thread1 = () -> {
        // // this is the body of thread
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // try {
        // // Thread.sleep(1000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }
        // };
        // Thread t = new Thread(thread1);
        // // thread1 is the reference(variable) of Runnable interface
        // t.setName("Ankit");
        // t.start();

        // second thread
        // Runnable thread2 = () -> {
        // // this is the body of thread
        // for (int i = 11; i <= 20; i++) {
        // System.out.println(i);
        // try {
        // // Thread.sleep(10001);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }
        // };
        // Thread t2 = new Thread(thread2);
        // // thread1 is the reference(variable) of Runnable interface
        // t2.setName("Ankit");
        // t2.start();

        // third thread
        Runnable thread3 = () -> {
            // this is the body of thread
            for (int i = 1; i <= 10; i++) {
                System.out.println("13 x " + i + " = " + i * 13);
                try {
                    // Thread.sleep(10001);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t3 = new Thread(thread3);
        // thread1 is the reference(variable) of Runnable interface
        // t2.setName("Ankit");
        t3.start();

    }

    @Override
    public void run() {
        System.out.println("Run");

    }
}

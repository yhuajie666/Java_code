package Exercise2;

public class Window2 {
    public static void main(String[] args) {
        window3 w=new window3();

        Thread t1=new Thread(w);
        Thread t2=new Thread(w);
        Thread t3=new Thread(w);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class window3 implements Runnable{
    private static int ticket=10000;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " 票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

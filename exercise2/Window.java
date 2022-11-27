package Exercise2;


class Window1 extends Thread{

    private static int ticket=100;
    private static Object obj=new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(getName() + " 票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class Window {
    public static void main(String[] args) {
        Window1 w1=new Window1();
        Window1 w2=new Window1();
        Window1 w3=new Window1();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}


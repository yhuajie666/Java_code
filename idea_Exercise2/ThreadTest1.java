package Exercise2;

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThresd m1=new MyThresd();//创建实现类的对象
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m1);
        t1.setName("线程1");
        t1.setName("线程2");

        t1.start();
        t2.start();
    }

}

class MyThresd implements Runnable{//实现接口

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if (i%2==0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
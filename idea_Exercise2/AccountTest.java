package Exercise2;

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}

class Account{
    private double banance;//余额

    public Account(double banance){
        this.banance=banance;
    }

    public synchronized void deposit(double amt){//同步方法解决线程安全问题
        if(amt>0){
            banance+=amt;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+":存钱成功,余额为"+banance);
        }
    }

}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct){
        this.acct=acct;
    }

    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
            //存钱
            acct.deposit(1000);
        }
    }
}

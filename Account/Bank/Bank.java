package Account.Bank;

public class Bank {
	private Customer [] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers=new Customer[10];
	}
	
	public void addCustomer(String f,String l) {//添加客户
		Customer cust=new Customer(f,l);
		customers[numberOfCustomers]=cust;
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomer() {//返回客户个数
		System.out.println("银行有"+numberOfCustomers+"名客户!");
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {//获取指定位置客户
		if(index>=0&&index<numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
}

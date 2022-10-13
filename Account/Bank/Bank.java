package Account.Bank;

public class Bank {
	private Customer [] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers=new Customer[10];
	}
	
	public void addCustomer(String f,String l) {//��ӿͻ�
		Customer cust=new Customer(f,l);
		customers[numberOfCustomers]=cust;
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomer() {//���ؿͻ�����
		System.out.println("������"+numberOfCustomers+"���ͻ�!");
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {//��ȡָ��λ�ÿͻ�
		if(index>=0&&index<numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
}

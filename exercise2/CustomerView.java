package exercise2;

public class CustomerView {
	
	
	private CustomerList customers=new CustomerList(10);
	
	/*public CustomerView(){
		Customer customer=new Customer("tom",'��',21,"1545521262","hjusadu@163.");
		customers.addCustomer(customer);
	}*/
	
	
	public void enterMainMenu() {//Ŀ¼
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("-----------�ͻ���Ϣ�������-----------------");
			System.out.println("	 	1 ��ӿͻ�				");
			System.out.println("		2 �޸Ŀͻ�				");
			System.out.println("		3 ɾ���ͻ�				");
			System.out.println("		4 �ͻ��б�				");
			System.out.println("		5 ��       ��\n				");
			System.out.print("    ��ѡ��(1-5): ");		
			
			char menu=CMUtility.readMenuSelection();
			switch(menu) {
				case '1':
					addNewCustomer();
					break;
				case '2':
					modifyCustomer();
					break;
				case '3':
					deleteCustomer();
					break;
				case '4':
					listAllCustomer();
					break;
				case '5':
		
					System.out.println("ȷ���Ƿ��˳�(Y/N)");
					char isExit=CMUtility.readConfirmSelection();
					if(isExit=='Y') {
						isFlag=false;
					}
			}
		}
		
		
	}
	
	private void addNewCustomer() {//��ӿͻ�
		System.out.println("-----------------------��ӿͻ�-------------------");
		System.out.println("����: ");
		String name=CMUtility.readString(10);
		System.out.println("�ձ�: ");
		char sex=CMUtility.readChar();
		System.out.println("����: ");
		int age=CMUtility.readInt();
		System.out.println("�绰: ");
		String phone=CMUtility.readString(13);
		System.out.println("����: ");
		String mailbox=CMUtility.readString(30);
		
		
		Customer customer=new Customer(name,sex,age,phone,mailbox);
		
		boolean isSuccess=customers.addCustomer(customer);
		if(isSuccess) {
			System.out.println("----------------------��ӳɹ�---------------------");
		}else {
			System.out.println("------------------------�ͻ�Ŀ¼����,���ʧ��-------------------");
		}
		
	}
	
	private void modifyCustomer() {
		System.out.println("---------------------�޸Ŀͻ�------------------");
		Customer cust;
		int number;
		for(;;) {
			System.out.println("��ѡ����޸ĵĿͻ����(-1�˳�):");
			number=CMUtility.readInt();
			if(number==-1) {
				return;
			}
			cust=customers.getCustomer(number-1);
			if(cust==null) {
				System.out.println("�޷��ҵ�ָ���ͻ�!");
			}else {
				break;
			}
		}
		
		System.out.println("����("+cust.getName()+"):");
		String name=CMUtility.readString(10, cust.getName());
		System.out.println("�Ա�("+cust.getSex()+"):");
		char sex=CMUtility.readChar(cust.getSex());
		System.out.println("����("+cust.getAge()+"):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("�绰("+cust.getPhone()+"):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.println("����("+cust.getMailbox()+"):");
		String mailbox = CMUtility.readString(30, cust.getMailbox());
		
		Customer newcust=new Customer(name, sex, age, phone, mailbox);
		
		boolean isRepalaced=customers.replaceCustomer(number-1, newcust);
		if(isRepalaced) {
			System.out.println("---------------------�޸����------------------");
		}else {
			System.out.println("---------------------�޸�ʧ��------------------");
		}
		
		
	}
	
	private void deleteCustomer() {//ɾ��
		System.out.println("ɾ���ͻ��Ĳ���");
	}
	
	private void listAllCustomer() {
		System.out.println("--------------------------------�ͻ��б�----------------------------");
		int total=customers.getTotal();
		if(total==0) {
			System.out.println("��ǰû�пͻ�!");
		}else {
			System.out.println("���\t����\t�Ա�\t����\t�绰\t\t����");
			Customer[] custs=customers.getAllCustomers();
			for(int i=0;i<total;i++) {
				Customer cust=custs[i];
				System.out.println((i+1)+"\t"+cust.getName()+"\t"+cust.getSex()+
						"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getMailbox());
				
			}
		}
		
		System.out.println("--------------------�ͻ��б����--------------------\n");
		
	}
	
	public static void main(String[] args) {
		CustomerView view=new CustomerView();
		view.enterMainMenu();
	}
}

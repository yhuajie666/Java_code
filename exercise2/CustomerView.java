package exercise2;

public class CustomerView {
	
	
	private CustomerList customers=new CustomerList(10);
	
	/*public CustomerView(){
		Customer customer=new Customer("tom",'男',21,"1545521262","hjusadu@163.");
		customers.addCustomer(customer);
	}*/
	
	
	public void enterMainMenu() {//目录
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("-----------客户信息管理软件-----------------");
			System.out.println("	 	1 添加客户				");
			System.out.println("		2 修改客户				");
			System.out.println("		3 删除客户				");
			System.out.println("		4 客户列表				");
			System.out.println("		5 退       出\n				");
			System.out.print("    请选择(1-5): ");		
			
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
		
					System.out.println("确定是否退出(Y/N)");
					char isExit=CMUtility.readConfirmSelection();
					if(isExit=='Y') {
						isFlag=false;
					}
			}
		}
		
		
	}
	
	private void addNewCustomer() {//添加客户
		System.out.println("-----------------------添加客户-------------------");
		System.out.println("姓名: ");
		String name=CMUtility.readString(10);
		System.out.println("姓别: ");
		char sex=CMUtility.readChar();
		System.out.println("年龄: ");
		int age=CMUtility.readInt();
		System.out.println("电话: ");
		String phone=CMUtility.readString(13);
		System.out.println("邮箱: ");
		String mailbox=CMUtility.readString(30);
		
		
		Customer customer=new Customer(name,sex,age,phone,mailbox);
		
		boolean isSuccess=customers.addCustomer(customer);
		if(isSuccess) {
			System.out.println("----------------------添加成功---------------------");
		}else {
			System.out.println("------------------------客户目录已满,添加失败-------------------");
		}
		
	}
	
	private void modifyCustomer() {
		System.out.println("---------------------修改客户------------------");
		Customer cust;
		int number;
		for(;;) {
			System.out.println("请选择待修改的客户编号(-1退出):");
			number=CMUtility.readInt();
			if(number==-1) {
				return;
			}
			cust=customers.getCustomer(number-1);
			if(cust==null) {
				System.out.println("无法找到指定客户!");
			}else {
				break;
			}
		}
		
		System.out.println("姓名("+cust.getName()+"):");
		String name=CMUtility.readString(10, cust.getName());
		System.out.println("性别("+cust.getSex()+"):");
		char sex=CMUtility.readChar(cust.getSex());
		System.out.println("年龄("+cust.getAge()+"):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话("+cust.getPhone()+"):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.println("邮箱("+cust.getMailbox()+"):");
		String mailbox = CMUtility.readString(30, cust.getMailbox());
		
		Customer newcust=new Customer(name, sex, age, phone, mailbox);
		
		boolean isRepalaced=customers.replaceCustomer(number-1, newcust);
		if(isRepalaced) {
			System.out.println("---------------------修改完成------------------");
		}else {
			System.out.println("---------------------修改失败------------------");
		}
		
		
	}
	
	private void deleteCustomer() {//删除
		System.out.println("删除客户的操作");
	}
	
	private void listAllCustomer() {
		System.out.println("--------------------------------客户列表----------------------------");
		int total=customers.getTotal();
		if(total==0) {
			System.out.println("当前没有客户!");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs=customers.getAllCustomers();
			for(int i=0;i<total;i++) {
				Customer cust=custs[i];
				System.out.println((i+1)+"\t"+cust.getName()+"\t"+cust.getSex()+
						"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getMailbox());
				
			}
		}
		
		System.out.println("--------------------客户列表完成--------------------\n");
		
	}
	
	public static void main(String[] args) {
		CustomerView view=new CustomerView();
		view.enterMainMenu();
	}
}

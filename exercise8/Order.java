package exercise8;

public class Order {
	private int orderld;
	private String orderName;
	protected Order(int orderld, String orderName) {
		super();
		this.orderld = orderld;
		this.orderName = orderName;
	}
	public int getOrderld() {
		return orderld;
	}
	public void setOrderld(int orderld) {
		this.orderld = orderld;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		Order order=(Order) obj;
		if(order.getOrderld()==this.getOrderld()&&order.getOrderName().equals(this.getOrderName())) {
			return true;
		}else {
			return false;
		}
	}
}

package Orders;
import Users.Customer;

public class Order {
	private String orderId;
	private Customer user;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Customer getUserId() {
		return user;
	}
	public void setUser(Customer user) {
		this.user = user;
	}
	
}

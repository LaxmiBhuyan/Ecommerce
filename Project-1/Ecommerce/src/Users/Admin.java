package Users;
import Orders.Cart;

public class Admin extends User{
	private String userId="";
	private String password="";
	private String LogInStatus="";
	private Cart cart;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogInStatus() {
		return LogInStatus;
	}
	public void setLogInStatus(String logInStatus) {
		LogInStatus = logInStatus;
	}
	@Override
	public Boolean verifyUser() {
		return true;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}

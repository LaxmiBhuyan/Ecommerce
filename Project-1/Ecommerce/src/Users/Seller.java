package Users;
import ProductDetails.Product;

public class Seller extends User {
	private Product[] productListed;
	@Override
	public Boolean verifyUser() {
		return true;
	}
	public Product[] getProductListed() {
		
		return productListed;
	}

	public void setProductListed(Product[] productListed) {
		this.productListed = productListed;
	}

	
}

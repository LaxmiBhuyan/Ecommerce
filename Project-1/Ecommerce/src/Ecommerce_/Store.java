package Ecommerce_;
import java.util.Scanner;
import Users.*;
import Orders.*;
import ProductDetails.*;

public class Store {
	public static void main(String[] args) {
		System.out.println("Welcome to our ecommerce store!!!");
		System.out.println("Which user are you? 1.Customer 2.Seller 3. Admin");
		Scanner sc= new Scanner(System.in);
		int choice= sc.nextInt();
		String typeOfUser;
		if(choice==1) {
			typeOfUser="Customer";
			Customer current= new Customer();
			System.out.println("What is your userId");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("What is your password?");
			current.setPassword(sc.nextLine());
			if(current.verifyUser()==true) {
				System.out.println("User Verified");
				while(true) {
				System.out.println("Do you want to 1.View products 2.View Cart 3.Contact Us 4.Exit.");
				choice=sc.nextInt();
				if(choice==1) {
					Catalog catalog= new Catalog();
					Product[] allProducts= catalog.getListOfAllProducts();
					for(int i=0; i<allProducts.length; i++) {
						System.out.println(allProducts[i].getProductId()+ ""+allProducts[i].getProductName()+""
					+allProducts[i].getCost());
					}
					System.out.println("Do you want to add any product the the cart? Y/N");
					sc.nextLine();
					String addToCart=sc.nextLine();
					
					if(addToCart.equals("Y")) {
						System.out.println("Inpput the product id of the product which you want to add to cart.");
						String productId= sc.nextLine();
						Product [] cartProducts =new Product[1] ;
						for(int i=0; i<allProducts.length; i++) {
							if(allProducts[i].getProductId().equals(productId))
								cartProducts[0]=allProducts[i];
						}
						Cart cart= new Cart();
						cart.setCartId("1");
						cart.setListOfProducts(cartProducts);
						System.out.println(cartProducts[0].getProductName());
						current.setCart(cart);
						System.out.println("Successfully added to the cart");
						
					}
				
			}
			
		
				else if(choice==2){
					Product [] cartProducts= current.getCart().getListOfProducts();
					System.out.println(current.getCart().getCartId());
					for(int i=0; i<cartProducts.length; i++) {
						System.out.println(i);
						System.out.println(cartProducts[i].getProductId()+ ""
						+cartProducts[i].getProductName()+""+cartProducts[i].getCost());
				}
					System.out.println("Do you want to checkout? Y/N");
					sc.nextLine();
					String checkOut = sc.nextLine();
					if(checkOut.equals("Y"))
						if(current.getCart().checkOut())
							System.out.println("Your order is placed successfully");
			}
					
				else if(choice==3) {
				System.out.println("To contact us, please main on storeecart@gmail.com ");
				}
				 else if(choice==4) 
					 break;
				 else {
					System.out.println("Invalid choice, go agin");
				 }
			}
		}
	}
			else if(choice==2){
			typeOfUser="Seller";
			Seller current1= new Seller();
			System.out.println("What is your userId");
			sc.nextLine();
			current1.setUserId(sc.nextLine());
			System.out.println("What is your password?");
			current1.setPassword(sc.nextLine());
			if(current1.verifyUser()==true) {
				System.out.println("User Verified");
				while(true) {
				System.out.println("Do you want to 1.View products 2.Add Product 3.Contact Us.");
				choice=sc.nextInt();
				if(choice==1) {
					Catalog catalog= new Catalog();
					Product[] allProducts= catalog.getListOfAllProducts();
					for(int i=0; i<allProducts.length; i++) {
					System.out.println(allProducts[i].getProductId()+ ""+allProducts[i].getProductName()+""
					+allProducts[i].getCost());
					}

				
				}
			}
		}
	}
		else if(choice==3)
			typeOfUser="Admin";
			Admin admin= new Admin();
			System.out.println("What is your userId");
			sc.nextLine();
			admin.setUserId(sc.nextLine());
			System.out.println("What is your password?");
			sc.nextLine();
			admin.setPassword(sc.nextLine());
			if(admin.verifyUser()==true) {
				System.out.println("User Verified");
			}
				
				
			
		else{
			System.out.println("Invalid Input. Try Again");
			
				}

			}
		}
	

	
	
	

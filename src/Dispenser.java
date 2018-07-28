/**
 * Grand Canyon University 
 * CST-135
 * Brandon Bass
 * 
 * Daniel"Thad"Dittmer
 * Chad Wierick
 * David Pratt
 * Zachary Swoveland
 * 
 * This is our main Dispenser class.  Its main method is used currently to test method calls to other classes
 * here are the creation criteria: String name, String brand, int quantity, int price, String productID
 */
public class Dispenser {

	public static void main(String[] args) {
		Product myProduct = new Product();
		System.out.println(myProduct.toString());
		myProduct = new Product("This is a product", "ACME", 100, 120, "Product01");
		System.out.println(myProduct.toString());
		
		Product myDrink = new Drink();
		System.out.println(myDrink.toString());
		myDrink = new Drink("This is a drink", "Drink-a-licious", 120, 180, "Product03");
		System.out.println(myDrink.toString());
		
		Product mySnack = new Snack();
		System.out.println(mySnack.toString());
		mySnack = new Snack("This is a snack", "Snacktastic", 130, 1289, "Product05");
		System.out.println(mySnack.toString());
		
		Product myGum = new Gum();
		System.out.println(myGum.toString());
		myGum = new Product("This is America...err gum", "Gum4LyfYo", 1020, 12, "Productgummy");
		System.out.println(myGum.toString());
		
		Product myChips = new Chips();
		System.out.println(myChips.toString());
		myChips = new Drink("This is a chips", "insert your own idea here man!", 120, 180, "Product03");
		System.out.println(myChips.toString());
		
		Product myCandy = new Candy();
		System.out.println(myCandy.toString());
		myCandy = new Candy("This is a candy", "Snacktastic", 130, 1289, "Product05");
		System.out.println(myCandy.toString());
	}

}

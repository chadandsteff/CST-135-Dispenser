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
	public static Product[][] productGrid = new Product[5][5];

	public static void main(String[] args) {

		Product myProduct = new Product();
		System.out.println(myProduct.toString());
		myProduct = new Product("This is a product", "ACME", 100, 120, "Product01");
		System.out.println(myProduct.toString());

		Product myDrink = new Drink();
		System.out.println(myDrink.toString());
		myDrink = new Drink("zDrinky McDrinkerton", "Drink-a-licious", 120, 180, "Product03");
		System.out.println(myDrink.toString());

		Product mySnack = new Snack();
		System.out.println(mySnack.toString());
		mySnack = new Snack("Snacky McSnackface", "Snacktastic", 130, 1289, "Product05");
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

		//to test: comment out all of the above products and run the code below
		displayProducts(fillDispenser());
		
		// test compareTo method
		sortProductGrid();
		
		// week 3 specific test - our goal is to be sure that drink and snack both have our comparable interface inherited.  
		// since they are both subclasses that ultimately lead to the product class, we have the implementation in the product class and 
		// can demonstrate the inheritance functioning here:

		System.out.println();
		System.out.println("What is being compared:");
		System.out.println("Drink:");
		System.out.println(myDrink.toString());
		System.out.println();
		System.out.println("Snack:");
		System.out.println(mySnack.toString());
		System.out.println();
		System.out.print("Boolean test of their need to change: ");
		boolean testSnackVsDrink = myDrink.compareTo(mySnack);
		
		System.out.println(testSnackVsDrink);

	}
	
	public static void sortProductGrid() {
		
		productGrid[1][1].setName("qabc");

		boolean testThese = productGrid[1][1].compareTo(productGrid[1][2]);
		System.out.println(testThese); 
		productGrid[2][1].setPrice(1234);
		testThese = productGrid[2][1].compareTo(productGrid[1][2]);
		System.out.println(testThese);

		
		
	}


	public static Product[][] fillDispenser() {
	// I created this method to just fill the dispenser with some stuff in order to display
	// it in the displayProducts method	
		for (int i = 0; i < productGrid.length; i++){
			for (int j = 0; j < productGrid[0].length; j++){
				productGrid[i][j] = new Product();
			}
		}
		return productGrid;
	}

	//This method takes in a product grid and spits out the toString of each product contained therein
	public static void displayProducts(Product[][] productGrid) {
		for (int i = 0; i < productGrid.length; i++){
			for (int j = 0; j < productGrid[0].length; j++){
				System.out.println(productGrid[i][j].toString());
				System.out.println(i);
				System.out.println(j);
				System.out.println();
			}
		}
		
	}

}

/* possible changes:

I could make the products array a 3D array. This would allow us to have a row column access system but the third
dimension could allow for us to track quantity that way instead of using quantity as a variable inside the object
I would be willing to update the code to reflect this change but it's totally up to you guys. I'm not sure what we want
to do and how in depth we want to go with this.


-- David Pratt Jr.
 */;
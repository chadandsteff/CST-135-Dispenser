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
 * This is our main product class.  It has overloaded creation and generic/naked creation method
 * copy method is also in place as are all relevant sets and gets
 */
public class Product implements Comparable {
	
	String ProductID;
	int Product;
    String Name;
    String Brand;
    int Quantity;
    int Price;
    
    private String name;
	private double price;
	
	public boolean compareTo(Product b) {
		boolean aGoesAboveB = false;
		String aName = this.getName();
		String bName = b.getName();
		int aPrice = this.getPrice();
		int bPrice = b.getPrice();
		
		/** 
		 * 	these are used to see what is going on insite the method
		 * 	System.out.println();
		 *	System.out.println("What is being compared in compareTo");
		 *	System.out.println(aName);
		 *	System.out.println(aPrice);
		 * 	System.out.println(bName);
		 *	System.out.println(bPrice);
		 *	System.out.println();
		 *	System.out.println(aName.compareToIgnoreCase(bName));
		*/ 
		if(aName == bName) {
			if (aPrice >= bPrice) {
				aGoesAboveB = true;

			} else {
				// a and b are identically named, but a is more expensive.  Thus we don't need to do anything
			}
		} else {
			// names are different, this is a pure alpha sort.
			if(aName.compareToIgnoreCase(bName) < 0) {
				
			} else {
				aGoesAboveB = true;
			}
		}
		return aGoesAboveB;
	}
	
	
	public Product(String name, String brand, int quantity, int price, String productID) {
		this.setProductID(productID);
		this.setName(name);
		this.setBrand(brand);
		this.setQuantity(quantity);
		this.setPrice(price);
	}
	

	public Product() {
		this.setProductID("none");
		this.setBrand("default");
		this.setName("default");
		this.setQuantity(10);
		this.setPrice(100);
	}
	
	public Product(Product copyProduct) {
		this.setName(copyProduct.getName());
		this.setQuantity(copyProduct.getQuantity1());
		this.setPrice(copyProduct.getPrice());
	}

	public String getProductID() {
		return this.ProductID;
	}

	public void setProductID(String productID) {
		this.ProductID = productID;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getQuantity1() {
		return this.Quantity;
	}
	
	public int getPrice() {
		return this.Price;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public void setBrand(String brand) {
		this.Brand = brand;
	}
	
	public String getBrand() {
		return this.Brand;
	}
	
	public void setPrice(int price) {
		this.Price = price;
	}
	
	 public void setQuantity(int quantity) {
	        this.Quantity = quantity;
	 }

	
	public String toString() {
		return "\n"
		+ getName()
		+"\nPrice: " + getPrice()
		+"\nBrand: " + getBrand()
		+"\nQuantity: " + getQuantity()
		+"\nProductID: " + getProductID();
		
	}

	public int getQuantity() {
		// returns quantity
		return this.Quantity;
	}

	public void changeQuantity(int quantity) {
		this.Quantity = this.Quantity + quantity;
		
	}

	
}

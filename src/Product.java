/**
* Grand Canyon University 
 * Brandon Bass
 * Daniel"Thad"Dittmer
 * Chad Wierick
 * David Pratt
 * Zachary Swoveland
 */
public class Product {
	
	String ProductID;
	int Product;
    String Name;
    String Brand;
    int Quantity;
    int Price;
    
    private String name;
	private double price;
	
	
	
	public Product(String name, String brand, int quantity, int price, String productID) {
		this.setProductID(productID);
		this.setName(name);
		this.setBrand(brand);
		this.setQuantity(quantity);
		this.setPrice(price);
	}
	
	public Product() {
		this.setProductID("none");
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
	
	public void setPrice(int price) {
		this.Price = price;
	}
	
	 public void setQuantity(int quantity) {
	        this.Quantity = quantity;
	 }

	
	public String toString() {
		return "\n"
		+ getName()
		+"\nPrice; " + getPrice()
		+"\nBrand: " + getQuantity(Quantity);
		
	}

	public int getQuantity(int Quantity) {
		// returns quantity
		return this.Quantity;
	}

	public int compareTo(Product arg0) {
		// for future
		return 0;
	}

	public void changeQuantity(int quantity) {
		this.Quantity = this.Quantity + quantity;
		
	}

	
}

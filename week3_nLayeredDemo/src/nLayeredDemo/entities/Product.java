package nLayeredDemo.entities;

public class Product {

	private int productId;
	private String productName;
	private double unitPrice;
	
	public Product() {
		super();
	}

	public Product(int id, String name, double unitPrice) {
		super();
		this.productId = id;
		this.productName = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return productId;
	}

	public void setId(int id) {
		this.productId = id;
	}

	public String getName() {
		return productName;
	}

	public void setName(String name) {
		this.productName = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	
	
	
	
}

package innerAndStatic;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		Product product =new Product() ;
		product.price=14;
		product.name ="";
		manager.add(product);
		

	}

}

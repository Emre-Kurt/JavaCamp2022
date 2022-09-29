package fieldAndAttribute;

public class Main {

	public static void main(String[] args) {
		
		Product product=new Product();
		product.id=1;
		product.name="kitap";
		product.price=3.99;
		
		System.out.println(product.name);

		ProductManager productManager=new ProductManager();
		productManager.Add(product);
	}

}

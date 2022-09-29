package getterSetter;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		product.setId(1);
		product.setName("kitap");
		product.setPrice(59.90);

		
		System.out.println(product.getName());
	}

}

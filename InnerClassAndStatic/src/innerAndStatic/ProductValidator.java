package innerAndStatic;

public class ProductValidator {

	static {
		System.out.println("statik yapýcý blok çalýþtý;");
	}
	public ProductValidator() {
		System.out.println("yapýcý blok çalýþtý");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
			
		}else {
			return false;
		}
		
	}
	public void bisey(){
		
	}
}

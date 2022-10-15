package nLayeredDemo.business;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.Product;

public class ProductManager {

    List<String> products=new ArrayList<String>();
	ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	
	public void add(Product product) {
		if(product.getUnitPrice()<0) {
			System.out.println("Ürünün fiyatý 0'dan küçük olamaz! "+product.getName());
		}
		 if(products.contains(product.getName())) {
			System.out.println("Bu isimde bir ürün var! "+product.getName());
		}else {
		products.add(product.getName());
		productDao.add(product);
		}
	}
}

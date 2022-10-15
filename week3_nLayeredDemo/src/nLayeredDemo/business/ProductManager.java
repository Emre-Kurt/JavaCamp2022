package nLayeredDemo.business;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.core.logging.Logger;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.Product;

public class ProductManager {

    private List<String> products=new ArrayList<String>();
	private ProductDao productDao;
	private List<Logger> loggers;

	public ProductManager(ProductDao productDao,List<Logger> loggers) {
		super();
		this.productDao = productDao;
		this.loggers=loggers;
			
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
		for(Logger logger:loggers) {
			 logger.log(product.getName());
		 }
		}
		 
	}
}

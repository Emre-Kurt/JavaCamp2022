package nLayeredDemo.dataAccess.hibernate;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		
		System.out.println("Hibernate ile ürün veri tabanýna eklendi : "+product.getName());
	}

}

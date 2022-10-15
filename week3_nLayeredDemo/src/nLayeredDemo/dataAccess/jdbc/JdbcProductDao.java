package nLayeredDemo.dataAccess.jdbc;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.Product;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Jdbc ile ürün veri tabanýna eklendi : "+product.getName());
	}

}

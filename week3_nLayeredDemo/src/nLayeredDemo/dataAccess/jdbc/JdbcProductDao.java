package nLayeredDemo.dataAccess.jdbc;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.Product;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Jdbc ile �r�n veri taban�na eklendi : "+product.getName());
	}

}

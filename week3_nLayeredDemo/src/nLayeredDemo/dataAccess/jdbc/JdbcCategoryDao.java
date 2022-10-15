package nLayeredDemo.dataAccess.jdbc;

import nLayeredDemo.dataAccess.abstracts.CategoryDao;
import nLayeredDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Jdbc ile kategori veri tabanýna eklendi : "+category.getName());
	}

}

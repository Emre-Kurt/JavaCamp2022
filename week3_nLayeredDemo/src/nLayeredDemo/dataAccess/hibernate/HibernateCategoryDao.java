package nLayeredDemo.dataAccess.hibernate;

import nLayeredDemo.dataAccess.abstracts.CategoryDao;
import nLayeredDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile kategori veri taban�na eklendi : "+category.getName());
	}

}

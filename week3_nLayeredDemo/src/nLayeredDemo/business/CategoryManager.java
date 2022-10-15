package nLayeredDemo.business;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.dataAccess.abstracts.CategoryDao;
import nLayeredDemo.entities.Category;

public class CategoryManager {

	CategoryDao categoryDao;
	List<String> categories=new ArrayList<String>();

	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}
	
	public void add(Category category) {
		if(categories.contains(category.getName())) {
			System.out.println("Bu isimle kategori var! "+category.getName());
		}
		else {
			categories.add(category.getName());
			categoryDao.add(category);
		}
	}
}

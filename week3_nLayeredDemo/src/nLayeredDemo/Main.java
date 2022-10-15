package nLayeredDemo;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.business.CategoryManager;
import nLayeredDemo.business.InstructorManager;
import nLayeredDemo.business.ProductManager;
import nLayeredDemo.dataAccess.hibernate.HibernateProductDao;
import nLayeredDemo.dataAccess.jdbc.JdbcCategoryDao;
import nLayeredDemo.dataAccess.jdbc.JdbcInstructorDao;
import nLayeredDemo.dataAccess.jdbc.JdbcProductDao;
import nLayeredDemo.entities.Category;
import nLayeredDemo.entities.Instructor;
import nLayeredDemo.entities.Product;

public class Main {

	public static void main(String[] args) {
		

		Product product=new Product(1,"Java",1200);
		Product product1=new Product(2,"Java",2150);
		
       
	
		ProductManager productManager=new ProductManager(new HibernateProductDao());
		productManager.add(product);
		productManager.add(product1);
		
		Category category=new Category(1,"Programlama");
		Category category1=new Category(2,"Programlama");
        
        CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao());
        categoryManager.add(category);
        categoryManager.add(category1);
        
		Instructor instructor=new Instructor(1,"Ýhsan","Þeker");
		
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao());
		instructorManager.add(instructor);
	}

}

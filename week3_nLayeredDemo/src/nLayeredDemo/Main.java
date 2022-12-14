package nLayeredDemo;


import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.business.CategoryManager;
import nLayeredDemo.business.InstructorManager;
import nLayeredDemo.business.ProductManager;
import nLayeredDemo.core.logging.DatabaseLogger;
import nLayeredDemo.core.logging.FileLogger;
import nLayeredDemo.core.logging.Logger;
import nLayeredDemo.core.logging.MailLogger;
import nLayeredDemo.dataAccess.hibernate.HibernateProductDao;
import nLayeredDemo.dataAccess.jdbc.JdbcCategoryDao;
import nLayeredDemo.dataAccess.jdbc.JdbcInstructorDao;
import nLayeredDemo.entities.Category;
import nLayeredDemo.entities.Instructor;
import nLayeredDemo.entities.Product;

public class Main {

	public static void main(String[] args) {
		

		Product product=new Product(1,"Java",1200);
		Product product1=new Product(2,"Java",2150);
		
       List<Logger> loggers=new ArrayList<Logger>();
       loggers.add(new MailLogger());
      
	
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product);
		productManager.add(product1);
		
		Category category=new Category(1,"Programlama");
		Category category1=new Category(2,"Programlama");
        
        CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao());
        categoryManager.add(category);
        categoryManager.add(category1);
        
		Instructor instructor=new Instructor(1,"?hsan","?eker");
		
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao());
		instructorManager.add(instructor);
	}

}

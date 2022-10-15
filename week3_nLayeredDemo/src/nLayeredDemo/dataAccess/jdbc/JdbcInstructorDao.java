package nLayeredDemo.dataAccess.jdbc;

import nLayeredDemo.dataAccess.abstracts.InstructorDao;
import nLayeredDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

       @Override
       public void add(Instructor instructor) {
		
    	   System.out.println("Jdbc ile e�itmen veri taban�na eklendi : "+instructor.getFirstName()+" "+instructor.getLastName());
	}

}

package nLayeredDemo.dataAccess.hibernate;

import nLayeredDemo.dataAccess.abstracts.InstructorDao;
import nLayeredDemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{


@Override
	public void add(Instructor instructor) {
		
	System.out.println("Hibernate ile e�itmen veri taban�na eklendi : "+instructor.getFirstName()+instructor.getLastName());
	}

}

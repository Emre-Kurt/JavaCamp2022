package nLayeredDemo.dataAccess.hibernate;

import nLayeredDemo.dataAccess.abstracts.InstructorDao;
import nLayeredDemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{


@Override
	public void add(Instructor instructor) {
		
	System.out.println("Hibernate ile eðitmen veri tabanýna eklendi : "+instructor.getFirstName()+instructor.getLastName());
	}

}

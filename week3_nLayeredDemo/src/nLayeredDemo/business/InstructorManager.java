package nLayeredDemo.business;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.dataAccess.abstracts.InstructorDao;
import nLayeredDemo.entities.Instructor;

public class InstructorManager {

	InstructorDao instructorDao;
    List<Instructor> instructors=new ArrayList<Instructor>();
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		instructors.add(instructor);
	}
}

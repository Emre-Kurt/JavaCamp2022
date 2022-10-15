package nLayeredDemo.entities;

public class Instructor {

	int instructorId;
	String firstName;
	String lastName;
	
	public Instructor() {
		super();
	}
	
	public Instructor(int id, String firstName, String lastName) {
		super();
		this.instructorId = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return instructorId;
	}

	public void setId(int id) {
		this.instructorId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}

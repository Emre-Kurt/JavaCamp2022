package nLayeredDemo.entities;

public class Category {

	int categoryId;
	String categoryName;
	
	public Category() {
		super();
	}

	public Category(int id, String name) {
		super();
		this.categoryId = id;
		this.categoryName = name;
	}

	public int getId() {
		return categoryId;
	}

	public void setId(int id) {
		this.categoryId = id;
	}

	public String getName() {
		return categoryName;
	}

	public void setName(String name) {
		this.categoryName = name;
	}
}

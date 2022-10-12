package homework1_OOP;

public abstract class BaseCreditManager implements ICreditManager{

	public abstract void calculate();    
    public void save() {
       
    	System.out.println("Kaydedildi");
    }
}

package homework1_OOP;

public class CustomerManager {

	private Customer customer;
	private ICreditManager creditManager;
	
	 public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	 
	 public void Save(){
	        System.out.println("M��teri kaydedildi" );
	 }
	 
	 public void Delete(){
	        System.out.println("M��teri silindi" );
	 }
	 
	 public void giveCredit() {
	 this.creditManager.calculate();
	 System.out.println("Kredi verildi");
	 }
}

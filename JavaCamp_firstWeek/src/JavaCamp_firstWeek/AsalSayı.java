package JavaCamp_firstWeek;

public class AsalSay� {

	public static void main(String[] args) {
		int sayi=28;
		   int i;
		   boolean asalMi=true;
		   
		   
		   if(sayi==1) {
			   
		   System.out.println("say� asal de�il c�nk� 1");
		   
		   return;
		   
		   }
		   
		   if(sayi<1) {
		   
			   System.out.println("1 den k���k bir say� girdiniz");
			   return;
		   }
		   
		  
		   for(i=2;i<sayi;i++) {
			   
			   if(sayi%i==0) {
				   asalMi=false;
				   
				   }
		   }
		   
		   if(asalMi==true) {
			   
		   System.out.println("say� asald�r");
		   
		   }
		   else {
		System.out.println("say� asal de�il");
		   }
	}

}

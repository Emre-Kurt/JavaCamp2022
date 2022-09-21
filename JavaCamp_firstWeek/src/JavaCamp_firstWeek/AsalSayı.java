package JavaCamp_firstWeek;

public class AsalSayý {

	public static void main(String[] args) {
		int sayi=28;
		   int i;
		   boolean asalMi=true;
		   
		   
		   if(sayi==1) {
			   
		   System.out.println("sayý asal deðil cünkü 1");
		   
		   return;
		   
		   }
		   
		   if(sayi<1) {
		   
			   System.out.println("1 den küçük bir sayý girdiniz");
			   return;
		   }
		   
		  
		   for(i=2;i<sayi;i++) {
			   
			   if(sayi%i==0) {
				   asalMi=false;
				   
				   }
		   }
		   
		   if(asalMi==true) {
			   
		   System.out.println("sayý asaldýr");
		   
		   }
		   else {
		System.out.println("sayý asal deðil");
		   }
	}

}

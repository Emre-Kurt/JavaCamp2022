package JavaCamp_firstWeek;

public class FriendlyNumbers {

	public static void main(String[] args) {
		int sayi1=220;
		int sayi2=284;
	
		int toplam1=0;
		int toplam2=0;
		int i;
		
		if(sayi1<sayi2) {
			   
			   for(i=1;i<sayi1;i++) {
				   
				   
				   if(sayi1%i==0) {
					   
					   toplam1=toplam1+i;
				   }
				   
				   if(sayi2%i==0) {
					   
					   toplam2=toplam2+i;
				   }
			   }
			   
			   if(toplam1==sayi2) {
				   
				   if(toplam2==sayi1) {
					   
					   System.out.println("sayýlar arkadaþtýr");
				   }
			   }
			   
			   else {
				   System.out.println("sayýlar arkadaþ deðildir");
			   }
		   }
		   
		   
	 if(sayi2<sayi1) {
			   
			   for(i=1;i<sayi2;i++) {
				   
				   
				   if(sayi2%i==0) {
					   
					   toplam2=toplam2+i;
				   }
				   
				   if(sayi1%i==0) {
					   
					   toplam1=toplam1+i;
				   }
			   }
			   
			   if(toplam2==sayi1) {
				   
				   if(toplam1==sayi2) {
					   
					   System.out.println("sayýlar arkadaþtýr");
				   }
			   }
			   else {
				   
				   System.out.println("sayýlar arkadaþ deðildir");
			   }
		   }

	}

}

package JavaCamp_firstWeek;

public class PerfectNumbers {

	public static void main(String[] args) {
		int sayi=176;
		   int i;
		   int toplam=0;
		  
		   
		   for(i=1;i<sayi;i++) {
			   
			   if(sayi%i==0) {
				   
				   toplam=toplam+i;
				   
				   }
			   
			  }
		   if(toplam==sayi) {
			   
			   System.out.println("sayý mükemmel");
		   }
		   else {
			   System.out.println("sayý mükemmel deðil");
		   }

	}

}

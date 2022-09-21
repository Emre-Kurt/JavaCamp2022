package JavaCamp_firstWeek;

public class FindNumbers {

	public static void main(String[] args) {
		int[] sayilar= new int[]{1,3,5,7,9,};
		  
		  int bulunacak=1;
		  
		 
		 boolean varMi=false;
		  
		  
		  for(int sayi : sayilar) {
			  
			  if(sayi==bulunacak) {
				  
				  varMi=true;
				  break;
			  }
		  }
		   
		   if(varMi) {
			   System.out.println("sayý var");
		   }
		   else {
			   System.out.println("sayý yok");
		   }


	}

}

package metods;

public class Metods {

	public static void main(String[] args) {
		
		say�Bulmaca();
	}


	public static void say�Bulmaca() {
		int[] sayilar= new int[]{1,3,5,7,9,};
		  
		  int bulunacak=2;
		  
		 
		 boolean varMi=false;
		  
		  
		  for(int sayi : sayilar) {
			  
			  if(sayi==bulunacak) {
				  
				  varMi=true;
				  break;
			  }
		  }
		   
		   if(varMi) {
			   mesajVer("Say� var "+bulunacak);
		   }
		   else {
			   mesajVer("Say� yok "+bulunacak);
		   }
}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	}


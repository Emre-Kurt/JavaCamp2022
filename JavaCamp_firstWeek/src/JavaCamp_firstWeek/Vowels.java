package JavaCamp_firstWeek;

public class Vowels {

	public static void main(String[] args) {
		 String harf="O";
		   String kucultme=harf.toLowerCase();
		   
		   switch(kucultme) {
		   
		   case "a":
		   case "ý":
		   case "o":
		   case "u":
			   System.out.println("kalýn sesli harf girdiniz");
			   break;
			   
		   case "e":
		   case "i":
		   case "ö":
		   case "ü":
		       
			   System.out.println("ince sesli harf girdiniz");
			   break;
			   
			   default:
				   System.out.println("sessiz harf girdiniz");
		   }

	}

}

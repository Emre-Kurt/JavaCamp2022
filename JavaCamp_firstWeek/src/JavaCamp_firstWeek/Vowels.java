package JavaCamp_firstWeek;

public class Vowels {

	public static void main(String[] args) {
		 String harf="O";
		   String kucultme=harf.toLowerCase();
		   
		   switch(kucultme) {
		   
		   case "a":
		   case "�":
		   case "o":
		   case "u":
			   System.out.println("kal�n sesli harf girdiniz");
			   break;
			   
		   case "e":
		   case "i":
		   case "�":
		   case "�":
		       
			   System.out.println("ince sesli harf girdiniz");
			   break;
			   
			   default:
				   System.out.println("sessiz harf girdiniz");
		   }

	}

}

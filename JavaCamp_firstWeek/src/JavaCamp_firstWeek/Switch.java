package JavaCamp_firstWeek;

public class Switch {

	public static void main(String[] args) {
		char grade='F';
		
		switch(grade) {
		case 'A' :
			
			System.out.println("A ile ge�tiniz");
			break;
			
		case 'B' :
			System.out.println("B ile ge�tiniz");
			break;
			
		case 'C' :
			System.out.println("C ile ge�tiz");
			break;
			
		case 'D' :
			System.out.println("D ile ge�tiniz");
			break;
			
		case 'F' :
			System.out.println("Kald�n�z");
			break;
			default:
				System.out.println("ge�ersiz bir not girdiniz");
		}
		

	}

}

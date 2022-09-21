package JavaCamp_firstWeek;

public class Switch {

	public static void main(String[] args) {
		char grade='F';
		
		switch(grade) {
		case 'A' :
			
			System.out.println("A ile geçtiniz");
			break;
			
		case 'B' :
			System.out.println("B ile geçtiniz");
			break;
			
		case 'C' :
			System.out.println("C ile geçtiz");
			break;
			
		case 'D' :
			System.out.println("D ile geçtiniz");
			break;
			
		case 'F' :
			System.out.println("Kaldýnýz");
			break;
			default:
				System.out.println("geçersiz bir not girdiniz");
		}
		

	}

}

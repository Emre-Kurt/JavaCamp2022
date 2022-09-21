package JavaCamp_firstWeek;

public class RecapDemo1 {

	public static void main(String[] args) {
		int sayi1=36;
		int sayi2=28;
		int sayi3=29;
		
		int enBuyuk=sayi1;
		
		if(sayi2>enBuyuk) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println("En büyük sayý "+enBuyuk);
	}

}

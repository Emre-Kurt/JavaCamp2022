package metods2;

public class Metods2 {

	public static void main(String[] args) {
		String yeniMesaj=sehir();
		System.out.println(yeniMesaj);
		int sayi=topla(7,9);
		System.out.println(sayi);
		}

	public static String sehir() {
		return "Ýstanbul";
	}
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
}

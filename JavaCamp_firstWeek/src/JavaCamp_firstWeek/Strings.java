package JavaCamp_firstWeek;

public class Strings {

	public static void main(String[] args) {
		String c�mle="bug�n haVa �ok G�zel";
		  System.out.println(c�mle);
		  System.out.println("karakter say�s�:"+c�mle.length());
		  System.out.println("3. eleman:"+c�mle.charAt(2));
		  System.out.println(c�mle.concat(" ya�as�n"));
		  System.out.println(c�mle.startsWith("b"));
		  System.out.println(c�mle.endsWith("l"));
		  char[] karakterler= new char[5];
		  c�mle.getChars(0,5,karakterler,0);
		  System.out.println(karakterler);
		  System.out.println(c�mle.indexOf('a'));
		  System.out.println(c�mle.lastIndexOf('a'));
		   System.out.println(c�mle.substring(3,7));
		   for(String cumle1:c�mle.split(" ")) {
		  System.out.println(cumle1); }
		  System.out.println(c�mle.toLowerCase());
		  System.out.println(c�mle.toUpperCase());
		  System.out.println(c�mle.trim());
		 

	}

}

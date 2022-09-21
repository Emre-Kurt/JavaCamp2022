package JavaCamp_firstWeek;

public class Strings {

	public static void main(String[] args) {
		String cümle="bugÜn haVa çok Güzel";
		  System.out.println(cümle);
		  System.out.println("karakter sayýsý:"+cümle.length());
		  System.out.println("3. eleman:"+cümle.charAt(2));
		  System.out.println(cümle.concat(" yaþasýn"));
		  System.out.println(cümle.startsWith("b"));
		  System.out.println(cümle.endsWith("l"));
		  char[] karakterler= new char[5];
		  cümle.getChars(0,5,karakterler,0);
		  System.out.println(karakterler);
		  System.out.println(cümle.indexOf('a'));
		  System.out.println(cümle.lastIndexOf('a'));
		   System.out.println(cümle.substring(3,7));
		   for(String cumle1:cümle.split(" ")) {
		  System.out.println(cumle1); }
		  System.out.println(cümle.toLowerCase());
		  System.out.println(cümle.toUpperCase());
		  System.out.println(cümle.trim());
		 

	}

}

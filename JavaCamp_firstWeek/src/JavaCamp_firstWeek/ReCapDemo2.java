package JavaCamp_firstWeek;

public class ReCapDemo2 {

	public static void main(String[] args) {
		
		double[] myList = {1.3,2.7,2.9,6.5,5.2,9.6,8.2};
	        double total = 0;
	        double max = myList[0];
	        for (double number: myList){
	            if (max < number){
	                max = number;
	            }
	            total=total+number;
	            System.out.println(number);
	        }

	        System.out.println("Toplam = "+ total);
	        System.out.println("En Büyük = " + max);

	}

}

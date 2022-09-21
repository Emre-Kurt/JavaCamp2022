package JavaCamp_firstWeek;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Ýstanbul";
        sehirler[0][1] = "Çanakkale";
        sehirler[0][2] = "Balýkesir";
        sehirler[1][0] = "Kütahya";
        sehirler[1][1] = "Uþak";
        sehirler[1][2] = "Denizli";
        sehirler[2][0] = "Kayseri";
        sehirler[2][1] = "Kýrþehir";
        sehirler[2][2] = "Konya";

        for (int i = 0; i <= 2; i++){
            System.out.println("-----------------");
            for (int j = 0; j <= 2; j++){
                System.out.println(sehirler[i][j]);
            }
        }
	}

	}

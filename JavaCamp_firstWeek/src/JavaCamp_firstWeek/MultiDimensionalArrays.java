package JavaCamp_firstWeek;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];

        sehirler[0][0] = "�stanbul";
        sehirler[0][1] = "�anakkale";
        sehirler[0][2] = "Bal�kesir";
        sehirler[1][0] = "K�tahya";
        sehirler[1][1] = "U�ak";
        sehirler[1][2] = "Denizli";
        sehirler[2][0] = "Kayseri";
        sehirler[2][1] = "K�r�ehir";
        sehirler[2][2] = "Konya";

        for (int i = 0; i <= 2; i++){
            System.out.println("-----------------");
            for (int j = 0; j <= 2; j++){
                System.out.println(sehirler[i][j]);
            }
        }
	}

	}

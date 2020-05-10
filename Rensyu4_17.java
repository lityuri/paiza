package rensyu;

public class Rensyu4_17 {
	public static void main(String[] args) {
		int i ;
		int j ;

		for (i = 1; i <=9 ; i ++) {
			for (j = 1; j <=9; j ++) {
				int x = i * j;
				System.out.printf("%2d" , x);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}

package rensyu2;

public class Rensyu6_6 {
	public static void main(String[] args) {
		kuku(1);
		kuku(2);
		kuku(3);
		kuku(4);
		kuku(5);
		kuku(6);
		kuku(7);
		kuku(8);
		kuku(9);
	}

	public static void kuku(int x) {
		int[][] kuku = new int[9][9];

		for (int i = 0; i < 9; i ++) {
			for (int j = 0; j < 9; j ++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < 9; i ++) {
			System.out.print(kuku[x - 1][i] + " ");
		}
		System.out.println("");
	}
}

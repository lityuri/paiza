package algo;

import java.util.Scanner;

public class Algo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("空白で区切って加算/減算演算を入力");
		String input = scan.nextLine();
		String[] param = input.split(" ");
		int sum = 0;

		for (int i = 0; i < param.length; i ++) {
			if (i == 0) {
				sum += Integer.parseInt(param[i]);
			} else if (param[i].equals("+") ) {
				sum += Integer.parseInt(param[i + 1]);
			} else if(param[i].equals("-")) {
				sum -= Integer.parseInt(param[i + 1]);
			}
			//System.out.println(i + "ループ目" + sum);
		}
		System.out.println(sum);
	}
}

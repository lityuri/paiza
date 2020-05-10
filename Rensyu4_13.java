package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu4_13 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int strike = 0;
		int ball = 0;
		int fall = 0;
		int num = 0;
		//String s = br.readLine();

		System.out.println("ストライク=1 or ボール=2 or ファウル=3 ?");

		while (strike < 3 && ball < 4) {
			String s = br.readLine();
			num = Integer.parseInt(s);
			if (!(num == 1 || num == 2 || num == 3)) {
				while(!(num == 1 || num == 2 || num == 3)) {
					System.out.println("入力が正しくありません。1 or 2");
					String s1 = br.readLine();
					num = Integer.parseInt(s1);
				}
				if (num == 1) {
					strike ++;
				} else if (num == 2) {
					ball ++;
				} else if (num == 3) {
					if (strike < 2) {
						strike ++;
					} else if (ball < 3){
						ball ++;
					}
				}
			} else if (num == 1) {
				strike ++;
			} else if (num == 2) {
				ball ++;
			} else if (num == 3) {
				if (strike < 2) {
					strike ++;
				} else if (ball < 3){
					ball ++;
				}
			}
		}
		System.out.println(ball + "ボール、" + strike + "ストライク");
	}
}

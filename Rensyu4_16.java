package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu4_16 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("2以上の数値を入力");

		int n = 0;
		//int amari = 0;

		while(!(n >= 2)) {
			String s = br.readLine();
			n = Integer.parseInt(s);
			if (!(n >= 2)) {
				System.out.println("不正な値。再入力");
			}
		}
		System.out.println("入力値は" + n);

		/*
		for (int i = 2; i <= n; i ++) {
			//amari = n;
			if (n % i == 0) {
				n /= i;
				System.out.print(i + " ");
			}
		}
		if (!(n == 1)) {
			System.out.print(n);
		}
		*/

		for (int i = 2; n > 1; i ++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
	}
}

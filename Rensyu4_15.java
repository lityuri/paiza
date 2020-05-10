package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu4_15 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("4以上の自然数を入力");
		//String s = br.readLine();i
		int num = 0;
		int amari = 0;

		while (num < 4) {
			String s = br.readLine();
			num = Integer.parseInt(s);
			if (num < 4) {
				System.out.println("再入力してください");
			}
		}
		System.out.println("入力された数値は" + num);

		/*
		for (int i = 2; i < num ; i ++) {
			amari = num % i;
			if (amari == 0) {
				System.out.println(num + "は" + i + "で割り切れるので素数ではない");
			}
		}*/
		int num1 = num;

		for (int p = 2; p < num1; p ++) {
			if (p * p > num1) {
				break;
			}
			while (num1 % p == 0) {
				num1 /= p;
				num1 /= p;
			}
			if(num1 > 1) {
				System.out.println(num + "は素数");
			} else {
				System.out.println(num + "は素数ではない");
			}
		}
	}
}

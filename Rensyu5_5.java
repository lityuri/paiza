package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu5_5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String s = br.readLine();
		System.out.println("数値を入力");
		int value = Integer.parseInt(br.readLine());

		int binary[] = new int[16];
		//配列 binaryに0か1を代入する

		for (int i = 15 ; i >= 1 ; i -- , value /= 2) {
			binary[i] = value % 2;
		}

		System.out.println("2進数に変換すると、");
		for (int i = 0; i < 16; i ++)
			System.out.print(binary[i]);
	}
}

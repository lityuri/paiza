package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu4_11 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数値を入力");
		String s = br.readLine();
		int scan = Integer.parseInt(s);

		int count = 0;

		for (int i = 0; i <= scan ; i ++) {
			System.out.print(count);
			count++;
			if (count > 9) {
				count = 0;
			}
		}
	}

}

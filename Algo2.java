package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("空白で区切って1回の四則演算を入力");
		String input = br.readLine();
		String[] param = input.split(" ");

		int result = 0;
		int amari = 0;

		switch (param[1]) {
		case "+":
			result = Integer.parseInt(param[0]) + Integer.parseInt(param[2]);
			break;
		case "-":
			result = Integer.parseInt(param[0]) - Integer.parseInt(param[2]);
			break;
		case "*":
			result = Integer.parseInt(param[0]) * Integer.parseInt(param[2]);
			break;
		case "/":
			result = Integer.parseInt(param[0]) / Integer.parseInt(param[2]);
			amari = Integer.parseInt(param[0]) % Integer.parseInt(param[2]);
		}
		System.out.print(result);
		if (param[1].equals("/")) {
			System.out.print(" ... " + amari);
		}
	}
}

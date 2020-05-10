package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu2_6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("年齢はいくつですか？");
		String s = br.readLine();
		int n = Integer.parseInt(s);

		int days = n * 365;
		System.out.println("あなたが生まれてからおおよそ" + days +"日です");
	}

}

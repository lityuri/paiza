package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu2_5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ひとつめの数値を入力してください");
		String s1 = br.readLine();
		int n1 = Integer.parseInt(s1);
		System.out.println("ふたつめの数値を入力してください");
		String s2 =br.readLine();
		int n2 = Integer.parseInt(s2);

		int ave = (n1 + n2) / 2;
		System.out.println(n1 + "と" + n2 +"の平均値の整数部分は" + ave);
		//double num1 = (double)n1;
		//double num2 = (double)n2;
		double avg = (n1 + n2) / 2.0;
		System.out.println(n1 + "と" + n2 + "の平均値は" + avg);
	}

}

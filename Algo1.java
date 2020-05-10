package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("空白で区切って整数を2つ入力");
		String input = br.readLine();
		String[] param = input.split(" ");

		int sum = 0;
		for (int i = 0; i < param.length; i ++) {
			String s = param[i];
			sum += Integer.parseInt(s);
		}
		System.out.println("和は" + sum);

	}

}

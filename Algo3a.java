package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo3a {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");

		String type = null;
		Integer sum = 0;
		for (int i = 0; i < param.length; i ++) {
			if (param[i].equals("+") || param[i].equals("-")) {
				type = param[i];
			} else {
				Integer num = Integer.parseInt(param[i]);
				if (type != null) {
					if (type.equals("+")) {
						sum += num;
					} else if (type.equals("-")) {
						sum -= num;
					}
				} else {
					sum = num;
				}
			}
		}
		System.out.println(sum);
	}

}

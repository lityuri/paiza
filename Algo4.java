package algo;

import java.util.Scanner;

public class Algo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] param = s.split(" ");
		int sum = calc(param, 0 , param.length - 1);
		System.out.println(sum);
	}

	public static int calc(String[] param, int startIdx, int endIdx) {
		String type = null;
		int sum = 0;
		for(int idx = startIdx; idx < endIdx; idx ++) {
			if (param[idx].equals("+") || param[idx].equals("-")) {
				type = param[idx];
			} else if (param[idx].equals("(")){
				int endOfFormula = checkEndOfFormula(param, idx);
				if (type != null) {
					if (type.equals("+")) {
						sum += calc(param, idx + 1, endOfFormula - 1);
					} else if (type.contentEquals("-")) {
						sum -= calc(param, idx + 1, endOfFormula - 1);
					}
				} else {
					sum = calc(param, idx + 1, endOfFormula - 1);
				}
				idx = endOfFormula;
			} else {
				if (type != null) {
					int num = Integer.parseInt(param[idx]);
					if (type.equals("+")) {
						sum += num;
					} else if (type.equals("-")) {
						sum -= num;
					} else {
						sum = num;
					}
				}
			}
		}
		return sum;
	}

	public static int checkEndOfFormula(String[] param, int startIdx) {
		int end = startIdx + 1;
		int startCount = 0;
		for (int idx = startIdx + 1; idx < param.length; idx ++) {
			end = idx;
			if (param[idx].equals("(")) {
				startCount ++;
			} else if (param[idx].equals(")")) {
				if (startCount == 0) {
					break;
				} else {
					startCount --;
				}
			}
		}
		return end;
	}
}

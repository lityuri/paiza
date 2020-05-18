package paiza;

import java.util.Scanner;

//https://paiza.jp/en_try/challenges/239/retry

public class C051 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(" ");

        int[] sum = new int[12];

        sum[0] = Integer.parseInt(s[0] + s[1]) + Integer.parseInt(s[2] + s[3]);
        sum[1] = Integer.parseInt(s[0] + s[1]) + Integer.parseInt(s[3] + s[2]);
        sum[2] = Integer.parseInt(s[0] + s[2]) + Integer.parseInt(s[1] + s[3]);
        sum[3] = Integer.parseInt(s[0] + s[2]) + Integer.parseInt(s[3] + s[1]);
        sum[4] = Integer.parseInt(s[0] + s[3]) + Integer.parseInt(s[1] + s[2]);
        sum[5] = Integer.parseInt(s[0] + s[3]) + Integer.parseInt(s[2] + s[1]);
        sum[6] = Integer.parseInt(s[1] + s[0]) + Integer.parseInt(s[2] + s[3]);
        sum[7] = Integer.parseInt(s[1] + s[0]) + Integer.parseInt(s[3] + s[2]);
        sum[8] = Integer.parseInt(s[2] + s[0]) + Integer.parseInt(s[1] + s[3]);
        sum[9] = Integer.parseInt(s[2] + s[0]) + Integer.parseInt(s[3] + s[1]);
        sum[10] = Integer.parseInt(s[3] + s[0]) + Integer.parseInt(s[1] + s[2]);
        sum[11] = Integer.parseInt(s[3] + s[0]) + Integer.parseInt(s[2] + s[1]);

        int max = sum[0];

        for (int i = 1; i < 12; i ++) {
        	if (max < sum[i]) {
        		max = sum[i];
        	}
        }

        System.out.println(max);
	}
}

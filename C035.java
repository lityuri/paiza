package paiza;

/*
https://paiza.jp/en_try/challenges/153/retry

総合力を重視する paiza 大学の入試では 1 次試験 (英語、数学、理科、国語、地理歴史の 5 科目で各 100 点満点) の成績で2段階選抜を行います。2段階選抜を通過する条件は以下のようになっています。

全科目の合計得点が 350 点以上
理系の受験者の場合は理系 2 科目 (数学、理科) の合計得点が 160 点以上
文系の受験者の場合は文系 2 科目 (国語、地理歴史) の合計得点が 160 点以上
受験者それぞれの各科目の点数が入力されるので、何人2段階選抜を通過できるかを求めてください。

例）

図1

受験者 2 は全科目の合計は 350 点以上ですが文系 2 科目の合計が 160 点未満なので不合格。一方受験者 4 は理系 2 科目の合計は 160 点以上ですが全科目の合計が 350 点未満なので不合格となります。

→ 通過人数: 2 人

これは入力例 1 に対応しています。
 */

import java.util.Scanner;

public class C035 {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String line = sc.nextLine();
	    int n = Integer.parseInt(line);

	    int clear = 0;
	    int total;
	    int num;

	    String[] student = new String[n];
	    String[] str = new String[6];
	    int[] points = new int[5];

	    for (int i = 0; i < n; i ++) {
	    	student[i] = sc.nextLine();
	    }

	    for(int i = 0; i < n; i ++) {
	    	str = student[i].split(" ");
	    	for (int j = 0; j < 5; j ++) {
	    		points[j] = Integer.parseInt(str[j+1]);
	    	}
    		total = 0;
    		num = 0;
    		for (int a = 0; a < 5; a ++) {
    			total += points[a];
    		}
	    	if (str[0].equals("l")) {
	    		num = points[3] + points[4];
	    	} else if (str[0].equals("s")) {
	    		num = points[1] + points[2];
	    	}
	    	if (total >= 350 && num >= 160) {
	    		clear += 1;
	    	}
    	}

	    System.out.println(clear);
	}
}

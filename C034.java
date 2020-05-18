package paiza;

import java.util.Scanner;

/*
 https://paiza.jp/en_try/challenges/146/retry

 あなたは小学校一年生の先生です。今週の授業で、足し算と引き算を教えます。あなたは、足し算と引き算を用いた宿題を作る必要があり、そのためのプログラムを書くことにしました。

以下の手順で問題をランダム生成するプログラムはもうできているのですが、その答えを求めるプログラムはまだできていません。答えを求めるプログラムを書いてください。

[問題生成の手順]

1. 正しい式 a + b = c, あるいは a - b = c (a, b, c, は整数) を生成する
2. a, b, c のうちいずれか 1 つを空欄にする

この空欄に入れるべき整数が「答え」となります。

ここに、足し算、引き算の問題について例を一つずつ示します。



図の問題において、答えは、それぞれ 4, 3 となります。これらはそれぞれ入力例 1, 2 に対応しています。
 */

public class C034 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");

        int n1 = 0;
        int n2 = 0;
        int x = 0;

        	if (str[0].equals("x")) {
        		n1 = Integer.parseInt(str[2]);
        		n2 = Integer.parseInt(str[4]);
        		if (str[1].equals("+")) {
        			x = n2 - n1;
        		} else if (str[1].equals("-")) {
        			x = n2 + n1;
        		}
        	} else if (str[2].equals("x")) {
        		n1 = Integer.parseInt(str[0]);
        		n2 = Integer.parseInt(str[4]);
        		if (str[1].equals("+")) {
        			x = n2 - n1;
        		} else if (str[1].equals("-")) {
        			x = n1 - n2;
        		}
        	} else if (str[4].equals("x")) {
        		n1 = Integer.parseInt(str[0]);
        		n2 = Integer.parseInt(str[2]);
        		if (str[1].equals("+")) {
        			x = n1 + n2;
        		} else if (str[1].equals("-")) {
        			x = n1 - n2;
        		}
        	}

        System.out.println(x);
	}
}

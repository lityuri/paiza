package paiza;

/*
 https://paiza.jp/en_try/challenges/266/retry
 あなたは PAIZA 大学の講義を受講した学生の評価をしています。
学生の成績はテストの点数から 欠席回数 × 5 点 を引いた点数とすることにしました。
成績がマイナスとなった場合は 0 とします。

学生のテストと欠席回数のデータが学籍番号順に与えられたとき、成績が合格点以上になっている学生の学籍番号を順に出力するプログラムを作成してください。
学籍番号は 1 から順に与えられます。

例えば、入力例 1 の場合では以下のようになります。

img

学籍番号 1 ではテストの点数が 80 点で欠席回数が 11 回なので 成績は 25 点となり合格点以上となっています。
同様にして、成績を計算すると合格点を超えている学生の学籍番号は 1, 3, 4 となります。
 */
import java.util.Scanner;

public class C056 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] lines = line.split(" ");

        int ninzu = Integer.parseInt(lines[0]);
        int goukaku = Integer.parseInt(lines[1]);

        String[] student = new String[ninzu];
        int point = 0;
        int kesseki = 0;

        for (int i = 0; i < student.length; i ++) {
        	student[i] = sc.nextLine();
        	String[] str = student[i].split(" ");
        	point = Integer.parseInt(str[0]);
        	kesseki = Integer.parseInt(str[1]);
        	int check = point - (kesseki * 5);

        	if (check < 0) {
        		check = 0;
        	}

        	if (check >= goukaku) {
        		System.out.println(i + 1);
        	}
        }
    }
}
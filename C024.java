package paiza;
/*
 https://paiza.jp/en_try/challenges/91/retry

 あなたの友人である K 氏は電子工作が大好きです。
彼は毎晩試行錯誤を重ね、最近ついにコンピュータのミニチュア版を開発することに成功しました。

彼のコンピュータはちょうど 2 つの変数を持っており、どちらの変数も 0 で初期化されています。
また、彼のコンピュータは次の 3 種類の命令を実行することができます。

・SET i a : 変数 i に値 a を代入する (i = 1, 2)
・ADD a :「変数 1 の値 + a」を計算し、計算結果を変数 2 に代入する
・SUB a :「変数 1 の値 - a」を計算し、計算結果を変数 2 に代入する

彼は、自分のコンピュータが正しく動いているかどうかチェックしてほしいと依頼してきました。
コンピュータが完成して嬉しそうな彼の頼みを断るわけにはいきません。
そんな彼のために、彼のコンピュータをシミュレートするプログラムを書きましょう。

次の図は入力例 1 における変数の値の変化を示しています。

 */

import java.util.Scanner;

public class C024 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        String[] lines = new String[n];

        int num1 = 0;
        int num2 = 0;

   		String[] strSet = new String[3];
		String[] strAdd = new String[2];
		String[] strSub = new String[2];

        for (int i = 0; i < lines.length; i ++) {
        	lines[i] = sc.nextLine();
        }

        for (int i = 0; i < lines.length; i ++) {
        	if (lines[i].startsWith("SET")) {
        		strSet = lines[i].split(" ");
        		int x = Integer.parseInt(strSet[1]);
        		int a = Integer.parseInt(strSet[2]);
        		if (x == 1) {
        			num1 = a;
        		} else if (x == 2) {
        			num2 = a;
        		}
        	} else if (lines[i].startsWith("ADD")) {
        		strAdd = lines[i].split(" ");
        		num2 = num1 + Integer.parseInt(strAdd[1]);
        	} else if (lines[i].startsWith("SUB")) {
        		strSub = lines[i].split(" ");
        		num2 = num1 - Integer.parseInt(strSub[1]);
        	}
        }

        System.out.println(num1 + " " + num2);

	}
}

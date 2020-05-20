package paiza;

import java.util.Scanner;

/*
 https://paiza.jp/en_try/challenges/242/retry

 いまどきの表計算ソフトにはオートフィルという機能があります。
この機能は選択している表の部分の縦と横の数列の差から等差数列を作り、その数列で残りを入力してくれます。

すなわち、 2 行 2 列目以降の i 行 j 列目の要素を a_{i, j} で表した場合

・a_{i, j} = a_{i, j - 1} + (a_{i, 2} - a_{i, 1}) ※ 任意の行が等差数列になっている事を示します
・a_{i, j} = a_{i - 1, j} + (a_{2, j} - a_{1, j}) ※ 任意の列が等差数列になっている事を示します

を同時に満たすように表に入力します。

例えば、以下のような表に対してオートフィルを使うと

図1

このように、2 x 2 の部分から行、列それぞれ等差数列を作って残りを自動で入力します。

図2

あなたは大量のデータを打ち込みたくないので、このオートフィル機能を使おうとしています。
使った際の結果を出力するプログラムを作成してください。
 */

public class B053 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ");
        int x = Integer.parseInt(lines[0]);
        int y = Integer.parseInt(lines[1]);

        /*
        List<String> s1 = new LinkedList<>();
        String[] s2;

        for (int i = 0; i < x; i ++) {
        	s2 = new String[y];
        	s1(i) = s2;
        }

        //与えられた数値を配列に格納
        String[] s = sc.nextLine().split(" ");
        num1[0] = Integer.parseInt(s[0]);
        num1[1] = Integer.parseInt(s[1]);
        s = sc.nextLine().split(" ");
        num2[0] = Integer.parseInt(s[0]);
        num2[1] = Integer.parseInt(s[1]);
*/

        int[][] num = new int[x][y];

        //与えられた数値を配列に格納
        String[] s = sc.nextLine().split(" ");
        num[0][0] = Integer.parseInt(s[0]);
        num[0][1] = Integer.parseInt(s[1]);
        s = sc.nextLine().split(" ");
        num[1][0] = Integer.parseInt(s[0]);
        num[1][1] = Integer.parseInt(s[1]);

        for (int i = 2; i < y; i ++) {
        	int n = num[0][1] - num[0][0];
        	num[0][i] = num[0][i - 1] + n;
        }
        for (int i = 2; i < y; i ++) {
        	int n = num[1][1] - num[1][0];
        	num[1][i] = num[1][i - 1] + n;
        }

        for(int i = 0; i < y; i ++) {
        	for (int j = 2; j < x; j ++){
        	int n = num[1][i] - num[0][i];
        	num[j][i] = num[j - 1][i] + n;
        	}
        }

        for (int i = 0; i < x; i ++) {
        	for (int j = 0; j < y; j ++) {
        		System.out.print(num[i][j]);
        		if (j < y -1) {
        			System.out.print(" ");
        		}
        	}
    		System.out.println("");
        }
	}
}

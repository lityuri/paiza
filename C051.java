package paiza;

import java.util.Scanner;

//https://paiza.jp/en_try/challenges/239/retry

/*
 フライト中に退屈してしまったあなたは、持っているトランプを使用した簡単な遊びを考えました。

この遊びでは 1 から 9 までの数字のカードのみを 4 枚使用します。
ただし、この 4 枚の中で同じ数値のカードが重複する事もあります。
ルールは以下の通りです。

4 枚のカードを横に並べます。
左から 2 枚のカード、右から 2 枚のカードをそれぞれ 2 ケタの整数とみなし、和を計算します。
あらゆる並べ方を試し、和の最大値（最大スコア）を求めます。

カード 4 枚に書かれた数が与えられるので、最大スコアを出力してください。
入力例 1 の 2, 9, 3, 8 の 4 枚を使う場合、以下の 12 通りの和の最大値 175 が最大スコアとなります。

カードの 4 枚の並べ方は 4! = 24 通り存在しますが、足し算は順序に依存しないため、12 通りのみ考慮すればよいことに注意してください。
たとえば、9, 2, 3, 8 の順で並べた場合のスコアは 92 + 38 = 130 となります。

・92 + 38 = 130
・92 + 83 = 175
・93 + 28 = 121
・93 + 82 = 175
・98 + 23 = 121
・98 + 32 = 130
・39 + 28 = 67
・38 + 29 = 67
・82 + 39 = 121
・89 + 23 = 112
・89 + 32 = 121
・83 + 29 = 112
 */

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

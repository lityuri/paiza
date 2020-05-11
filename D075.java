package paiza;

/*
https://paiza.jp/en_try/challenges/359/retry
paiza 市に住んでいるあなたは、普段の移動手段は全て paiza バスを使います。paiza バスでは paica という IC カードを乗車券として使うことができます。事前に paica にチャージをすることで利用できます。

バスの運賃支払に paica のカード残額を使うと、運賃の 10 % が paica ポイントとしてたまります。

バスを降車する時に、支払う運賃以上のポイントがある場合は、ポイントが優先的に運賃の支払いに使われます。ただし、1 ポイントは 1 円になります。ただし、ポイントで運賃を支払った場合、新たなポイントは発生しません。

図1

あなたは、カード残金とポイントをどれくらい使ったか知るためのプログラムを書くことにしました。

あなたには、最初にチャージする現金と、バスを利用した時にかかった料金のリストが与えられるので、毎回の降車時に残っているお金とポイントを出力してください。

ただし、途中でカード残高とポイントの両方が運賃を下回ることはありません。

入力例 1 は以下のようになります。
図2
*/
import java.util.Scanner;

public class D075 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] lines = line.split(" ");
        int[] cash = new int[2];
        int point = 0;

        for (int i = 0; i < lines.length; i ++) {
        	cash[i] = Integer.parseInt(lines[i]);
        }

        String[] lines2 = new String[cash[1]];
        int[] carry = new int[cash[1]];

        for (int i = 0; i < lines2.length; i ++) {
        	lines2[i] = sc.nextLine();
        	carry[i] = Integer.parseInt(lines2[i]);
        }

        for (int i = 0; i < carry.length; i ++) {
        	if (point > carry[i]) {
        		point -= carry[i];
        	} else {
        		cash[0] -= carry[i];
        		point += carry[i] / 10;
        	}
        	System.out.println(cash[0] + " " + point);
        }
    }
}
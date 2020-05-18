package paiza;

import java.util.Scanner;

/*
 https://paiza.jp/en_try/challenges/261/retry

 あなたはサーバ管理者です。 日々洪水のように流れるログを追っています。
とうとう自分の目と頭では処理しきれない量になってしまったため、プログラムを作って、重要な文字列を含むログだけ抽出する事にしました。

例えば、入力例 2 では、ログは上から順に "pizza"、 "paiza"、 "aizu"、 "ai"、 "sai" の 5 つです。
この 5 つのログに対して、重要な文字列 "ai" が含まれているのは "pizza" 以外の 4 つです。
結果として "pizza" だけが除かれ、 "paiza"、 "aizu"、 "ai"、 "sai" がこの順に抽出されます。

img

このように、ログと重要な文字列が与えられたとき、重要な文字列が含まれているログを抽出して出力するプログラムを作成してください。
重要な文字列が含まれていない場合は "None" と出力してください。
 */

public class C055 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        String key = sc.nextLine();
        String[] str = new String[n];

        for (int i = 0; i < str.length; i ++) {
        	str[i] = sc.nextLine();
        }

        int count = 0;

        for (int i = 0; i < str.length; i ++) {
        	if (str[i].contains(key)){
        		System.out.println(str[i]);
        	} else {
        		count ++;
        	}
        }

        if (count == str.length) {
        	System.out.println("None");
        }

	}
}

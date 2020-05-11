package paiza;

import java.util.Scanner;

/*
 Leet と呼ばれるインターネットスラングがあります。
Leet ではいくつかのアルファベットをよく似た形の他の文字に置き換えて表記します。 Leet の置き換え規則はたくさんありますが、ここでは次の置き換え規則のみを考えましょう。
置き換え前	置き換え後
A	4
E	3
G	6
I	1
O	0
S	5
Z	2
文字列が入力されるので、これを Leet に変換して出力するプログラムを書いてください。
 */

public class C016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        line = line.replace("A", "4");
        line = line.replace("E", "3");
        line = line.replace("G", "6");
        line = line.replace("I", "1");
        line = line.replace("O", "0");
        line = line.replace("S", "5");
        line = line.replace("Z", "2");

        System.out.println(line);
    }
}
package paiza;

/*
 * あなたは英語の文法チェック・修正システムの作成を担当しています。 このシステムを実現するには、英単語を複数形に変換する機能が必要です。

単語の複数形への変換は、次のルールに従い行われます。

・末尾が s, sh, ch, o, x のいずれかである英単語の末尾に es を付ける
・末尾が f, fe のいずれかである英単語の末尾の f, fe を除き、末尾に ves を付ける
・末尾の1文字が y で、末尾から2文字目が a, i, u, e, o のいずれでもない英単語の末尾の y を除き、末尾に ies を付ける
・上のいずれの条件にも当てはまらない英単語の末尾には s を付ける

入力された英単語を複数形に変換するプログラムを作成してください。

※必ずしも実在の英単語が入力されるわけではありません。単純に文字列を上記のルールに沿って変換するプログラムを作成してください。
*/
import java.util.Scanner;

public class B021{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        String[] lines = new String[n];

        for (int i = 0; i < lines.length; i ++) {
        	String str = sc.nextLine();
        	lines[i] = str;
        }

        String[] matubi0 = new String[] {"s","o","x","sh","ch"};
        String[] matubi2 = new String[] {"f","fe"};
        String[] matubi3 = new String[] {"a","i","u","e","o"};

        for (int a = 0; a < lines.length; a ++) {
        	String line = lines[a];

//末尾が s, sh, ch, o, x のいずれかである英単語の末尾に es を付ける
        	for (int b = 0; b < matubi0.length; b ++) {
        		if (line.endsWith(matubi0[b])) {
        			//|| line.lastIndexOf(matubi0[b]) == 1) {
        			line = line + "es";
        			break;
        		}
        		 /*末尾が f, fe のいずれかである英単語の末尾の f, fe を除き、
        		末尾に ves を付ける*/
        		else if (line.endsWith("f")) {
        			String x = line.substring(line.length() - 1);
        			line = x + "ves";
        			break;
        		} else if (line.endsWith("fe")) {
        			line.substring(line.length() - 2);
        			line = line + "ves";
        			break;
        		}
//末尾の1文字が y で、末尾から2文字目が a, i, u, e, o のいずれでもない英単語の末尾の y を除き、末尾に ies を付ける
        		else if (line.endsWith("y")) {
        			for (int i = 0; i < matubi3.length; i ++) {
        				if (!(line.endsWith(matubi3[i]))) {
        					line.substring(line.length() - 1);
        					line = line + "ies";
        					break;
        				}
        			}
        		} else {
  //上のいずれの条件にも当てはまらない英単語の末尾には s を付ける
                	line += "s";
                	break;
            	}
        	}
        	System.out.println(line);
        }
    }
}
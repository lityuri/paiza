package paiza;

/*
 https://paiza.jp/en_try/challenges/49/retry

 平日の朝、できるだけ長く寝ていたいと思ったあなたは、「何時に家を出発すれば遅刻せずに出社できるか？」ということを常々考えています。

あなたの通勤ルートは次のようになっています。

1. 自宅から配座（ぱいざ）駅まで a 分間歩く。
2. 配座駅に着いた後、一番早く来た電車に b 分間電車に乗って儀野（ぎの）駅に到着する。
　(駅に到着してから電車に乗り込むまでの時間は考慮せず、駅に到着した時刻の電車にも乗り込めるものとします)
3. 儀野駅から会社まで c 分間歩く。

図

あなたの会社では 8:59 までに出社すれば遅刻扱いにはなりません。 何時に自宅を出れば遅刻せずに出社できるでしょうか？
このような時間の中で最も遅い時刻を求めるプログラムを書いてください。

例えば、以下の入力例1の場合
入力例1
30 30 10
3
6 0
7 0
8 0
配座駅には 6:00, 7:00, 8:00 に電車が来ます。
7:30 に自宅を出れば 8:00 の電車に乗ることができて、8:40 に出社できます。
よって出力は以下のようになります。

出力例1
07:30
 */

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B013 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);
        int c = Integer.parseInt(lines[2]);

        //到着時刻、出発時刻
        final LocalTime LTF = LocalTime.of(8, 59);
        LocalTime lt;
        LocalTime x = null;

        //        System.out.println(LTF);

        //電車の本数
        int n = Integer.parseInt(sc.nextLine());
        //時刻表の変数
        String[] nS = new String[n];

        for (int i = 0; i < n; i ++) {
        	nS[i] = sc.nextLine();
        }

        //時刻表の時刻
        List<LocalTime> liL = new ArrayList<LocalTime>();
    	String[] s = new String[2];

        for (int i = 0; i < n; i ++) {
        	s = nS[i].split(" ");
     		int n0 = Integer.parseInt(s[0]);
     		int n1 = Integer.parseInt(s[1]);
        	liL.add(LocalTime.of(n0, n1));
        }

        //会社から逆算して始発駅までの最短時刻
        lt = LTF.minusMinutes(c);
        lt = lt.minusMinutes(b);

        //        System.out.println(lt);

        //遅刻しない最も遅い時刻から自宅までの所要時間を引いた時刻
        for (int i = 0; i < n; i ++) {
        	if (lt.isAfter(liL.get(i))) {
        		LocalTime y = liL.get(i).minusMinutes(a);
        		if(x == null) {
        			x = y;
        		} else if (x.isBefore(y)) {
        			x = y;
        		}
        	}
        }
        System.out.println(x);
	}
}

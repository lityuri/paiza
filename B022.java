package paiza;

import java.util.Scanner;

/*
  https://paiza.jp/en_try/challenges/82/retry

 Paiza 国の選挙シーズンがやってきました。 今回の選挙では M 人の立候補者と N 人の有権者がいます。
Paiza 国の人々は政治に無関心なので、最初、すべての有権者はどの立候補者も支持していません。

Paiza 国には大きな広場が一つあります。 選挙活動の期間中、立候補者たちはこの広場で一人ずつ演説をします。
（同じ人が複数回演説することもあれば、1 回も演説しないこともあります。）

演説が終わるたびに、「他のそれぞれの立候補者の支持者から 1 人ずつ」および「誰も支持していない有権者から 1 人」が演説をした人を支持するようになります。

次の図は支持者の人数の変化の一例を表しています。
この例では 3 人の立候補者 (A、B、C とする) と 3 人の有権者がおり、A → A → B → C の順に計 4 回の演説が行われます。


すべての演説が終わった後、最も支持者が多い立候補者を求めてください。
 */

public class B022 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");

        int n1 = Integer.parseInt(str[0]);
      //立候補者(n-1)の配列に支持者を格納
        int[] sumR = new int[n1];

        //有権者数
        int numY = Integer.parseInt(str[1]);

        //演説回数
        int num = Integer.parseInt(str[2]);
        //立候補者の演説順
        int[] numE = new int[num];

        for (int i = 0; i < numE.length; i ++) {
        	numE[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < numE.length; i ++) {
        	for (int j = 0; j < sumR.length; j ++) {
        		if (numE[i] -1 == j) {

        		} else if (sumR[j] > 0) {
        			sumR[j] --;
        			sumR[numE[i] - 1] ++;
        		}
        	}
        	if (numY > 0) {
        		numY --;
        		sumR[numE[i] - 1]  ++;
        	}

        }

        int max = 0;

        for (int i = 0; i < sumR.length; i ++) {
        	if (max < sumR[i]) {
        		max = sumR[i];
        	}
        }

        for (int i = 0; i < sumR.length; i ++) {
        	if (max == sumR[i])
        		System.out.println(i + 1);
        }

	}
}

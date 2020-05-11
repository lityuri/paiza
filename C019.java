package paiza;

/*
 各 N_i に対して

・N_i が完全数であれば "perfect"
・N_i がほぼ完全数であれば "nearly"
・どちらでもなければ "neither"

と 1 行に出力してください。

最後は改行し、余計な文字、空行を含んではいけません。
 */

import java.util.Scanner;

public class C019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int lines = Integer.parseInt(line);
        int[] num = new int[lines];
        int sum = 0;

        for (int i = 0; i < lines; i ++) {
        	String str = sc.nextLine();
        	int n = Integer.parseInt(str);
        	num[i] = n;
        }

        for (int i = 0; i < num.length; i ++) {
       		sum = 0;
         	for (int j = 1; j < num[i] ; j ++) {
        		int n = num[i];
        		if ((n % j) == 0) {
        			sum += j;
        		}
        	}

   		 if (num[i] == sum) {
			 System.out.println("perfect");
		 } else if (num[i] - sum == 1) {
			 System.out.println("nearly");
		 } else {
			 System.out.println("neither");
		 }
        }
    }
}
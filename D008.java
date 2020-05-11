package paiza;

/*
N が奇数なら"odd" 偶数なら"even" と半角英文字で出力して下さい。
最後は改行し、余計な文字、空行を含んではいけません。
 */
import java.util.Scanner;

public class D008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);

        if (num % 2 == 1) {
        	System.out.println("odd");
        } else if(num % 2 == 0) {
        	System.out.println("even");
        }
    }
}
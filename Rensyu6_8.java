package rensyu2;

public class Rensyu6_8 {
	public static  void main(String[] args) {
		for (int i = 11; i <= 20; i ++) {
			System.out.println(fibo(i));
		}
	}

	public static int fibo(int n) {
		//int n1 = 0;
		//int n2 = 1;
		//int n3 = n1 + n2;

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	/*	if (n >= 2) {
			for (int i = 2 ; i < n +1 ; i ++) {
				n1 = n2;
				n2 = n3;
				n3 = n1 + n2;
			}
		}
		return n1;*/
	}
}

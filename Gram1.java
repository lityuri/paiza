package gram;

public class Gram1 {
	public static void main(String[] args) {
		int count = args.length;
		System.out.println("引数は3個指定されています。");

		for (int i = 0; i < args.length; i ++) {
			System.out.println(i + "番目の引数は「" + args[i] + "」です。");
		}
	}

}

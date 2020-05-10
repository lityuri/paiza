package thread;

public class ThreadSample1 extends Thread{
	public static void main(String[] args) {
		ThreadSample1 sample1 = new ThreadSample1();
		sample1.start();

		for (int i = 0; i < 10; i ++) {
			System.out.println("mainメソッドでの処理 = " + i);
		}
	}

	@Override
	public void run() {
		for (int r = 0; r < 10; r ++) {
			System.out.println("runメソッドでの処理" + r);
		}
	}

}

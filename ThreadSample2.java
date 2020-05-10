package thread;

public class ThreadSample2 implements Runnable{
	public static void main(String[] args) {
		ThreadSample2 sample2 = new ThreadSample2();
		Thread thread = new Thread(sample2);
		thread.start();

		for (int i = 0; i < 10; i ++){
			System.out.println("mainメソッドでの処理 = " + i);
		}
	}

	public void run() {
		for (int r = 0; r < 10; r ++) {
			System.out.println("runメソッドでの処理" + r);
		}
	}
}

package thread;

public class Interrupt {
	public static void main(String[] args) {
		MultiThread1 mt = new MultiThread1();
		mt.start();

		try {
			for (int i = 0; i < 3; i ++) {
				long start = System.currentTimeMillis();
				Thread.sleep(1000);
				mt.interrupt();
				long stop = System.currentTimeMillis();
				System.out.println((stop - start) + "[ms]");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MultiThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 3; i ++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド2の" + (i + i) + "度目の処理");
			} catch (InterruptedException e) {
				System.out.println("割り込まれました");
			}
		}
	}
}
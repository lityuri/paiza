package thread;

public class Join {
	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start();

		try{
			System.out.println("別スレッドの処理を待機します。");
			mt.join();
			System.out.println("別スレッドの処理が終わりました。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MultiThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 3; i ++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド2の" + (i + 1) + "度目の処理");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
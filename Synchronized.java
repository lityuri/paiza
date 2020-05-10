package thread;

public class Synchronized {
	public static void main(String[] args) {
		PrintClass pc = new PrintClass();

		MultiThread2 mt1 = new MultiThread2(pc);
		MultiThread3 mt2 = new MultiThread3(pc);
		mt1.start();
		mt2.start();
	}

}

class PrintClass{
	private boolean b1 = false;

	public synchronized void method1(String str, int i) {
		while(b1 == true) {
			try {
				wait(); //b1がtrueの間待機
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(str + "の" + (i + 1) + "度目の処理");
		b1 = true;
		//b1にtrueを代入したあと、待機状態のスレッドを実行可能状態に
		notifyAll();
	}

	public synchronized void method2(String str, int i) {
		while(b1 == false) {
			try {
				wait(); //b1がfalseの間待機
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(str + "の" + (i + 1) + "度目の処理");
			b1 = false;

			// b1にfalseを代入したあと、待機状態のスレッドを実行可能状態に
			notifyAll();
		}
	}
}


class MultiThread2 extends Thread{
	private PrintClass pc;

	public MultiThread2(PrintClass pc) {
		this.pc = pc;
	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i ++) {
			pc.method1("スレッド1", i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MultiThread3 extends Thread{
	private PrintClass pc;

	public MultiThread3(PrintClass pc) {
		this.pc = pc;
	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i ++) {
			pc.method2("スレッド2", i);
		}
	}
}
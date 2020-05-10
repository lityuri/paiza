package janken;

import java.util.Random;
import java.util.Scanner;

public class Janken {
	private String player;
	private String machine;
	int ran;

	public void janken() {
		System.out.println("ジャンケンゲームです");
		System.out.println("手を選択してください。グー,チョキ,パー");
		player = new Scanner(System.in).nextLine();

		Random r = new Random();

		if (!(player.equals("グー") || player.equals("チョキ") || player.equals("パー"))){
			while(!(player.equals("グー") || player.equals("チョキ") || player.equals("パー"))) {
			System.out.println("再入力してください");
			player = new Scanner(System.in).nextLine();
			}
		}
		System.out.println("あなたの手は" + player);

		ran = r.nextInt(3);
		switch (ran){
			case 0:
				machine ="グー";
			case 1:
				machine = "チョキ";
			case 2:
				machine = "パー";
		}
		System.out.println("システムの手は" + machine);

		if (player.equals(machine)) {
			System.out.println("あいこです");

			while (player.equals(machine)) {
				System.out.println("手を選択してください。グー,チョキ,パー");
				player = new Scanner(System.in).nextLine();

				if (!(player.equals("グー") || player.equals("チョキ") || player.equals("パー"))){
					while(!(player.equals("グー") || player.equals("チョキ") || player.equals("パー"))) {
					System.out.println("再入力してください");
					player = new Scanner(System.in).nextLine();
					}
				}
				System.out.println("あなたの手は" + player);

				ran = r.nextInt(3);
				switch (ran){
					case 0:
						machine ="グー";
					case 1:
						machine = "チョキ";
					case 2:
						machine = "パー";
				}
				System.out.println("システムの手は" + machine);
			}
		}
		if (player.equals("グー") & machine.equals("チョキ") ||
				player.equals("チョキ") & machine.equals( "パー") || player.equals("パーー") & machine.equals( "グー")) {
			System.out.println("あなたの勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}
	}
}

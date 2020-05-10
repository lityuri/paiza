package dicegame;

public class Twenty1 extends Dealer{
	private int set = 21;

	public void twenty1(Player p) {
		System.out.println(set + "ゲームです");
		this.jun(p);
		/*
		Random ran = new Random();
		int jun = ran.nextInt(1);

		if (jun == 0) {
			System.out.println("あなたが先攻です");
			int r = p.roll();
			this.setField(r);
		} else {
			System.out.println("あなたが後攻です");
		}*/

		while (this.getField() <set) {
			System.out.println("ディーラーのターンです");
			int r2 = this.roll();
			this.setField(this.getField() + r2);

			if (this.getField() == set) {
				System.out.println("あなたの負けです");
			} else if 	(this.getField() >set ) {
				System.out.println("あなたの勝ちです");
			}

			System.out.println("あなたのターンです");
			int r1 = p.roll();
			this.setField(this.getField() + r1);
			if (this.getField() == set) {
				System.out.println("あなたの勝ちです");
			} else if 	(this.getField() > set) {
				System.out.println("あなたの負けです");
			}
		}
	}
}

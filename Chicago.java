package dicegame;

public class Chicago  extends Dealer{
	private int set = 2;

	public void chicago(){
		Player p = new Player();
		Dealer d = new Dealer();

		System.out.println("ダイスゲーム\"シカゴ\"です");
		//System.out.println("1ターン目");
		/*d.jun(p);
		if(d.getField() != 0) {
			int i = p.roll() + d.getField();
			if (i == 2) {
				p.setPoint(2);
				System.out.println(p.getPoint() + "ポイント獲得");
			} else {
				System.out.println("ポイントを獲得できませんでした");
			}*/
		int turn = 1;

		while(turn < 12) {
			System.out.println(turn + "ターン目");
			int r1 = p.roll();
			int r2 = p.roll();
			if (r1 + r2 == turn +1) {
				int point = p.getPoint() + turn + 1;
				p.setPoint(point);
				System.out.println("あなたのポイントは+" + (turn + 1));
			} else {
				System.out.println(turn + "ターン目はポイントを獲得できませんでした");
			}

			int dr1 = d.roll();
			int dr2 = d.roll();
			if (dr1 + dr2 == turn + 1) {
				int point = d.getPoint() + turn + 1;
				d.setPoint(point);
				System.out.println("ディーラーのポイントは+" + (turn + 1));
			} else {
				System.out.println("ディーラーはポイントを獲得できませんでした");
			}

			System.out.println("あなたのポイントは" + p.getPoint());
			System.out.println("ディーラーのポイントは" + d.getPoint());

			turn ++;
		}
		System.out.println("ゲーム終了");
		if (p.getPoint() > d.getPoint()) {
			System.out.println("あなたの勝ち");
		} else if (p.getPoint() == d.getPoint()) {
			System.out.println("引き分け");
		} else {
			System.out.println("あなたの負け");
		}
	}
}

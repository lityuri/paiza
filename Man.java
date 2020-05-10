package dicegame;

public abstract class Man {
	int points = 0;
	private static int field = 0;
	int[] deme;

	public void setPoint(int point) {
		this.points = point;
	}
	public int getPoint() {
		return this.points;
	}
	public void setField(int field) {
		this.field = field;
		System.out.println("フィールドのポイントは" + this.field);
	}
	public int getField(){
		//System.out.println("フィールドのポイントは" + this.field);
		return this.field;
	}

	public abstract int roll();
}

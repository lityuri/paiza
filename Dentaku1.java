package dentaku;

public class Dentaku1 {
	public static void main(String[] args) {
		int val1 = 0; //最初の数字
		int val2 = 0; //次の数字
		String ope; //演算子
		int kekka = 0;

		if (args.length != 3) {
			errDisp("演算子は kake waru tasu hiku の4つです");
			}

		try{
			val1 = Integer.parseInt(args[0]);
			val2 = Integer.parseInt(args[2]);
		} catch(NumberFormatException e) {
		errDisp("数値でない値が入力されています");
		}

		ope = args[1];

		boolean errFlag = true;
		/*
		if (ope.equals("kake")) {
			errFlag = false;
		}
		if (ope.equals("waru")) {
			errFlag = false;
		}
		if (ope.equals("tasu")) {
			errFlag = false;
		}
		if (ope.equals("hiku")) {
			errFlag = false;
		}

		if (!ope.equals("kake")) {
			if (!ope.equals("waru")) {
				if (!ope.equals("tasu")) {
					if (!ope.equals("hiku")) {
						errFlag = true;
					}
				}
			}
		}

		if (ope.equals("kake") || ope.equals("waru") || ope.equals("tasu") || ope.equals("hiku")) {
			errFlag = false;
		}
		*/
		String[] opeStr = {"kake", "waru", "tasu", "hiku"};

		for (int i =0; i < 4 ; i ++) {
			if (ope.equals(opeStr[i])) {
				errFlag = false;
			}
		}

		if (errFlag == true) {
			errDisp("演算子は kake waru tasu hiku の4つです");
		}

		if (ope.equals("kake")) {
			kekka = val1 * val2;
		} else if (ope.equals("tasu")) {
			kekka = val1 + val2;
		} else if (ope.equals("hiku")) {
			kekka = val1 - val2;
		} else {
			if (val2 == 0) {
				errDisp("0で割ろうとしました");
			} else {
				kekka = val1 / val2;
			}
		}

		System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
		System.out.println("結果は" + kekka);
	}

	public static void errDisp(String err) {
		System.out.println("Usage : java dentaku 数値 演算子 数値");
		System.out.println(err);
		System.exit(0); //プログラムを終了
	}

}

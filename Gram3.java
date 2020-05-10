package gram;

import java.util.Arrays;
import java.util.List;

public class Gram3 {
	public static void main(String[] args) {
		List<String> params = Arrays.asList(args);
		for (String param : params) {
			System.out.println(param);
		}

		/*
		List<String> list = new ArrayList<String>();

		for (int i =0; i < args.length; i ++ ) {
			list.add(args[i]);
		}
		for (int i = 0 ; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		*/
	}
}

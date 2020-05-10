package knowledge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Know3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String text;

		try {
		InputStreamReader file = new InputStreamReader(new FileInputStream(args[0]));
		BufferedReader br = new BufferedReader(file);


		while ((text = br.readLine()) != null) {
			list.add(text);
			System.out.println(text);
		}
		file.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		for (String s : list) {
			System.out.println(s);
		}

		for(int i = list.size()-1 ; i > -1 ; i --) {
			System.out.println(list.get(i));
		}
		int index = list.indexOf("あいうえお");
		if (index != -1) {
		System.out.println((index + 1) + "行目");
		}
	}

}

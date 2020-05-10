package knowledge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Know5 {
	public static void main(String[] args) {
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0]));
			BufferedReader buff = new BufferedReader(reader);

			String text;
			Map<String, String> map = new TreeMap<String, String>(new NameComparator());

			while ((text = buff.readLine()) != null) {
				String[] str = text.split(" ");
				map.put(str[0] , str[1]);
			}
			reader.close();

			for (Map.Entry<String, String> entry: map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		/*
		try {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0]));
		BufferedReader buff = new BufferedReader(reader);
		String text;
		Map<String, String> map = new HashMap<String, String>();

		while ((text = buff.readLine()) != null) {
			String[] value = text.split(" ");
			map.put(value[0], value[1]);
		}
		reader.close();

		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);

		for (String nkey :map.keySet()) {
			System.out.println(map.keySet() + " " + map.get(nkey));
		}



		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		*/
	}
}

class NameComparator implements Comparator<String>{
	//@Override
	public int compare(String x, String y) {
		if (x.length() > y.length()) {
			return 1;
		}
		if (x.length() < y.length()) {
			return -1;
		}
		return x.compareTo(y);
	}
}

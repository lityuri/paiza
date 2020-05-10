package knowledge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Know4 {
	public static void main(String[] args) {
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

			for (Map.Entry<String, String> e: map.entrySet()) {
				System.out.println(e.getKey() + e.getValue());
			}

			String place = map.get("TOKYO");
			if (place != null) {
				System.out.println("TOKYO=>" + place);
			}

		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		/*
		//String key;
		//String yoso;
		String text;
		Map<String , String> map = new HashMap<String , String>();

		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0]));
			BufferedReader br = new BufferedReader(reader);

			while ((text = br.readLine()) != null) {
				String[] str = text.split(" ", 0);
				map.put(str[0], str[1]);
				System.out.println(text);
			}
			reader.close();


			for (String key: map.keySet()) {
				String facter = map.get(key);
				System.out.println("キーは" + key + "、値は" + facter);
			}
			System.out.println("キー：TOKYOの値は、" + map.get("TOKYO"));
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		*/
	}
}

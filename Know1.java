package knowledge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Know1 {
	public static void main(String[] args) {
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0]), "SJIS");
			BufferedReader buff = new BufferedReader(reader);
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(args[1]),"SJIS");
			//FileReader file = new FileReader(args[0]);
			//BufferedReader buff = new BufferedReader(file);
			//FileWriter writer = new FileWriter(args[1]);

			String text;
			while ((text = buff.readLine()) != null) {
				System.out.println(text);
				writer.write(text);
				writer.write("\r\n");
			}
			reader.close();
			//file.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		String txt;

		try {
			File file = new File(args[0]);
			FileReader filereader = new FileReader(file);
			BufferedReader br = new BufferedReader(filereader);

			File file1 = new File(args[1]);
			FileWriter filewriter = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(filewriter);

			//String str = br.readLine();
			while((txt = br.readLine()) != null) {
				System.out.println(txt);
				//str = br.readLine();
				bw.write(txt);
				bw.write("\r\n");
			}
			filereader.close();
			filewriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
}

package knowledge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Know2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			int c = 0;

			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException fnoe) {
			fnoe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}


/*		byte[] b = new byte[4096];
		int readByte = 0, totalByte = 0;

		try {
		DataInputStream dataInStream =
				new DataInputStream(new BufferedInputStream(
						new FileInputStream(args[0])));

		DataOutputStream dataOutStream =
				new DataOutputStream(new BufferedOutputStream(
						new FileOutputStream(args[1])));

		while ((readByte = dataInStream.read(b)) != -1) {
			dataOutStream.write(b, 0, readByte);
			totalByte += readByte;
			System.out.println("Read:" + readByte + "Total:" + totalByte);
		}
		dataInStream.close();
		dataOutStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}

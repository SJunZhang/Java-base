package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamTest1 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://12//4.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}

		OutputStream os = new FileOutputStream(file);
		String str1 = "sdfdsf";
		byte[] b = str1.getBytes();
		os.write(b, 0, b.length);
		os.flush();
		os.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		String str = "ancbddd";
		bw.write(str + "\n");
		bw.flush();
		bw.close();

	}

}

package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

public class PringWirteTest1 {
	public static void main(String[] args) {
		File file = new File("D://11//1.txt");
		File file2 = new File("D://11//2.txt");
		try {
			PrintWriter pw = new PrintWriter(file2);
			
			InputStream is = new FileInputStream(file);
			byte [] b = new byte[1024];
			int len = 0;
			String str;
			while((len = is.read(b, 0, b.length))!=-1){
				str = new String(b, 0, len);
				pw.write(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

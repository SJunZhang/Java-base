package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @Description:printStream是往一个文件中写String
 * @author zsj
 * @date 2017年10月25日 下午2:58:28
 */
public class PrintStreamTEST1 {
	public static void main(String[] args) {
		File file = new File("D://11//2.txt");
		File sourceFile = new File("D://11//1.txt");
		try {
			PrintStream printStream = new PrintStream(file);
			InputStream is = new FileInputStream(sourceFile);
			byte[] b = new byte[1024];
			int len = 0;
			String str;
			while ((len = is.read(b, 0, b.length)) != -1) {
				str = new String(b, 0, len);
				System.out.println(str);
				printStream.println(str);
			}
			is.close();
			printStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

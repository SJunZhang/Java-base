package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		File file = new File("D://11/1.txt");
		
		if(file.exists()){
			InputStream is = new FileInputStream(file);
			byte [] b=new byte[1024];
			int len = 0;
			while((len = is.read(b, 0, b.length))!=-1){
				String str = new String(b, 0, len);
				System.out.println(str);
			}
			
			is.close();
		}
		
		
	}

}

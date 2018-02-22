package Socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Text {
	public static void main(String[] args) throws Exception {
		
		File file = new File("D://11//ip.html");
		InputStream is = new FileInputStream(file);
		byte []b=new byte[1024];
		int len = 0;
		while((len = is.read(b, 0, b.length))!= -1){
			String str = new String(b, 0, len);
			System.out.println(str);
		}
		is.close();
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = br .readLine();
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

	
	public void test(){
	}
}

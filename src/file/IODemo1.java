package file;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class IODemo1 {
	
	public static void main(String[] args) {
		
		File file = new File("D://11//ip.html");
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			byte []b = new byte[1024];
			int len = 0;
			String s;
			while((len = dis.read(b, 0, b.length))!=-1){
				s = new String(b, 0, len);
				System.out.println(s);
			}
			dis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

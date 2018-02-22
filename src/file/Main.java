package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
	public static void main(String[] args) {
		
		File file = new File("sql.txt");
		InputStream is;
		try {
			is =  new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String str = br.readLine();
			while(str!=null ){
				System.out.println(str);
				str = br.readLine();
				
				
//				String subStr2 = str2.split("-")[0];
//				System.out.println(new String(subStr2.getBytes(), "utf-8"));
//				String subStr1 = str.replaceAll("活動物", subStr2);
//				
//				String strUTF = new String(subStr1.getBytes(), "utf-8");
//				//System.out.println(strUTF);
//				bw.write(strUTF+ "\n");
//				bw.flush();
//				
//				str2 = br2.readLine();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

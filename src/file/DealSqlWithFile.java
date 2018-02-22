package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DealSqlWithFile {
	public static void main(String[] args) throws Exception {
//		URL url1 = DealSqlWithFile.class.getResource("/sql.txt");
//		URL url2 = DealSqlWithFile.class.getResource("/goods.txt");
//		URL url3 = DealSqlWithFile.class.getResource("/result.txt");
		File file = new File("D://11//sql.txt");
		File file2 = new File("D://11//goods.txt");
		File file3 = new File("D://11//result.txt");
			InputStream is = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String str = br.readLine();
			
			InputStream is2 = new FileInputStream(file2);
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is2, "UTF-8"));
			String str2 = br2.readLine();
			
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3)));
			
			while(str!=null && str2!=null){
				str = br.readLine();
				
				String subStr2 = str2.split("-")[0];
				System.out.println(new String(subStr2.getBytes(), "utf-8"));
				String subStr1 = str.replaceAll("活動物", subStr2);
				
				String strUTF = new String(subStr1.getBytes(), "utf-8");
				//System.out.println(strUTF);
				bw.write(strUTF+ "\n");
				bw.flush();
				
				str2 = br2.readLine();
				
			}
//			byte [] b=new byte[1024];
//			int len = 0;
//			while((len = is.read(b, 0, b.length))!=-1){
//				String str = new String(b, 0, len);
//				System.out.println(str);
//			}
			br.close();
			is.close();
			br2.close();
			is2.close();
			bw.close();
		}
		
		
	

}

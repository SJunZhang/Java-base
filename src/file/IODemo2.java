package file;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @Description:java1.0的时候要自定义对system.in就行inputStream的封装
 * @author zsj
 * @date 2017年10月24日 下午8:42:34
 */
public class IODemo2 {
	public static void main(String[] args) {
		
		DataInputStream dis = new DataInputStream(new BufferedInputStream(System.in));
		String s;
		try {
			while((s = dis.readLine())!=null){
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

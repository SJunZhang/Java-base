package Socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientA {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("127.0.0.1", 8900);

//			InputStream is = socket.getInputStream();
//			byte[] bytes = new byte[1024];
//			int len = 0;
//			String inStr;
//			while ((len = is.read(bytes, 0, bytes.length)) != -1) {
//				inStr = new String(bytes, 0, len);
//				System.out.println(inStr);
//			}

			Scanner sc = new Scanner(System.in);
			while (true) {
				String str = sc.next();
				OutputStream os = socket.getOutputStream();
				os.write(str.getBytes());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package Socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Description:服务端和客服端通信
 * @author zsj
 * @date 2017年10月24日 下午2:12:52
 */
public class ServerA {
	static InputStream inputStream;
	static OutputStream outputStream;
	static Socket socket;

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8900);
		while (true) {
			socket = server.accept();
			inputStream = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int len = 0;
			String str;
			while((len=inputStream.read(bytes, 0, bytes.length))!=-1){
				str = new String(bytes, 0, len);
				System.out.println(str);
			}
			
//			Scanner scanner = new Scanner(System.in);
//			while(true){
//				String outStr = scanner.nextLine();
//				outputStream = socket.getOutputStream();
//				outputStream.write(outStr.getBytes());
//			}
			
			
		}

	}

}

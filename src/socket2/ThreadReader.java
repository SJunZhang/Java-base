package socket2;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ThreadReader extends Thread {

	Socket socket;

	public ThreadReader(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			while (true) {

				InputStream is = socket.getInputStream();
				byte[] b = new byte[1024];
				int len = 0;
				while((len=is.read(b,0,b.length))!=-1){
					String str = new String(b, 0, len);
					System.out.println(str);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

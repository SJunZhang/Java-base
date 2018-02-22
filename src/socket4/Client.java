package socket4;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8888);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		String str = "i am client";
		bw.write(str);
		bw.newLine();
		bw.close();
		socket.close();
	}

}

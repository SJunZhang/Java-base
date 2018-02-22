package socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	private static ArrayList<Socket> list = new ArrayList<Socket>();
	static InputStream inputStream;
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		while (true) {
			Socket socket = server.accept();
			list.add(socket);
			new ServerThread(socket, list).start();
//			inputStream = socket.getInputStream();
//			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//			String line = br.readLine();
//			System.out.println("server:"+line);
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
		}

	}

}

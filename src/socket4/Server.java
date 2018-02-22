package socket4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		
		BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str;
		while(!(str = br.readLine()).equals("exit")){
			System.out.println("From Client:"+str);
		}
		br.close();
		socket.close();
	}

}

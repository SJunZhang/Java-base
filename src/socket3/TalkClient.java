package socket3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TalkClient {
	public static void main(String args[]) {
		try {
			// 向本机的4700端口发出客户请求
			Socket socket = new Socket("127.0.0.1", 4700);
			// 由系统标准输入设备构造BufferedReader对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// 由Socket对象得到输出流，并构造PrintWriter对象
			//PrintWriter os = new PrintWriter(socket.getOutputStream());
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 由Socket对象得到输入流，并构造相应的BufferedReader对象
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readline;
			readline = sin.readLine(); // 从系统标准输入读入一字符串
			// 若从标准输入读入的字符串为 "bye"则停止循环
			while (!readline.equals("bye")) {
				bw.write(readline+"\n");//必须加一行的结束符，因为服务器在接收的时候，readLine是读取一行，没遇到换行就读取不出来。
				bw.flush();
				//os.println(readline);// 将从系统标准输入读入的字符串输出到Server
				//os.flush();// 刷新输出流，使Server马上收到该字符串
				//System.out.println("Client:" + readline);// 在系统标准输出上打印读入的字符串
				System.out.println("Server:" + is.readLine());// 从Server读入一字符串，并打印到标准输出上
				readline = sin.readLine(); // 从系统标准输入读入一字符串
			} // 继续循环
			bw.close();
			//os.close(); // 关闭Socket输出流
			is.close(); // 关闭Socket输入流
			socket.close(); // 关闭Socket
		} catch (Exception e) {
			System.out.println("Error" + e); // 出错，则打印出错信息
		}
	}

}

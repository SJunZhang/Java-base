package UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class DatagramTest1 {
	public static void main(String[] args) throws Exception {

		// DatagramSocket socket = new DatagramSocket(8899);
		// byte [] b = new byte[1024];
		//
		// DatagramPacket packer = new DatagramPacket(b, b.length);
		String cmd = "cmd /c dir D:";
		final Process process = Runtime.getRuntime().exec(cmd);
		printMessage(process.getInputStream());
		printMessage(process.getErrorStream());
		int value = process.waitFor();
		System.out.println(value);
	}

private static void printMessage(final InputStream input) {
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			Reader reader = new InputStreamReader(input);
			BufferedReader bf = new BufferedReader(reader);
			String line = null;
			try {
				while((line = bf.readLine())!=null){
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}).start();
	
	
}
}

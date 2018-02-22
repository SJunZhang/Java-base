package com.fiberhome;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadSecurity {
	public static void main(String[] args) {
		new ThreadSecurity().sartThread();
	}

	public void sartThread() {
		final Outerput outerput = new Outerput();

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (outerput) {
						outerput.print("zhangsan");
					}
				}
			}

		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (outerput) {
						outerput.print("lisi");
						
					}
				}
			}

		}).start();
	}

	public class Outerput {
		public void print(String name) {
			synchronized (this) {
				
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
				printToFile(name.charAt(i));
			}
			printToFile('\r');
			printToFile('\n');
			System.out.println();
			}
		}

		public synchronized void printToFile(char ch) {
			try {

				File file = new File("D:\\outputChar_ok.txt");
				FileWriter fw = new FileWriter(file, true);

				FileOutputStream fos = new FileOutputStream("D:\\outputChar2_ok.txt", true);
				fos.write(ch);
				fos.flush();
				fw.append(ch);
				fw.flush();

				fw.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
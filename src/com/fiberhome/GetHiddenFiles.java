package com.fiberhome;

import java.io.File;
import java.io.FileFilter;

public class GetHiddenFiles {
	public static void main(String[] args) {
		new GetHiddenFiles().getHiddenFilesWithJava8();
	}
	
	private void getHiddenFiles(){
		File hiddenFiles [] = new File("D:\\").listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isHidden();
			}
		});
		for(int i=0;i<hiddenFiles.length;i++){
			System.out.println(hiddenFiles[i].getName());
		}
	}
	
	private void getHiddenFilesWithJava8(){
		File hiddenFiles [] = new File("D:\\").listFiles(File :: isHidden);
		for(int i=0;i<hiddenFiles.length;i++){
			System.out.println(hiddenFiles[i].getName());
		}
	}

}

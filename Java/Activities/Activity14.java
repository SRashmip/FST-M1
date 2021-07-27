package FileClassActivity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
	public static void main(String[] args) {
		try {
		/*File file = new File("C:/Users/RashmiP/Pictures/IBM-FST/newfile.txt");
		boolean status = file.createNewFile();
		if(status) {
			System.out.println("File created successfully");
		}
			else {
				System.out.println("File not created already present in path");
			}*/
		File fileUtil = FileUtils.getFile("C:/Users/RashmiP/Pictures/IBM-FST/newfile.txt");
		FileUtils.readFileToString(fileUtil,"UTF8");
		
		//create directory
		File destdir  = new File("resources");
		FileUtils.copyFileToDirectory(fileUtil,destdir);
		//get file from directory
		File newfile = FileUtils.getFile(destdir,"newfile.txt");
		String newfiledata = FileUtils.readFileToString(newfile,"UTF8");
		System.out.println("Data in new file:"+ newfiledata);
		
		
		}
		catch (IOException message){
			System.out.println(message);
			
		}
	}
}

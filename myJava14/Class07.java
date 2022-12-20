package myJava14;

import java.io.BufferedReader;
import java.io.FileReader;

public class Class07 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d:\\donkey.txt");
			BufferedReader bfr=new BufferedReader(fr);
			
			String str;
			int c = 0;
			while(str = bfr.readLine() != null) {
				System.out.println(bfr.readLine());
			}
		    fr.close();
		} catch (Exception e) {
		}
	}

}

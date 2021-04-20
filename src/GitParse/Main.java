package GitParse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	public static String var;

	public static void main(String[] args) {
		try {
		File file = new File("F:\\Project\\Java Testing\\1.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		var = br.readLine();
		Parse.parse(var);
		//System.out.println(Parse.firstCut);
		//System.out.println(Parse.secondCut);
		System.out.println(Data.DataList);
		br.close();
		}catch (Exception ex) {
			System.out.println(ex);
		}
	} 
}

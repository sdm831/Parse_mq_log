package GitParse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static GitParse.Data.DataList;

public class Main {
	public static String var;

	public static void main(String[] args) {
		System.out.println("-------------------------------");
		System.out.println("Hello, start parse!");
		try {
		//File file = new File("F:\\Project\\Java Testing\\1.txt");
		File file = new File("D:\\tmp\\parse_mq\\AMQERR01_1.LOG");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);
		var = br.readLine();

		Parse.parse(var);
		//System.out.println(Parse.firstCut);
		//System.out.println(Parse.secondCut);
		br.close();
		}catch (Exception ex) {
			System.out.println(ex);
		}

		System.out.println("Print DataList:");
		int i = 1;
		for (var item : Data.DataList)		// перебор всех элементов коллекции DataList
		{
			System.out.println(i + ". " + item);
			i++;
		}
		System.out.println("-------------------------------");
	} 
}

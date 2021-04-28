package GitParse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static GitParse.Data.dataList;

public class Main 
{
	public static String str;
	public static void main(String[] args) 
	{
		System.out.println("-------------------------------");
		System.out.println("Hello, start parse!");
		try 
		{
		File file = new File("F:\\Project\\Java Testing\\AMQERR02.LOG");
		//File file = new File("D:\\tmp\\parse_mq\\AMQERR01_1.LOG");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		str = br.readLine();
		String tmpStr = "";
		while (str != null) 
		{
			tmpStr = tmpStr + str;
			if(str.startsWith("-----")) 
			{
				Parse.parse(tmpStr);
				tmpStr = "";
			}
			str = br.readLine();
		}
		br.close();
		}catch (Exception ex) 
		{
			System.out.println(ex);
		}

		System.out.println("Print DataList:");
		System.out.println(Data.dataList);
		/*
		int i = 1;
		for (var item : Data.dataList)		// перебор всех элементов коллекции DataList
		{
			System.out.println(i + ". " + item);
			i++;
		}
		*/
		System.out.println("-------------------------------");
	} 
}

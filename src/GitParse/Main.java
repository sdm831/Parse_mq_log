package GitParse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map.Entry;

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
		File file = new File("AMQERR02.LOG");
		//File file = new File("D:\\tmp\\parse_mq\\AMQERR01_1.LOG");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		str = br.readLine();
		String tmpStr = "";
		ArrayList<String> logList = new ArrayList<>();
		while (str != null) 
		{
			tmpStr = tmpStr + str;
			if(str.startsWith("-----")) 
			{
				//Parse.parse(tmpStr);
				logList.add(tmpStr);
				tmpStr = "";
			}
			str = br.readLine();
		}
		for (int i = 0; i < logList.size(); i++)
		{
			Parse.parse(logList.get(i));
			try(FileWriter writer = new FileWriter("javaparselog.txt", true))
			{
				for (Entry<String, String> entry : dataList.entrySet())
				{
					writer.write(entry.getKey() + ":" + entry.getValue());
					writer.append('\n');
					writer.flush();
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			dataList.clear();
		}
		br.close();
		}catch (Exception ex) 
		{
			//System.out.println(ex);
			ex.printStackTrace();
		}

		
		System.out.println(" ");
		System.out.println("Блок лога: " +Data.str_all);
		System.out.println("Шапка: " +Data.str_head);
		System.out.println("Остальное: " +Data.str_tail);
		System.out.println(" ");
		System.out.println("Print DataList:");
		System.out.println("-------------------------------");

	} 
}

package GitParse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
		File file = new File("test-log-1.txt");
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

		System.out.println("Блок лога: " +Data.str_all);
		System.out.println("Шапка: " +Data.str_head);
		System.out.println("Остальное: " +Data.str_tail);
		System.out.println(" ");
		System.out.println("Print DataList:");
		//System.out.println(Data.dataList);		// такой вывод не информативен, мешанина какая то получается, только путает

		// более наглядный вывод "словаря", по образу .json:  key:value, т.е. словарь у тебя собрался как надо
		for (Entry<String, String> entry : dataList.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("-------------------------------");

	} 
}

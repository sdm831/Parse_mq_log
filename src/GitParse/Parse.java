package GitParse;

public class Parse 
{	
	public static void parse(String cut) 
	{
		Data.str_all = cut;
		String clearCutHead = "";
		String clearCutTail = "";
		Data.str_head = Data.str_all.substring(Data.str_all.indexOf("Process"), Data.str_all.indexOf("AMQ"));
		Data.str_tail = Data.str_all.substring(Data.str_all.indexOf("AMQ"), Data.str_all.indexOf("-----"));
		clearCutHead = Data.str_head.replaceAll("\\s+", "");
		clearCutTail = Data.str_tail.replaceAll("\\s+", "");
		String tempCut;
		String hmName;
		String hmValue;
		int tempLenght;
		int startIndex;
		int stopIndex;
		while (clearCutHead.length() != 0) 
		{
				tempCut = "";
				hmName = "";
				hmValue = "";
				tempLenght = 0;
				startIndex = 0;
				stopIndex = 0;
				startIndex = clearCutHead.indexOf("(");
				tempCut = clearCutHead.substring(0, startIndex);
				hmName = tempCut;
				tempLenght = tempCut.length() +1;
				clearCutHead = clearCutHead.substring(tempLenght, clearCutHead.length());
				tempCut = "";
				stopIndex = clearCutHead.indexOf(")");
				if (clearCutHead.indexOf("(") < clearCutHead.indexOf(")")) 
				{
					if (clearCutHead.indexOf("(") == -1) 
					{
						stopIndex = clearCutHead.indexOf(")");
					}
					else
					stopIndex = clearCutHead.indexOf("))") +1;
				}
				tempCut = clearCutHead.substring(0, stopIndex);
				hmValue = tempCut;
				tempLenght = tempCut.length() +1;
				if (tempLenght >= clearCutHead.length()) 
				{
					tempLenght = clearCutHead.length();
				}
				clearCutHead = clearCutHead.substring(tempLenght, clearCutHead.length());
				tempCut = "";
				Data.dataList.put(hmName, hmValue);
		}
		while (clearCutTail.length() != 0)
		{
				tempCut = "";
				hmName = "";
				hmValue = "";
				tempLenght = 0;
				startIndex = 0;
				stopIndex = 0;
				startIndex = clearCutTail.indexOf(":");
				tempCut = clearCutTail.substring(0, startIndex);
				hmName = tempCut;
				tempLenght = tempCut.length() +1;
				clearCutTail = clearCutTail.substring(tempLenght, clearCutTail.length());
				tempCut = "";
				if (clearCutTail.indexOf("EXPLANATION") != -1)
				{	
					stopIndex = clearCutTail.indexOf("EXPLANATION");
					tempCut = clearCutTail.substring(0, stopIndex);
					hmValue = tempCut;
					clearCutTail = clearCutTail.substring(tempCut.length(), clearCutTail.length());
					tempCut = "";
					Data.dataList.put(hmName, hmValue);
				}
				if (clearCutTail.indexOf("EXPLANATION") == -1)
				{
					if (clearCutTail.indexOf("ACTION") != -1)
					{
						stopIndex = clearCutTail.indexOf("ACTION");
						tempCut = clearCutTail.substring(0, stopIndex);
						hmValue = tempCut;
						clearCutTail = clearCutTail.substring(tempCut.length(), clearCutTail.length());
						tempCut = "";
						Data.dataList.put(hmName, hmValue);
					}
					if (clearCutTail.indexOf("ACTION") == -1)
					{
						tempCut = clearCutTail.substring(0, clearCutTail.length());
						hmValue = tempCut;
						tempCut = "";
						Data.dataList.put(hmName, hmValue);
					}
				}
		}
	}
}
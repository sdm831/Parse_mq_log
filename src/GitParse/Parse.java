package GitParse;

public class Parse 
{	
	public static void parse(String cut) 
	{
		cut.length();
		cut.indexOf("Process");
		String clearCut = cut.substring(cut.indexOf("Process"), cut.indexOf("AMQ"));
		clearCut = clearCut.replaceAll("\\s+", "");
		String tempCut = "";
		String hmName = "";
		String hmValue = "";
		int tempLenght = 0;
		int startIndex = 0;
		int stopIndex = 0;
		while (clearCut.length() != 0) 
		{
			clearCut.length();
			if (clearCut.length() != 0) 
			{
				startIndex = clearCut.indexOf("(");
				tempCut = clearCut.substring(0, startIndex);
				//Data.DataList.add("Name " + tempCut);
				hmName = tempCut;
				tempLenght = tempCut.length() +1;
				clearCut = clearCut.substring(tempLenght, clearCut.length());
				tempCut = "";
				stopIndex = clearCut.indexOf(")");
				if (clearCut.indexOf("(") < clearCut.indexOf(")")) 
				{
					if (clearCut.indexOf("(") == -1) 
					{
						stopIndex = clearCut.indexOf(")");
					}
					else
					stopIndex = clearCut.indexOf("))") +1;
				}
				tempCut = clearCut.substring(0, stopIndex);
				//Data.DataList.add("Value " + tempCut);
				hmValue = tempCut;
				tempLenght = tempCut.length() +1;
				if (tempLenght >= clearCut.length()) 
				{
					tempLenght = clearCut.length();
				}
				clearCut = clearCut.substring(tempLenght, clearCut.length());
				tempCut = "";
				Data.dataList.put(hmName, hmValue);
			}
		}
	}
}
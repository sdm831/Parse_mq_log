package GitParse;

import java.util.ArrayList;

public class Data {
	public static ArrayList<String> DataList = new ArrayList();
	
	public static void storage(String str) {
		DataList.add(Parse.firstCut);
		DataList.add(Parse.secondCut);
		//System.out.println(DataList);
	}
}

package GitParse;

import java.util.ArrayList;

public class Data extends Parse {
	public static ArrayList<String> DataList = new ArrayList();
	
	public static storage(String firstCut, String secondCut) {
		super(firstCut, secondCut);
		DataList.add(firstCut);
		DataList.add(secondCut);
	}
}

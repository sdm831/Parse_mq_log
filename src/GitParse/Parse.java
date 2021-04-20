package GitParse;

public class Parse {
	public static String firstCut;
	public static String secondCut;
	
	public static void parse(String cut) {
		firstCut = " ";
		secondCut = " ";
		StringBuffer sb = new StringBuffer();
		sb.length();
		firstCut = Main.var.substring(0, Main.var.indexOf(" "));
		int tmpStr = firstCut.length() +1; 
		secondCut = Main.var.substring(tmpStr, Main.var.length());
		//System.out.println(firstCut);
		//System.out.println(secondCut);
		Data.storage(firstCut);
	}
}
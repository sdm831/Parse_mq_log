package GitParse;

public class Parse {
	public static String var = "F:\\Project\\Java Testing\\1.txt";
	
	
	public static void parse(String cut) {
		String firstCut = "";
		String secondCut = "";
		var.length();
		firstCut = var.substring(0, var.indexOf(" "));
		secondCut = var.substring(var.indexOf(" "), var.length());
		System.out.println(firstCut);
		System.out.println(secondCut);
		
	}
}
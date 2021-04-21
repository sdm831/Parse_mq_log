package GitParse;

public class Parse {
	public static String firstCut;
	public static String secondCut;
	
	public static void parse(String cut) {
		firstCut = " ";				// какое предназначение    ??
		secondCut = " ";			// этих переменных         ??

		StringBuffer sb = new StringBuffer();
		sb.length();	// тут ты вызываешь метод "length" над объектом "sb", но полученные данные никуда не присваиваешь
		firstCut = Main.var.substring(0, Main.var.indexOf(" "));
		int tmpStr = firstCut.length() +1; 			// удобнее называть такие переменные так: LenFirstCutStr
		secondCut = Main.var.substring(tmpStr, Main.var.length());
		//System.out.println(firstCut);
		//System.out.println(secondCut);
		// Data.storage(firstCut);       // не корректная организация метода "storage", темболее что он и не нужен

		Data.DataList.add(Parse.firstCut);		//добавляем строку "firstCut" в DataList
		Data.DataList.add(Parse.secondCut);		//	secondCut
	}
}
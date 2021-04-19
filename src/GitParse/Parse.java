package GitParse;

public class Parse {
	private String firstCut;
	private String secondCut;
	
	public void parse(String cut) {
		this.firstCut = "";
		this.secondCut = "";
		Main.var.length();
		firstCut = Main.var.substring(0, Main.var.indexOf(" "));
		secondCut = Main.var.substring(Main.var.indexOf(" "), Main.var.length());
	}
	public String getFirstCut() {
		return firstCut;
	}
	public String getSecondCut() {
		return secondCut;
	}
}
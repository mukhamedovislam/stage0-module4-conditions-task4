package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
	String result = "";
	result = first <= second ? "second" : "first";
	System.out.println(result);
    }
}

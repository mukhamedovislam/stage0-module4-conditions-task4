package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
	int result = 0;
	result = first >= second ? first : second;
	System.out.println(result);
    }
}

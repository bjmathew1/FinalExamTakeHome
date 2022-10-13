package externalFiles;

public class ExamTest1 {

	public static void main(String[] args) {	
		int firstOperand=10;
		int secondOperand =5;
		int[]c= {12,9,23,10,56,35,65,27,99,4,37};
		System.out.println (add(firstOperand,secondOperand));
		System.out.println (subtr(firstOperand,secondOperand));
		System.out.println (divide(firstOperand,secondOperand));
		System.out.println (multiple(firstOperand,secondOperand));
		System.out.println (getMax(c));
	}
	public static int add(int firstOperand, int secondOperand) {	
		return firstOperand + secondOperand;
	}
	public static int subtr(int firstOperand, int secondOperand) {	
		return firstOperand - secondOperand;
	}
	public static int divide(int firstOperand, int secondOperand) {
		if (secondOperand!=0) {
		}
		return firstOperand/secondOperand;
	}
	public static int multiple(int firstOperand, int secondOperand) {	
		return firstOperand*secondOperand;
	}
	
	public static int getMax(int[] values) {
		int max = values[0];
		for (int i=0; i<values.length; i++) {
			if (values[i]>max){
				max=values[i];
			}
		}
		return max;
		
	}
}

package day3.H;
import java.util.*;
import day3.E.Solution;

public class StarngeCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		for(int i=1;i<num;i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			Solution obj = new Solution(num1, num2);
		}
	}
}



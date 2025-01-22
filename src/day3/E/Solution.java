package day3.E;

public class Solution {
	int num1, num2;
	public Solution(int n1, int n2){
		this.num1 = n1;
		this.num2 = n2;
//		sum(num1,num2);
//		substract(num1,num2);
//		multiply(num1,num2);
//		divide(num1,num2);
//		reminder(num1,num2);
//		larger(num1,num2);
//		smaller(num1,num2);
//		average(num1,num2);
	}
	void sum(int n1, int n2) {
		System.out.println("Sum of numbers: "+(n1+n2));
	}
	void substract(int n1, int n2) {
		System.out.println("Difference of numbers: "+(n1-n2));
	}
	void multiply(int n1, int n2) {
		System.out.println("Multiplication of numbers: "+(n1 * n2));
	}
	void divide(int n1, int n2) {
		System.out.println("Division of numbers: "+(n1 / n2));
	}
	void reminder(int n1, int n2) {
		System.out.println("Reminder of numbers: "+(n1 % n2));
	}
	void larger(int n1, int n2) {
		System.out.print("Larger number is ");
		if(n1>n2)System.out.println(n1);
		else System.out.println(n2);
	}
	void smaller(int n1, int n2) {
		System.out.print("Smaller number is ");
		if(n1 < n2)System.out.println(n1);
		else System.out.println(n2);
	}
	void average(int n1, int n2) {
		double num = n1+n2;
		System.out.println("Average of numbers: "+(num/2));
	}
	
}

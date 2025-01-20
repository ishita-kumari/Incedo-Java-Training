package day1;

import java.util.Scanner;
public class SumOfOddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number you want to enter: ");
		int number=sc.nextInt();
		int sum=0;
		System.out.print("Now enter numbers: ");
		for(int i=1;i<=number;i++) {
			int temp=sc.nextInt();
			if(temp%2==1)sum+=temp;
		}
		System.out.print(sum);
		sc.close();
	}
}

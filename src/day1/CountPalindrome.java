package day1;

import java.util.*;


/*Program to print Palindrome number upto N numbers

*/
public class CountPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(Palindrome.isPalinDrome(""+i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}

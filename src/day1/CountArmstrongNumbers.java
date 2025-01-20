package day1;

public class CountArmstrongNumbers {
	public static void main(String[] args) {
		int cnt =0;
		for(int i=1;i<=1000;i++) {
			int size = (""+i).length();
			if(ArmstrongNumber.isArmstrongNumber(size, i)) {
				cnt++;
			}
		}
		System.out.println("Total armstrong numbers: "+ cnt);
	}
}

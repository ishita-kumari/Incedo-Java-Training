package day3.I;
import java.util.*;

class HeadsOrTailsGame{
	int num;
	public HeadsOrTailsGame(){
		num = new Random().nextInt(2);
	}
	
	int getHeadsOrTails() {
		switch(num) {
			case 0:{
				System.out.println("Tossed Coin value: "+0);
				return 0;
			}
			default:{
				System.out.println("Tossed Coin value: "+1);
				return 1;
			}
		}
	}
}
public class HeadsOrTails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		HeadsOrTailsGame game = new HeadsOrTailsGame();
		int tossValue = game.getHeadsOrTails();
		if(tossValue == num) {
			System.out.println("You won!!!");
		}
		else {
			System.out.println("You lost!!");
		}
		
	}
}

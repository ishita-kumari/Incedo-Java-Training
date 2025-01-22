package design_patterns;

public class Singleton {
	// step1: Private static variable to hold the single instance
	private static Singleton instance;
	
	// step2: private constructor to prevent instantiation from other classes
	private Singleton() {}
	
	// step3: Public method to provide access to the instance
	public static Singleton getInstance() {
		if(instance == null)instance = new Singleton();
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton logger1 = Singleton.getInstance();
		Singleton logger2 = Singleton.getInstance();
		if(logger1.equals(logger2)) {
			System.out.println("Both of the logger have the same instance");
		}
		
	}

}

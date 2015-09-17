package mainPackage;

public class MyInteger {
	
	private int value;
	
	// Constructor
	public MyInteger(int x) {
		this.value = x;
	}
	
	// Getter
	public int getValue() {
		return this.value;
	}
	
	// Non-static public methods
	
	public boolean isEven() {
		return (this.value % 2 == 0);
	}
	
	public boolean isOdd() {
		return (this.value % 2 != 0);
	}
	
	public boolean isPrime() {
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Static methods w/ int parameters
	
	public static boolean isEven(int a) {
		return (a % 2 == 0);
	}
	
	public static boolean isOdd(int a) {
		return (a % 2 != 0);
	}
	
	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Static methods w/ MyInteger parameters
	
	public static boolean isEven(MyInteger b) {
		return (b.value % 2 == 0);
	}
	
	public static boolean isOdd(MyInteger b) {
		return (b.value % 2 != 0);
	}
	
	public static boolean isPrime(MyInteger b) {
		for (int i = 2; i < b.value; i++) {
			if (b.value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// equals(int) & equals(MyInteger)
	
	public boolean equals(int c) {
		return (this.value == c);
	}
	
	public boolean equals(MyInteger c) {
		return (this.value == c.value);
	}
	
	// Parsing methods
	
	public static int parseInt(char[] r) {
		int x = 0;
		for (int i = 0; i < r.length; i++) {
			x += Character.getNumericValue(r[i]);
		}
		return x;
	}
	
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
}

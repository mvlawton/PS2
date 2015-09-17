package MainPackage;

public class MyInteger {
	
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	
	
	
	public boolean isEven() {
		return ((this.getValue() % 2) == 0);
	}
	
	public boolean isOdd() {
		return ((this.getValue() % 2) != 0);
	}
	
	public boolean isPrime() {
		if (this.getValue() <= 1) {
			return false;
		}
		else if (this.getValue() <= 3) {
			return true;
		}
		else for (int i = 2; i <= Math.sqrt(this.getValue())+1; i++) {
			if ((this.getValue() % i == 0)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static boolean isEven(int v) {
		return ((v % 2) == 0);
	}
	
	public static boolean isOdd(int v) {
		return ((v % 2) != 0);
	}
	
	public static boolean isPrime(int v) {
		if (v <= 1) {
			return false;
		}
		else if (v <= 3) {
			return true;
		}
		else for (int i = 2; i <= Math.sqrt(v) + 1; i++) {
			if ((v % i) == 0) {
				return false;
			}
		}
		return true;
	}

	
	
	public static boolean isEven(MyInteger mi) {
		return ((mi.getValue() % 2) == 0);
	}
	
	public static boolean isOdd(MyInteger mi) {
		return ((mi.getValue() % 2) != 0);
	}
	
	public static boolean isPrime(MyInteger mi) {
		if (mi.getValue() <= 1) {
			return false;
		}
		else if (mi.getValue() <= 3) {
			return true;
		}
		else for (int i = 2; i <= Math.sqrt(mi.getValue())+1; i++) {
			if ((mi.getValue() % i == 0)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public boolean equals(int v) {
		return (this.getValue() == v);
	}
	
	public boolean equals(MyInteger mi) {
		return (this.getValue() == mi.getValue());
	}
	
	
	
	public static int parseInt(char[] c) {
		String value = c.toString();
		return value.hashCode(); 
	}
	
	public static int parseInt(String s) {
		return s.hashCode();
	}
}

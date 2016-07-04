
public class Math {
	
	private int a;
	private int b;
	
	public Math(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		return a + b;
	}
	
	public int multiply() {
		return a * b;
	}
	
	public double divide() {
		return ((double)a)/((double)b);
	}
	
	public int subtract() {
		return a - b;
	}
	
	public int loop() {
		while (true) {
			if (a == 3) {
				break;
			} else {
				continue;
			}
		}
		return a;
	}
}

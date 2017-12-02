package put.io.testing.whitebox;

public class AnotherCalculator {
	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int calculate() {
		int result = 0;

		if (a > 0) {
			result += a;
		}

		if (b <= 0) {
			result += b;
		}

		for (int i = 0; i < c; i++) {
			result += a;
		}

		return result;
	}
}

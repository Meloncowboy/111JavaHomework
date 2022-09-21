package abc;

public class class09 {

	static class CCalculator{
		
		int a;
		int b;
		int c;
		
		void set_value(int x, int y, int z) {
			a = x;
			b = y;
			c = z;
		}
		
		void show() {
			System.out.printf("%d %d %d\n", a,b,c);
		}
		int add() {
			return a + b + c;
		}
		int sub() {
			return a-b-c;
		}
		int mul() {
			return a * b * c;
		}
		double avg() {
			return a + b + c/3;
		}

	}
	
	public static void main(String[] args) {
		CCalculator a1 = new CCalculator();
		a1.set_value(25, 3, 7);
		a1.show();
		System.out.println(a1.add());
		System.out.println(a1.sub());
		System.out.println(a1.mul());
		System.out.println(a1.avg());

	}

}

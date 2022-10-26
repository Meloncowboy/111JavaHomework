package java10;

class Caaa{
	public int num1;
	public int num2;
	void show() {
		System.out.println(num1 + "　" + num2);
	}
	public Caaa() {
		num1 = 1;
		num2 = 1;
	}
	public Caaa(int a, int b) {
		num1 = a;
		num2 = b;
	}
}
class Cbbb extends Caaa{
	void set_num(int a, int b) {
		num1 = a;
		num2 = b;
	}
	public Cbbb(int a, int b) {
		super(a, b);
	}
}

public class class03 {

	public static void main(String[] args) {
		Caaa a = new Caaa();
		a.show();
		Caaa b = new Caaa(4, 5);
		b.show();
		Cbbb c = new Cbbb(6, 7);
		c.show();
	}
}

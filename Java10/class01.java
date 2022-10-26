package java10;

class Caaa{
	public int num1;
	public int num2;
	void show() {
		System.out.print(num1 + "　" + num2);
	}
}
class Cbbb extends Caaa{
	void set_num(int a, int b) {
		num1 = a;
		num2 = b;
	}
}
public class class01 {

	public static void main(String[] args) {
		Cbbb bb = new Cbbb();
		bb.set_num(5,10);
		bb.show();

	}

}

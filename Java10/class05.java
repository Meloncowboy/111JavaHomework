package java10;

class Caaa{
	private int num;
	public Caaa(int a) {
		num = a;
	}
	public int get() {
		return num;
	}
}
class Cbbb extends Caaa{
	public Cbbb(int a) {
		super(a);
	}
	public void show() {
		System.out.println("num="+get());
	}
}
public class class05 {

	public static void main(String[] args) {
		Cbbb bb = new Cbbb(2);
		bb.show();
	}

}

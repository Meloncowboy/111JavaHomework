package java10;

class Caaa{
	private int num;
	public Caaa(int a) {
		num = a;
	}
	public int get() {
		return num;
	}
	void display() {
		System.out.println("printed from Caaa class");
	}
}
class Cbbb extends Caaa{
	public Cbbb(int a) {
		super(a);
	}
	public void show() {
		System.out.println("num="+get());
	}
	void display() {
		System.out.println("printed from Cbbb class");
	}
}

public class class09 {

	public static void main(String[] args) {
		Cbbb bb = new Cbbb(2);
		bb.display();
		//呼叫子類別的display()
	}

}

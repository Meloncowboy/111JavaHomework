package java10;
class CTriangle{
	protected int base;
	protected int height;
	protected void show() {
		System.out.println("base="+base+", height="+height);
	}
}
class CData extends CTriangle{
	public CData(int a, int b) {
		base = a;
		height = b;
	}
	void area() {
		super.show();
		System.out.println((double)base * height / 2);
	}
}
public class class06 {

	public static void main(String[] args) {
		CData obj =  new CData(3, 8);
		obj.area();
	}

}

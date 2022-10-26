package java10;
class car{
	protected String owner;
	protected String id;
	final void show() {
		System.out.println("車主姓名:"+owner);
		System.out.println("車主號碼:"+id);
	}
	public car(String own, String s) {
		owner = own;
		id = s;
	}
}
class CColor extends car{
	String color;
	public CColor(String n, String i, String c) {
		super(n, i);
		c = color;
	}
	public void show1() {
		System.out.println("車主姓名:"+owner);
		System.out.println("車主號碼:"+id);
		System.out.println("車身顏色:"+color);
	}
}
public class class17 {

	public static void main(String[] args) {
		CColor mycar = new CColor("Rinna","a1-2345","black");
		mycar.show1();
		//overrides final method，無法複寫有final的function
		//使用別的名稱functions
	}

}

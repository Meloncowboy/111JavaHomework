package java10;

class CShape{
	static CShape a[] = new CShape[3];
	static int counter = 0;
	
	public void addtolist() {
		a[counter] = this;
		counter++;
	}
	public double area() {
		return 0.0;
	}
	
	public void viewlistarea() {
		for(int i = 0; i < counter; i++){
			System.out.println(a[i].area());
		}
	}
}

class CCircle extends CShape{
	double radius;
	double pi = 3.14;
	public CCircle(double r) {
		radius = r;
		addtolist();
	}
	public double area() {
		return pi * radius * radius;
	}
}

class CSquare extends CShape{
	double leg;
	public CSquare(double l) {
		leg = l;
		addtolist();
	}
	public double area() {
		return leg * leg;
	}
}

class CTriangle extends CShape{
	double base;
	double height;
	public CTriangle(double b, double h) {
		base = b;
		height = h;
		addtolist();
	}
	public double area() {
		return base * height / 2;
	}
}
public class class12 {

	static void largest(double a, double b, double c) {
		double max = a;
		if(b > max) {max = b;}
		if(c > max) {max = c;}
		System.out.println(max + " is largest");
	}
	
	public static void main(String[] args) {
		CCircle a = new CCircle(1);
		CSquare b = new CSquare(1);
		CTriangle c = new CTriangle(1, 1);
		largest(a.area(),b.area(),c.area());
		c.viewlistarea();
		//好處方便讀取資料及運用
	}
}

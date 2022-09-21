package abc;

public class class06 {
	static class CCircle{
		double pi = 3.14;
		double radius;
		void show_periphery() {
			System.out.println("periphery="+2*pi*radius);
		}
		void setpi(double a) {
			this.pi = a;
		}
	}
	public static void main(String[] args) {
		CCircle cir1 = new CCircle();
		cir1.radius = 3.0;
		cir1.show_periphery();
		
		System.out.println("pi="+cir1.pi);
		cir1.setpi(3.15);
		System.out.println("pi="+cir1.pi);
	}

}

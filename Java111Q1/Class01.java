class a1{
	int x;
	int y;
	int z;
	int r;
	double pi = 3.14159;
	
	public a1(int r) {
		Cal_area(r);
	}
	public a1(int x, int y, int z) {
		Cal_area(x,y,z);
	}
	
	void Cal_area(int r) {
		System.out.println("半徑=" + r);
		System.out.printf("球形體積=%.1f\n", (double)(4 / 3) * pi * r * r * r);
	}
	
	void Cal_area(int x, int y, int z) {
		int outsize = x * y * 2 + x * z * 2 + y * z *2;
		System.out.printf("長=%d ,寬=%d ,高=%d\n", x, y, z);	
		System.out.println("立方體表面積=" + outsize);	
	}
}
public class Class01 {

	public static void main(String[] args) {
		a1 a = new a1(10);
		a1 b = new a1(4, 5, 6);
	}

}

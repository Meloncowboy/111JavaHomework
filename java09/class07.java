package abc;

class a2{
	static int value = 0;
	static void power(int x,int n) {
		value = x;
		for(int i=0; i<n-1; i++) {
			value = value * x;
		}
		System.out.println(value);
		value = 0;
	}
}

public class class07 {
	public static void main(String[] args) {
		a2.power(2, 5);
		a2.power(3, 2);
	}
}

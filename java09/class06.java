package abc;
class a1{
	static int value = 0;

    public static void add2n(int n) {
		for(int i=0; i<n+1; i++) {
			value = value + i;
		}
		System.out.println(value);
		value = 0;
    }
}
public class class06 {
	public static void main(String[] args) {
		a1.add2n(5);
		a1.add2n(10);
	}
	
}

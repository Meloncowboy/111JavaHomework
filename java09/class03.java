package abc;

class Caaa{
	private int value;
	
	public Caaa() {
		value = 10;
		System.out.println("value="+value);
	}
	public Caaa(int i) {
		value = i;
		System.out.println("value="+value);
	}
}
public class class03 {

	public static void main(String[] args) {
		Caaa obj1=new Caaa();
		Caaa obj2=new Caaa(12);
		//(b):第18行呼叫第6行的建構元，第19行呼叫第10行的建構元，
		//(c):不行，會出現The public type Caaa must be defined in its own file
		//(d):無影響，除了建構元，沒有其他地方影響第4行
	}

}

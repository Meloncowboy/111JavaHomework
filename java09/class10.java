package abc;
class CRational{
	public int n;
	public int d;
	public void setN(int num) {
		n = num;
	}
	public void setD(int num) {
		d = num;
	}
	public void setND(int num,int den) {
		n = num;
		d = den;
	}

}
class toshow extends CRational{
	public void show() {
		System.out.println(n+"/"+d);
	}
}
public class class10 {

	public static void main(String[] args) {
		toshow aaa = new toshow();
		aaa.setN(2);
		aaa.setD(5);
		aaa.show();
	}

}

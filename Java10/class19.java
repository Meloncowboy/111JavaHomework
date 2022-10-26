package java10;
class CRectangle{
	protected int length;
	protected int width;
	public CRectangle(int l, int w) {
		length = l;
		width = w;
	}
	public String returnstring() {
		return "length="+length+",width="+width+",area="+length*width;
	}
}
public class class19 {

	public static void main(String[] args) {
		CRectangle rect = new CRectangle(2,6);
		System.out.println(rect.returnstring());
	}

}

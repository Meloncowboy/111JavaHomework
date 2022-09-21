package abc;
class CWin{
	int width;
	int height;
	String name;
	
	void setW(int w) {
		width = w;
	}
	void setH(int h) {
		height = h;
	}
	void setName(String s) {
		name = s;
	}
	void show() {
		System.out.println("Name="+name);
		System.out.println("W="+width+", H="+height);
	}
	void setWindows(int w, int h, String n) {
		setW(w);
		setH(h);
		setName(n);
	}
}
public class class12 {

	public static void main(String[] args) {
		CWin cw = new CWin();
		cw.setW(5);
		cw.setH(3);
		cw.show();
		System.out.println();
	}

}

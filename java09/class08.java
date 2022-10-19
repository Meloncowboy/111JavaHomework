package abc;
class CWin{
	static int ent = 0;
	String color;
	int width;
	int height;
	public CWin(String str,int w,int h) {
		color = str;
		width = w;
		height = h;
		count();
	}
	public CWin() {
		color = "Red";
		width = 2;
		height = 2;
		count();
	}
	void setZero() {
		ent = 0;
	}
	void setValue(int n) {
		ent = n;
	}
	void count() {
		ent = ent + 1;
	}
}
public class class08 {

	public static void main(String[] args) {
		//(f):必須利用類別函數，才能使用同一個
		//(g):兩者都可以，目前題目沒有差異
	}

}

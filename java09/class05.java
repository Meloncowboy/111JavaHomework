package abc;

class CCount{
	static int ent = 0;

	public CCount() {
		count();
	}
	public void count(){
		ent = ent + 1 ;
	}
	public void setZero(){
		ent = 0; ;
	}
	public void setValue(int n){
		ent = n ;
	}
	public void show(){
		System.out.println("count="+ent);
	}
}
public class class05 {

	public static void main(String[] args) {
		CCount a = new CCount();
		a.show();
		CCount b = new CCount();
		b.show();
		b.setZero();
		b.show();
		b.setValue(5);
		b.show();
		//(d):必須利用類別函數，才能使用同一個
		//(e):兩者都可以，目前題目沒有差異
	}

}

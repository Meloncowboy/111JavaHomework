package abc;

class Data{
	private String name;
	private Test score;
	
	public Data(String n, int e, int m) {
		name = n;
		this.score = new Test(e, m);
	}
	
	void show() {
		System.out.println("學生姓名:"+name);
		System.out.println("英文成績:"+score.english);
		System.out.println("數學成績:"+score.math);
		System.out.println("平均成績:"+score.avg());
	}
}
class Test{
	int english;
	int math;
	public Test(int eng, int m) {
		english = eng;
		math = m;
	}
	double avg() {
		return ((double)english + (double)math) / 2;
	}
}
public class class19 {

	public static void main(String[] args) {
		Data stu = new Data("Annie", 85, 92);
		stu.show();
	}

}

class Data{
	private String name;
	private Test score;
	
	public Data(String n, int e, int m) {
		name = n;
		score = new Test(e ,m);
	}
	void show() {
		System.out.print("name:"+name);
		System.out.print(" english"+score.english);
		System.out.print(" math:"+score.math);
		System.out.println(" avg:"+score.avg());
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
		return (double)(english + math) / 2;
	}
}
public class Class02 {
	public static void main(String[] args) {
		Data a = new Data("Annie", 85, 92);
		Data b = new Data("Brian", 77, 56);
		a.show();
		b.show();
	}
}

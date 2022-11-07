package Java11;

interface Data {
    public void best();

    public void failed();
}

interface Test extends Data {
    public void showData();

    public double average();
}

class CStuX implements Test {
    protected String name;
    protected int math;
    protected int english;
    protected String best;
    protected String fail;

    public void failed() {
        if (60 > english && 60 > math) {
            fail = "的英文和數學被當了";
        } else if (60 > english) {
            fail = "的英文被當了";
        } else if (60 > math) {
            fail = "的數學被當了";
        }
    }

    public void best() {
        if (math > english) {
            best = "的數學比英文好";
        } else {
            best = "的英文比數學好";
        }
    }

    public double average() {
        return ((double) math + (double) english) / 2;
    }

    public void showData() {
        System.out.println("姓名＝" + name);
        System.out.println("數學成績＝" + math);
        System.out.println("英文成績＝" + english);
        System.out.println("平均成績＝" + this.average());
        System.out.println(name + best);
        System.out.println(name + fail);
    }

    public CStuX(String n, int m, int e) {
        name = n;
        math = m;
        english = e;
        this.best();
        this.failed();
    }

    public void show() {
        this.showData();
    }
}

public class Class12 {
    public static void main(String[] args) {
        CStuX stu = new CStuX("Judy", 58, 91);
        stu.show();
    }
}

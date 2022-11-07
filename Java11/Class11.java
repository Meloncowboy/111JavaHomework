package Java11;

interface Data {
    public void showData();
}

interface Test {
    public void showScore();

    public double calcu();
}

class CStu {
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    public CStu(String i, String n, int m, int f, int c) {
        id = i;
        name = n;
        mid = m;
        finl = f;
        common = c;
    }

    public void showData() {
        System.out.println("學號＝" + id);
        System.out.println("姓名＝" + name);
        System.out.println("期中考成績＝" + mid);
        System.out.println("末中考成績＝" + finl);
        System.out.println("平時成績＝" + common);
        System.out.println("學期成績＝" + this.calcu());
    }

    public double calcu() {
        return mid * 3 / 10 + finl * 3 / 10 + common * 4 / 10;
    }

    public void show() {
        this.showData();
    }
}

public class Class11 {
    public static void main(String[] args) {
        CStu stu = new CStu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}

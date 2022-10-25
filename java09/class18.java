package Java9;

public class class18 {
    public static void main(String[] args) {
        (new Object() { // 匿名類別
            CCircle a = new CCircle(1);
        }).a.show();
    }
}

final class CCircle {
    public double pi = 3.14;
    public double radius;

    public CCircle(double r) {
        radius = r;
    }

    void show() {
        System.out.println(pi * radius * radius);
    }
}
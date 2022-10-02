class CCircle {
    double pi = 3.14;
    float radius = 10 * 0.5f;

    double area(double r) {
        return radius * radius * pi;
    }

    float area(float r) {
        return radius * radius * (float) pi;
    }

    double area(int r) {
        return radius * radius * pi;
    }
}

public class class13 {
    public static void main(String[] args) {
        CCircle a = new CCircle();
        System.out.println(a.area(2));
        System.out.println(a.area(2.2f));
        System.out.println(a.area(2.2));
    }
}

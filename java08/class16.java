class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;
    double pi = 3.14;

    void setLocation(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    void setRadius(int r) {
        radius = r;
    }

    double surfaceArea() {
        return 4 * pi * radius * radius;
    }

    double volume() {
        return 4 / 3 * pi * radius * radius * radius;
    }

    void showCenter() {
        System.out.printf("(%d, %d, %d)", x, y, z);
    }
}

public class class16 {
    public static void main(String[] args) {
        CSphere ball = new CSphere();
        ball.setLocation(5, 5, 5);
        ball.setRadius(5);
        System.out.println(ball.surfaceArea());
        System.out.println(ball.volume());
        ball.showCenter();
    }
}
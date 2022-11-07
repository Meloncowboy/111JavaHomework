package Java11;

interface iVolume {
    public void showData();

    public double vol();
}

abstract class CSphere implements iVolume {
    final double PI = 3.14;
    protected int x;
    protected int y;
    protected double r;

    public double vol() {
        return (double) 4 / (double) 3 * PI * (r * r * r);
    }

    public void showData() {
        System.out.printf("球心:(%d,%d)\n", x, y);
        System.out.println("半徑:" + r);
        System.out.println("球體積:" + this.vol());
        // (b):因為有implements，因此CSphere會用iVolume裡的東西，包括宣告
    }
}

class CCircleX extends CSphere {
    public CCircleX(int x1, int y1, double r1) {
        x = x1;
        y = y1;
        r = r1;
    }
}

public class Class14 {

    public static void main(String[] args) {
        CCircleX cir = new CCircleX(8, 6, 2);
        cir.showData();
    }
}

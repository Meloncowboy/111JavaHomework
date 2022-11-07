package Java11;

abstract class CShape {
    protected String color;

    public void setColor(String str) {
        color = str;
    }

    public CShape(String col) {
        this.setColor(col);
    }

    public abstract void show();
}

class CRectangle extends CShape {
    protected int width, height;

    public CRectangle(int w, int h, String col) {
        super(col);
        width = w;
        height = h;
    }

    public void show() {
        System.out.print("color=" + color + ",  ");
        System.out.println("area=" + width * height);
    }
}

class CCircle extends CShape {
    protected double radius;

    public CCircle(double r, String col) {
        super(col);
        radius = r;
    }

    public void show() {
        System.out.print("color=" + color + ",  ");
        System.out.println("area=" + 3.14 * radius * radius);
    }
}

public class Class01 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(5, 10, "Yellow");
        // rect.setColor("Yellow");
        rect.show();

        CCircle cir = new CCircle(2.0, "Green");
        // cir.setColor("Green");
        cir.show();
    }
}

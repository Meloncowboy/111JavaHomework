package java10;

class CRectangle {
    protected int length;
    protected int width;

    public CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    public String toString() {
        return "length=" + length + ",width=" + width + ",area=" + length * width;
    }

    public String toString(int a, int b) {
        if (a >= b) {
            return "length=" + length + ",width=" + width + ",area=" + length * width;
        } else {
            return "Argumant Error";
        }

    }
}

public class class20 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(2, 6);
        System.out.println(rect.toString());
        System.out.println(rect.toString(1, 2));
        System.out.println(rect.toString(2, 1));
    }
    // 多載
}

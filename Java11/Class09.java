package Java11;

interface AdvancedMathX {
    public void mod(int a, int b);

    public void fac(int a);

    public void pow(int a, int b);
}

interface MathX {
    public void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

class ComputeX implements MathX, AdvancedMathX {
    int ans;

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;
    }

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        int b = 1;
        for (int i = 0; i < a; i++) {
            b = b * (i + 1);
        }
        ans = b;
    }

    public void pow(int a, int b) {
        int c = a;
        for (int i = 0; i < b; i++) {
            a = a * c;
        }
        ans = a / b;
    }

    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class Class09 {
    public static void main(String[] args) {
        ComputeX cmp = new ComputeX();
        cmp.mul(3, 5);
        cmp.show();
        cmp.mod(14, 5);
        cmp.show();
        cmp.fac(5);
        cmp.show();
    }
}

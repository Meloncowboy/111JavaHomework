package Java9;

class Namecard {
    private String name;
    private String address;
    private phone data;

    public Namecard(String n, String a, String c, String cell) {
        name = n;
        address = a;
        data = new phone(c, cell);
    }

    void show() {
        System.out.println("好友姓名:" + name);
        System.out.println("聯絡地址:" + address);
        System.out.println("公司電話:" + data.getcompany());
        System.out.println("手機號碼:" + data.getcell());
    }
}

class phone {
    private String company;
    private String cell;

    String getcompany() {
        return company;
    }

    String getcell() {
        return cell;
    }

    public phone(String s1, String s2) {
        company = s1;
        cell = s2;
    }
}

public class class17 {
    public static void main(String[] args) {
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}

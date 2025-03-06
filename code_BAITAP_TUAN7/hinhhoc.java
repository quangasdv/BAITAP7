import java.util.Scanner;
public class hinhhoc {
    public float PI = 3.14f;
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;

    public hinhhoc (String ten, float chuvi, float dientich, float thetich) {
        this.ten = ten;
        this.chuvi = chuvi;
        this.dientich = dientich;
        this.thetich = thetich;
    }

    public void xuatTen() {
        System.out.println("\n========" + ten + "========");
    }

    public void inChuvi() {
        System.out.println("Chu vi = " + chuvi);
    }

    public void inDientich() {
        System.out.println("Dien tich = " + dientich);
    }

    public void inThetich() {
        System.out.println("The tich = " + thetich);
    }

}
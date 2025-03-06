import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float bankinh;

    public hinhtron() {
        ten = "Hinh tron";
    }

    public void nhapbankinh() {
        System.out.println("Ban kinh = ");
        Scanner nhapvao = new Scanner(System.in);
        bankinh = nhapvao.nextFloat();
    }

    public void tinhChuvi() {
        chuvi = 2 * PI * bankinh;
    }

    public void tinhDientich() {
        dientich = PI * bankinh * bankinh;
    }
    
}

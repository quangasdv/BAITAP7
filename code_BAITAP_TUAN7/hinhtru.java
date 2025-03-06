import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieucao;

    public hinhtru() {
        ten = "Hinh tru";
    }

    public void nhapchieucao() {
        System.out.println("Chieu cao = ");
        Scanner nhapvao = new Scanner (System.in);
        chieucao = nhapvao.nextFloat();
    }

    public void tinhthetich() {
        thetich = PI * chieucao * bankinh * bankinh;
    }
    
}

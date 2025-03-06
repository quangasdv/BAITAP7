import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    public float chieudai;
    public float chieurong;

    public hinhchunhat() {
        ten = "Hinh chu nhat";
    }

    public void nhapchieudai() {
        System.out.println("Chieu dai = ");
        Scanner nhapvao = new Scanner(System.in);
        chieudai = nhapvao.nextFloat();
    }

    public void nhapchieurong() {
        System.out.println("Chieu rong = ");
        Scanner nhapvao = new Scanner(System.in);
        chieurong = nhapvao.nextFloat();
    }

    public void tinhChuvi() {
        chuvi = (chieudai + chieurong) * 2;
    }
    
}

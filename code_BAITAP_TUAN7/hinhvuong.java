import java.util.Scanner;
public class hinhvuong extends hinhchunhat {
    public hinhvuong() {
        ten = "Hinh vuong";
    }

    public void nhapcanh() {
        System.out.println("Canh = ");
        Scanner nhapvao = new Scanner(System.in);
        chieudai = chieurong = nhapvao.nextFloat();
    }
    
}

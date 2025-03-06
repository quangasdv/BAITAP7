import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        hinhtron.xuatTen();
        hinhtron.nhapbankinh();
        hinhtron.tinhChuvi();
        hinhtron.tinhDientich();
        hinhtron.inChuvi();
        hinhtron.inDientich();

        hinhtru htru = new hinhtru();
        hinhtru.xuatTen();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inThetich();

        hinhchunhat hcn = new hinhchunhat();
        hinhchunhat.xuatTen();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhChuvi();
        hinhchunhat.tinhDientich();
        hinhchunhat.inChuvi();   
        hinhchunhat.inDientich();

        hinhvuong hv = new hinhvuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapcanh();
        hinhvuong.tinhChuvi();
        hinhvuong.tinhDientich();
        hinhvuong.inChuvi();
        hinhvuong.inDientich();
    }
}

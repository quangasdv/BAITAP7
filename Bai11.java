package LABTUAN1;
import java.util.Scanner;
public class Bai11 {
    public static long daoNguocSo(int so) {
        boolean laSoAm = so < 0;
        so = Math.abs(so);
        long ketQua = 0;
        while (so > 0) {
            int chuSo = so % 10;
            ketQua = ketQua * 10 + chuSo;
            so /= 10;
        }
        if (laSoAm) {
            ketQua = -ketQua;
        }
        return ketQua;
    }
    
    public static void main(String[] args) {
        int soTest = 12345;
        System.out.println("So: " + soTest);
        System.out.println("So dao nguoc: " + daoNguocSo(soTest));
        
        int soAm = -987;
        System.out.println("\nSo: " + soAm);
        System.out.println("So dao nguoc: " + daoNguocSo(soAm));
        
        int soKhong = 0;
        System.out.println("\nSo: " + soKhong);
        System.out.println("So dao nguoc: " + daoNguocSo(soKhong));
    }
}
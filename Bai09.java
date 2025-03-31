package LABTUAN1;
import java.util.Scanner;
public class Bai09 {
    public static int tinhTongChuSo(int so) {
        so = Math.abs(so);
        int tong = 0;
        while (so > 0) {
            tong += so % 10;
            so /= 10;
        }
        return tong;
    }
    
    public static long tinhTichChuSo(int so) {
        so = Math.abs(so);
        long tich = 1;
        while (so > 0) {
            tich *= so % 10;
            so /= 10;
        }
        return tich;
    }
    
    public static void main(String[] args) {
        int soTest = 12345;
        System.out.println("So: " + soTest);
        System.out.println("Tong cac chu so: " + tinhTongChuSo(soTest));
        System.out.println("Tich cac chu so: " + tinhTichChuSo(soTest));
        
        int soAm = -987;
        System.out.println("\nSo: " + soAm);
        System.out.println("Tong cac chu so: " + tinhTongChuSo(soAm));
        System.out.println("Tich cac chu so: " + tinhTichChuSo(soAm));
    }
}
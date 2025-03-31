package LABTUAN1;
import java.util.Scanner;
public class Bai08 {
    public static int timChuSoDauTien(int so) {
        so = Math.abs(so);
        while (so >= 10) {
            so = so / 10;
        }
        return so;
    }
    
    public static int timChuSoTanCung(int so) {
        return Math.abs(so % 10);
    }
    
    public static void main(String[] args) {
        int soTest = 12345;
        System.out.println("So: " + soTest);
        System.out.println("Chu so dau tien: " + timChuSoDauTien(soTest));
        System.out.println("Chu so tan cung: " + timChuSoTanCung(soTest));
        
        int soAm = -9876;
        System.out.println("\nSo: " + soAm);
        System.out.println("Chu so dau tien: " + timChuSoDauTien(soAm));
        System.out.println("Chu so tan cung: " + timChuSoTanCung(soAm));
    }
}
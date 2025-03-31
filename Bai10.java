package LABTUAN1;
import java.util.Scanner;
public class Bai10 {
    public static int demSoChuSo(int so) {
        so = Math.abs(so);
        if (so == 0) {
            return 1;
        }
        int dem = 0;
        while (so > 0) {
            dem++;
            so /= 10;
        }
        return dem;
    }
    
    public static void main(String[] args) {
        int soTest = 12345;
        System.out.println("So: " + soTest);
        System.out.println("So chu so: " + demSoChuSo(soTest));
        
        int soAm = -987;
        System.out.println("\nSo: " + soAm);
        System.out.println("So chu so: " + demSoChuSo(soAm));
        
        int soKhong = 0;
        System.out.println("\nSo: " + soKhong);
        System.out.println("So chu so: " + demSoChuSo(soKhong));
    }
}
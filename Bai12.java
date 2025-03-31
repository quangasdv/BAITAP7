package LABTUAN1;
import java.util.Scanner;
public class Bai12 {
    public static boolean laSoDoiXung(int so) {
        if (so < 0) {
            return false;
        }
        return so == daoNguocSo(so);
    }
    
    public static long daoNguocSo(int so) {
        long ketQua = 0;
        so = Math.abs(so);
        while (so > 0) {
            int chuSo = so % 10;
            ketQua = ketQua * 10 + chuSo;
            so /= 10;
        }
        return ketQua;
    }
    
    public static void main(String[] args) {
        int so1 = 12321;
        System.out.println("So: " + so1);
        System.out.println("La so doi xung: " + laSoDoiXung(so1));
        
        int so2 = 12345;
        System.out.println("\nSo: " + so2);
        System.out.println("La so doi xung: " + laSoDoiXung(so2));
        
        int so3 = -121;
        System.out.println("\nSo: " + so3);
        System.out.println("La so doi xung: " + laSoDoiXung(so3));
        
        int so4 = 0;
        System.out.println("\nSo: " + so4);
        System.out.println("La so doi xung: " + laSoDoiXung(so4));
    }
}
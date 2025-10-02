package jobsheet5;
import java.util.Scanner;

public class SistemKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Perpustakaan & Akses WIFI Kampus ---");
        
        // Input keanggotaan perpustakaan
        System.out.print("Apakah Anda sudah menjadi anggota perpustakaan? (true/false): ");
        boolean anggotaPerpus = sc.nextBoolean();

        // Input status UKT
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Logika untuk perpustakaan
        if (anggotaPerpus) {
            System.out.println("Anda dapat meminjam buku di perpustakaan.");
        } else {
            System.out.println("Anda belum terdaftar, silakan daftar anggota perpustakaan terlebih dahulu.");
        }

        // Logika untuk WiFi kampus
        if (uktLunas) {
            System.out.println("Akses WIFI kampus diberikan.");
        } else {
            System.out.println("Akses WIFI ditolak. Silakan lunasi UKT terlebih dahulu.");
        }
    }
}

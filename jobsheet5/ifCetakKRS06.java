package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Aapakah UKT sudah lunas? (true/false): ");
        String uktLunas = sc.nextLine().trim();

        if (uktLunas.equalsIgnoreCase("true")) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.");
        }
    }
}
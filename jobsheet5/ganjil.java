package jobsheet5;
import java.util.Scanner;
public class ganjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println("bilangan itu genap");
        } else {
            System.out.println("bilangan itu ganjil");
        }
    }
}

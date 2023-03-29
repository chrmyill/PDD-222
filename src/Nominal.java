import java.util.Scanner;

public class Nominal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nominal = ");
        int uang = input.nextInt();

        int duapuluhribu = uang / 20000;
        uang = uang % 20000;

        int sepuluhribu = uang / 10000;
        uang = uang % 10000;

        int seribu = uang / 1000;
        uang = uang % 1000;

        int limaratus = uang / 500;
        uang = uang % 500;

        int duaRatus = uang / 200;
        uang = uang % 200;

        int seratus = uang / 100;
        uang = uang % 100;

        System.out.println("Jumlah pecahan uang =");
        System.out.println("Dua puluh ribuan \t= " + duapuluhribu);
        System.out.println("Sepuluh ribuan \t\t= " + sepuluhribu);
        System.out.println("Seribuan \t\t\t= " + seribu);
        System.out.println("Lima ratusan \t\t= " + limaratus);
        System.out.println("Dua ratusan \t\t= " + duaRatus);
        System.out.println("Seratusan \t\t\t= " + seratus);
    }
}
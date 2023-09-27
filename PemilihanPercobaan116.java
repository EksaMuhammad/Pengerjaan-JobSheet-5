import java.util.Scanner;
public class PemilihanPercobaan116 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        String hasil;

        System.out.println("Masukkan angka: ");
        int angka = input16.nextInt();

        if (angka % 2 == 0) {
             hasil="bilangan genap";
        }
        else {
            hasil="bilangan ganjil";
        }

        System.out.println(angka+ " adalah " +hasil);
    }
}

import java.util.Scanner;
public class PemilihanPercobaan316 {
    public static void main(String[] args) {
        

        double angka1, angka2, hasil;
        char operator;
        
        Scanner input16 = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        angka1 = input16.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input16.nextDouble();
        System.out.println("Masukkan operator (+ - * /): ");
        operator = input16.next().charAt(0);

        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1+ "+" +angka2+ "=" +hasil);
            

            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1+ "-" +angka2+ "=" +hasil);
            break;

            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1+ "*" +angka2+ "=" +hasil);
            break;

            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1+ "/" +angka2+ "=" +hasil);
            break;
            
        }
    }
}

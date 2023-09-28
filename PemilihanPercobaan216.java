import java.util.Scanner;
public class PemilihanPercobaan216 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);


        System.out.println("Nilai uas: ");
        float uas = input16.nextFloat();
        System.out.println("Nilai uts: ");
        float uts = input16.nextFloat();
        System.out.println("Nilai kuis: ");
        float kuis = input16.nextFloat();
        System.out.println("Nilai tugas: ");
        float tugas = input16.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir anda " +total+ " Maka " +message);
        
        if (80 < total && total <= 100 )  {
        System.out.println("Nilai Huruf Anda = A \nNilai Setara Anda = 4 \nKualifikasi Anda Sangat Baik");    
        }else if (73 < total && total <=80) {
             System.out.println("Nilai Huruf Anda = B+ \nNilai Setara Anda = 3.5 \n lebih dari Baik");   
        }else if (65 < total && total <=73) {
            System.out.println("Nilai Huruf Anda = B \nNilai Setara Anda = 3 \n Baik");   
        }else if (60 < total && total <=65) {
            System.out.println("Nilai Huruf Anda = C+ \nNilai Setara Anda = 2.5 \n lebih dari cukup"); 
        }else if (50 < total && total <=60) {
             System.out.println("Nilai Huruf Anda = C \nNilai Setara Anda = 2 \n cukup"); 
        }else if (39 < total && total <=50) {
            System.out.println("Nilai Huruf Anda =  D \nNilai Setara Anda = 1 \n kurang"); 
        }else  if (total <= 39 && total > 0 ) {
            System.out.println("Nilai Huruf Anda =  E \nNilai Setara Anda = 0 \n belajar lagi dek"); 
        }
        

        

        System.out.println("Nilai akhir " +total );
    }
}

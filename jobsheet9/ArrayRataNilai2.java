import java.util.Scanner;
public class ArrayRataNilai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah Mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < jmlMhs; i++){
            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        if (jmlLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + (totalLulus / jmlLulus));
        } else {
            System.out.println("Rata-rata nilai lulus = 0");
        }

        if (jmlTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / jmlTidakLulus));
        } else {
            System.out.println("Rata-rata nilai tidak lulus = 0");
        }
    }
}

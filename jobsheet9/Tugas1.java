import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah Mahasiswa yang akan diinput: ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++){
            System.out.println("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        double total = 0;
        for (int i = 0; i < jmlMhs; i++){
            total += nilaiMhs[i];
        }
        double rata2 = total / jmlMhs;

        int maksimal = nilaiMhs[0];
        int minimal = nilaiMhs[0];
        for (int i = 1; i < jmlMhs; i++){
            if (nilaiMhs[i] > maksimal){
                maksimal = nilaiMhs[i];
            }
            if (nilaiMhs[i] < minimal){
                minimal = nilaiMhs[i];
            }
        }

        System.out.println();
        System.out.println("---Daftar Nilai Mahasiswa---");
        for (int i = 0; i < jmlMhs; i++){
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" : "+nilaiMhs[i]);
        }
        System.out.println("Rata-rata Nilai: "+rata2);
        System.out.println("Nilai Tertinggi: "+maksimal);
        System.out.println("Nilai Terendah: "+minimal);
    }
}
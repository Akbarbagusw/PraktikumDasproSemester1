import java.util.Scanner;
public class CM1_AkbarBagusWicaksana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nilaiHuruf1 = "";
        String status1 = "";
        String nilaiHuruf2 = "";
        String status2 = "";

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.println("Nama        : ");
        String nama = sc.nextLine();
        System.out.println("NIM         : ");
        Long nim = sc.nextLong();
        sc.nextLine();
        System.out.println("Jalur Masuk : (SNBP/SNBT/MANDIRI)");
        String jalurMasuk = sc.nextLine();
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.println("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.println("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.println("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.println("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.println("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.println("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        double n1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        if (n1> 80 && n1 <= 100) {
            nilaiHuruf1 = "A";
            status1 = "LULUS";
        } else if (n1> 73 && n1 <= 80) {
            nilaiHuruf1 = "B+";
            status1 = "LULUS";
        } else if (n1> 65 && n1 <= 73) {
            nilaiHuruf1 = "B";
            status1 = "LULUS";
        } else if (n1> 60 && n1 <=65) {
            nilaiHuruf1 = "C+";
            status1 = "LULUS";
        } else if (n1> 50 && n1 <=60) {
            nilaiHuruf1 = "C";
            status1 = "TIDAK LULUS";
        } else if (n1> 39 && n1 <=50) {
            nilaiHuruf1 = "D";
            status1 = "TIDAK LULUS";
        } else if (n1 <=39) {
            nilaiHuruf1 = "E";
            status1 = "TIDAK LULUS";
        } else{
            status1 = "Nilai tidak sesuai";
        }

        double n2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);
        if (n2> 80 && n2 <= 100) {
            nilaiHuruf2 = "A";
            status2 = "LULUS";
        } else if (n2> 73 && n2 <= 80) {
            nilaiHuruf2 = "B+";
            status2 = "LULUS";
        } else if (n2> 65 && n2 <= 73) {
            nilaiHuruf2 = "B";
            status2 = "LULUS";
        } else if (n2> 60 && n2 <=65) {
            nilaiHuruf2 = "C+";
            status2 = "LULUS";
        } else if (n2> 50 && n2 <=60) {
            nilaiHuruf2 = "C";
            status2 = "TIDAK LULUS";
        } else if (n2> 39 && n2 <=50) {
            nilaiHuruf2 = "D";
            status2 = "TIDAK LULUS";
        } else if (n2 <=39) {
            nilaiHuruf2 = "E";
            status2 = "TIDAK LULUS";
        }
        
        status1 = (n1 >= 60 && n1<=100) ?"LULUS" :"TIDAK LULUS";
        status2 = (n2 >= 60 && n1<=100) ?"LULUS" :"TIDAK LULUS";
        double rataRata = (n1 + n2) / 2;

        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+nim);
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Dan Pemrograman\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", (int)uts1, (int)uas1, (int)tugas1, n1, nilaiHuruf1, status1);
        System.out.printf("Struktur Data\t\t\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", (int)uts2, (int)uas2, (int)tugas2, n2, nilaiHuruf2, status2);
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);

        if (status1.equals("LULUS") && status2.equals("LULUS")){
            if (rataRata >= 70) {
                System.out.println("Status Semester: LULUS");
            } else {
            System.out.println("Status Semester: TIDAK LULUS (Rata rata < 70)");
            }
        } else{
            System.out.println("Status Semester: TIDAK LULUS (Salah satu mata pelajaran TIDAK LULUS)");
        }

        if(jalurMasuk.equalsIgnoreCase("SNBP")){
            System.out.println("Minimal nilai akhir Lulus = 65");
        } else if (jalurMasuk.equalsIgnoreCase("SNBT")) {
            System.out.println("Minimal nilai akhir Lulus = 60");
        } else if (jalurMasuk.equalsIgnoreCase("MANDIRI")) {
            System.out.println("Minimal nilai akhir Lulus = 50");
        }
    }
}

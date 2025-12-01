import java.util.Scanner;
public class NilaiMahasiswa2 {
    static void isianArray(int[] nilai){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] nilai){
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int n : nilai){
            System.out.println("- " + n);
        }
    }

    static int hitTot(int[] nilai){
        int total = 0;
        for (int n : nilai){
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal Nilai seluruh Mahasiswa: " + totalNilai);
    }
}

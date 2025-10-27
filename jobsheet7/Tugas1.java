import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        String lanjut = " ";

        System.out.println("=== Program Penjualan Tiket Bioskop ===");

         while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();
            sc.nextLine();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.\n");
                continue;
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = totalHarga - (totalHarga * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + totalBayar);
            System.out.println("----------------------------------");

            System.out.print("Apakah ada pelanggan lain? (y/n): ");
            lanjut = sc.nextLine();

            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("=== Rekapitulasi Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        System.out.println("=======================================");
    }
}

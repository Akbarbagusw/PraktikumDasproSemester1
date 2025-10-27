import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do{
            System.out.println("Masukkan jenis Kendaraan anda: \n1. Mobil \n2. Motor \n0. keluar");
            if (sc.hasNextInt()) {
                jenis = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                sc.nextLine();
                jenis = -1;
                continue;
            }
            if (jenis == 0) {
                break; 
            }
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi parkir (jam): ");
                if (sc.hasNextInt()) {
                    durasi = sc.nextInt();
                    sc.nextLine(); 
                } else {
                    System.out.println("Durasi tidak valid. Silakan masukkan ulang transaksi.");
                    sc.nextLine();
                    continue;
                }

            if (durasi > 5) {
                    total += 12500;
                    System.out.println("Biaya: Rp 12.500 (Tarif tetap > 5 jam)");
            } else {
                if (jenis == 1) {
                    total += durasi * 3000;
                    System.out.println("Biaya: Rp " + (durasi * 3000) + " (Mobil, " + durasi + " jam Rp 3.000)");
                } else if (jenis == 2) { 
                    total += durasi * 2000;
                    System.out.println("Biaya: Rp " + (durasi * 2000) + " (Motor, " + durasi + " jam Rp 2.000)");
                    }
                }
            } else {
                System.out.println("Jenis kendaraan tidak dikenali. Harap masukkan 1, 2, atau 0.");
            }
            
            System.out.println("Total sementara: Rp " + total);
            
        } while (true);

        System.out.println("Semua transaksi selesai.");
        System.out.println("TOTAL PEMBAYARAN PARKIR HARI INI: Rp " + total);
    }
}

import java.util.Scanner;
public class Kafe2 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        if (kodePromo.equals("DISKON50")){
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
        }

    public static int hitungTotalHarga2(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
            System.out.println("Kode promo valid! Diskon 50%: Rp" + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Kode promo valid! Diskon 30%: Rp" + diskon);
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return hargaTotal - diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Budi", true, "DISKON50");

        int totalKeseleruhan = 0;
        int pilihanMenu;

        while (true) {
            System.out.println("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk keluar): ");
            pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) break;

            System.out.println("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalPerMenu = hitungTotalHarga2(pilihanMenu, banyakItem, "DISKON50");
            totalKeseleruhan += totalPerMenu;
            System.out.println("Total harga untuk menu ini: Rp" + totalPerMenu);
        }
        System.out.println("Total harga untuk pesanan Anda: Rp"+totalKeseleruhan);
    }
}
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah pesanan: ");
        int jmlPsn = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jmlPsn];
        int[] hargaPesanan = new int[jmlPsn];

        for (int i = 0; i < jmlPsn; i++){
            System.out.println("Masukkan nama makanan / minuman ke-"+(i+1)+ ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.println("Masukkan harga "+namaPesanan[i]+": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
        }

        int totalBiaya = 0;
        for ( int i = 0; i < jmlPsn; i++){
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("---Daftar Pesanan---");
        for (int i = 0; i < jmlPsn; i++){
            System.out.println((i+1)+". "+namaPesanan[i]+" - Rp "+hargaPesanan[i]);   
        }
        System.out.println("Total Biaya: Rp "+totalBiaya);
    }
}
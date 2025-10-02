import java.util.Scanner;
public class ifCetakKRS2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // }

        String pesan = uktLunas
            ?"Pembayaran UKT terverifikasi.\nSilahkan cetak KRS dan minta tanda tangan DPA"
            :"Pembayaran UKT belum terverifikasi.\nAnda tidak dapat mencetak KRS";

        System.out.println(pesan);
    }
}
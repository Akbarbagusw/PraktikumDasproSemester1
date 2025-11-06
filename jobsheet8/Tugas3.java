import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allPlggn = 0;
        int allItem = 0;

        System.out.println("Jumlah cabang kafe: ");
        int jmlCabang = sc.nextInt();
        System.out.println("=== Input Penjualan Per Caban ===");

        for (int i = 1; i <= jmlCabang; i++){
            System.out.println();
            System.out.println("--- Cabang "+i+" ---");

            System.out.println("Jumlah pelanggan: ");
            int jmlPlggnCbg = sc.nextInt();

            int allItemCbg = 0;

            for (int j = 1; j <= jmlPlggnCbg; j++){
                System.out.println("- Pelanggan "+j+" memesan berapa item?");
                int itemPerPlggn = sc.nextInt();

                allItemCbg += itemPerPlggn;
            }
            System.out.println("Cabang "+i+":");
            System.out.println("- Pelanggan: "+jmlPlggnCbg+" orang");
            System.out.println("- Item terjual: "+allItemCbg);

            allPlggn += jmlPlggnCbg;
            allItem += allItemCbg;
        }
        System.out.println();
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: "+allPlggn+" orang");
        System.out.println("Item terjual: "+allItem+" item");
    }
}

import java.util.Scanner;
public class RekapPenjualanCafe2 {
    static String[] menuCafe = {
        "Kopi", 
        "Teh", 
        "Es Kelapa Muda", 
        "Roti Bakar", 
        "Gorengan"
    };

    static void inputPenjualan(int[][] data){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++){
            System.out.println("Masukkan penjualan untuk menu: " + menuCafe[i]);
            for (int j = 0; j < data[i].length; j++){
                System.out.print("pada hari ke-" + (j+1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanDataPenjualan(int[][] data){
        System.out.println("\nData Penjualan Cafe:");
        System.out.print("Menu\t\t");
        for (int j = 0; j < data[0].length; j++){
            System.out.print("Hari"+(j+1)+"\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++){
            System.out.printf("%-15s", menuCafe[i]);
            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void menuTerlaris(int[][] data){
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < data.length; i++){
            int totalPenjualanMenu = 0;
            for (int j = 0; j < data[i].length; j++){
                totalPenjualanMenu += data[i][j];
            }
            if (totalPenjualanMenu > maxPenjualan){
                maxPenjualan = totalPenjualanMenu;
                menuTerlaris = menuCafe[i];
            }
        }
        System.out.println("\nMenu Terlaris: " + menuTerlaris + " dengan total penjualan: " + maxPenjualan);
    }

    static void rataRataPenjualan(int[][] data){
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < data.length; i++){
            int totalPenjualanMenu = 0;
            for (int j = 0; j < data[i].length; j++){
                totalPenjualanMenu += data[i][j];
            }
            double rataRata = (double) totalPenjualanMenu / data[i].length;
            System.out.println(menuCafe[i]+" Rata-rata: "+ rataRata);
        }
    }

    public static void main(String[] args) {
        int[][] dataPenjualan = new int[menuCafe.length][7];
        inputPenjualan(dataPenjualan);
        tampilkanDataPenjualan(dataPenjualan);
        menuTerlaris(dataPenjualan);
        rataRataPenjualan(dataPenjualan);
    }
}

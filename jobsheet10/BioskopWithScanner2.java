import java.util.Scanner;
public class BioskopWithScanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        while (true){
            System.out.println("\n===MENU BIOSKOP===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
        
            switch (menu) {
                case 1:
                    String nama;
                    int baris, kolom;

                    System.out.println("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.println("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.println("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1|| kolom > 2){
                            System.out.println("Kursi tidak tersedia! Silahkan masukkan ulang");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null){
                            System.out.println("Kursi tersebut sudah terisi!");
                            System.out.println("Silahkan pilih kursi lain\n");
                            continue;
                        }

                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                        break;
                    }
                break;

                case 2:
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++){
                        System.out.println("Baris "+(i+1)+": ");
                        for (int j = 0; j < penonton[i].length; j++){
                            if (penonton[i][j] == null){
                                System.out.println("***");
                            } else{
                                System.out.println(penonton[i][j]);
                            }
                        }
                        System.out.println();
                    }
                break;
            
                case 3:
                    System.out.println("Program selesai");
                    return;
            
                default:
                    System.out.println("Menu tidak tersedia");
            }  
        }
    }
}

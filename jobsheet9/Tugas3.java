import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
        "Teh Tarik", "Cappucion", "Chocolate Ice"};

        System.out.println("Masukkan nama makanan yang ingin dicari: ");
        String key = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(key)){
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan){
            System.out.println(key+" tersedia di menu");
        } else{
            System.out.println(key+" tidak tersedia di menu");
        }
    }
}

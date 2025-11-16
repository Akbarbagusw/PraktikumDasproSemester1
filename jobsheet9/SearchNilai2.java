import java.util.Scanner;
public class SearchNilai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlNilai = sc.nextInt();
        int[] arrNilai = new int[jmlNilai];

        for (int i = 0; i < jmlNilai; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.println("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++){
            if (arrNilai[i] == key){
                hasil = i;
                break;
            }
        }
        System.out.println();
        
        if (hasil != -1){
            System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
        } else{
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}

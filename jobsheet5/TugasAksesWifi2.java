import java.util.Scanner;
public class TugasAksesWifi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisPengguna;
        int jumlahSKS;

        System.out.println("Role anda (dosen/mahasiswa)");
        jenisPengguna = sc.nextLine().trim();

        if(jenisPengguna.equalsIgnoreCase("dosen")){
            System.out.println("Akses Wifi diberikan (Dosen)");
        } else if(jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS anda:");
            jumlahSKS = sc.nextInt();
        
        if (jumlahSKS >= 12) {
            System.out.println("Akses Wifi diberikan (Mahasiswa Aktif)");
        } else{
            System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else{
            System.out.println("Akses ditolak. Role tidak dikenali");
        }
    }
}

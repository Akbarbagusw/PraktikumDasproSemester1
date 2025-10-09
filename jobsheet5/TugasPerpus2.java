import java.util.Scanner;
public class TugasPerpus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apa membawa Kartu Mahasiswa? (true/false)");
        boolean kartuMahasiswa = sc.nextBoolean();

        if (kartuMahasiswa) {
            System.out.println("Boleh Masuk");
        } else {
            System.out.println("Apakah anda sudah registrasi online? (true/false)");
            boolean registrasiOnline = sc.nextBoolean();
        if (registrasiOnline) {
            System.out.println("Boleh Masuk");
        } else {
            System.out.println("Tidak boleh masuk. Silahkan melakukan registrasi online dahulu");
        }}
    }
}

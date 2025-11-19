import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlResponden = 10;
        int jmlPertanyaan = 6;
        int [][] nilai = new int[jmlResponden][jmlPertanyaan];

        System.out.println("INPUT HASIL SURVEI");

        for (int i = 0; i < jmlResponden; i++){
            System.out.println("\nInput nilai responden ke-"+(i+1));
            for (int j = 0; j < jmlPertanyaan; j++){
                System.out.println("Nilai pertanyaan "+(j+1)+" (1-5): ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("RATA-RATA PER RESPONDEN");
        for (int i = 0; i < jmlResponden; i++){
            double totalPerResponden = 0;
            for (int j = 0; j < jmlPertanyaan; j++){
                totalPerResponden += nilai[i][j];
            }
            System.out.println("Responden "+(i+1)+": "+totalPerResponden / jmlPertanyaan);
        }

        System.out.println("\nRATA-RATA PER PERTANYAAN");
        for (int j = 0; j < jmlPertanyaan; j++){
            double totalPerPertanyaan = 0;
            for (int i = 0; i < jmlResponden; i++){
                totalPerPertanyaan += nilai[i][j];
            }
            System.out.println("Pertanyaan "+(j+1)+": "+totalPerPertanyaan / jmlResponden);
        }

        System.out.println("\nRATA-RATA KESELURUHAN");
        double totalSemua = 0;
        int jmlData = jmlResponden * jmlPertanyaan;

        for (int i = 0; i < jmlResponden; i++){
            for (int j = 0; j < jmlPertanyaan; j++){
                totalSemua +=  nilai[i][j];
            }
        }

        double rataKeseluruhan = totalSemua / jmlData;
        System.out.println("Rata-rata keseluruhan survei: "+rataKeseluruhan);
    }
}

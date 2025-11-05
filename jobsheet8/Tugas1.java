public class Tugas1 {
    public static void main(String[] args) {
        int batas = 5;

        for (int n = 1; n <= batas; n++) {
            int jumlahKuadrat = 0;
            String deretKuadrat = "";
            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlahKuadrat += kuadrat;
                if (i == 1){
                    deretKuadrat = String.valueOf(kuadrat);
                } else{
                    deretKuadrat += " + " +kuadrat;
                }
            }
            if (n == 1){
                    System.out.printf("n = %d -> jumlah kuadrat = %s%n", n, deretKuadrat);
                } else{
                    System.out.printf("n = %d -> jumlah kuadrat = %s = %d%n", n, deretKuadrat, jumlahKuadrat);
                }
        }
    }
}

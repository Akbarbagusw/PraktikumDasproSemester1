public class Kubus2 {
    static void volumeKubus(int... sisi){
        for (int s : sisi){
            int volume = s * s * s;
            System.out.println("Volume kubus dengan sisi " + s + " adalah: " + volume);
        }
    }

    static void luarPermukaanKubus(int... sisi){
        for (int s : sisi){
            int luas = 6 * s * s;
            System.out.println("Luas permukaan kubus dengan sisi " + s + " adalah: " + luas);
        }
    }

    public static void main(String[] args) {
        volumeKubus(3, 4, 5);
        luarPermukaanKubus(3, 4, 5);
    }
}
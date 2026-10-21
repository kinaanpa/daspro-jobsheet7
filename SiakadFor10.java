import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int i;

        for (i= 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.print("\nNilai tertinggi: "+tertinggi);
        System.out.print("\nNilai terendah: "+terendah);
    }
}
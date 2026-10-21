import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int i, lulus = 0, tidakLulus = 0;

        for (i= 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {

                tidakLulus++;
            }
        }
        System.out.print("\nNilai tertinggi: "+tertinggi);
        System.out.print("\nNilai terendah: "+terendah);
        System.out.print("\nJumlah mahasiswa lulus: "+lulus);
        System.out.print("\nJumlah mahasiswa tidak lulus: "+tidakLulus);
    }
}
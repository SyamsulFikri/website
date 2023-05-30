import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();

        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = input.nextDouble();

        double gajiKaryawan = jamKerja * tarifPerJam;

        System.out.println("Gaji karyawan " + nama + " adalah: Rp " + gajiKaryawan);
    }
}
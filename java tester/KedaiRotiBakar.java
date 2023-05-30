import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class KedaiRotiBakar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Login
        System.out.print("Masukan username: ");
        String username = input.nextLine();

        System.out.print("Masukan password :");
        String password = input.nextLine();

        if (username.equals("Admin") && password.equals("12345")) {

            System.out.println("Login berhasil");
            System.out.println();

            // Menu Roti Bakar
            System.out.println("Silahkan Pilih Menu Roti Bakar :");
            System.out.println("1. Roti Bakar Coklat Susu (Rp 10.000)");
            System.out.println("2. Roti Bakar Keju Susu (Rp 12.000)");
            System.out.println("3. Roti Bakar Durian (Rp 15.000)");
            System.out.println("4. Roti Bakar Greentea (Rp 17.000)");
            System.out.println("5. Roti Bakar Mozarella (Rp 20.000)");
            System.out.println("6. Roti Bakar Beef Keju (Rp 25,000)");

            System.out.print("Masukan nomor menu pilihan :");
            int nomorMenuMakanan = input.nextInt();

            double hargaMakanan = 0;
            String namaMakanan = "";

            switch (nomorMenuMakanan) {
                case 1:
                    hargaMakanan = 10000;
                    namaMakanan = "Roti Bakar Coklat Susu";
                    break;
                case 2:
                    hargaMakanan = 12000;
                    namaMakanan = "Roti Bakar Keju Susu";
                    break;
                case 3:
                    hargaMakanan = 15000;
                    namaMakanan = "Roti Bakar Durian";
                    break;
                case 4:
                    hargaMakanan = 17000;
                    namaMakanan = "Roti Bakar Greentea";
                    break;
                case 5:
                    hargaMakanan = 20000;
                    namaMakanan = "Roti Bakar Mozarella";
                    break;
                case 6:
                    hargaMakanan = 25000;
                    namaMakanan = "Roti Bakar Beef keju";
                    break;
                default:
                    System.out.println("Nomor yang anda masukan salah!");
                    System.exit(0);
            }

            // Menu pilihan minuman
            System.out.println("Silahkan pilih nomor menu pilihan Anda :");
            System.out.println("1. Jus Jeruk (Rp 7.000)");
            System.out.println("2. Jus Jambu (Rp 7.000)");
            System.out.println("3. Jus Alpukat (Rp 10.000)");
            System.out.println("4. Teh Manis (Rp 5.000)");
            System.out.println("5. Lemontea (Rp 6.000)");
            System.out.println("6. Greentea (Rp 6.000)");

            System.out.print("Masukan Nomor Menu pilihan Anda :");
            int nomorMenuMinuman = input.nextInt();

            double hargaMinuman = 0;
            String namaMinuman = "";

            switch (nomorMenuMinuman) {
                case 1:
                    hargaMinuman = 7000;
                    namaMinuman = "Jus Jeruk";
                    break;
                case 2:
                    hargaMinuman = 7000;
                    namaMinuman = "Jus jambu";
                    break;
                case 3:
                    hargaMinuman = 10000;
                    namaMinuman = "Jus Alpukat";
                    break;
                case 4:
                    hargaMinuman = 5000;
                    namaMinuman = "Teh Manis";
                    break;
                case 5:
                    hargaMinuman = 6000;
                    namaMinuman = "Lemontea";
                    break;
                case 6:
                    hargaMinuman = 6000;
                    namaMinuman = "Greentea";
                    break;
                default:
                    System.out.println("Nomor yang anda masukan salah!");
                    System.exit(0);
            }

            double totalHarga = hargaMakanan + hargaMinuman;

            // Struk pembayaran
            System.out.println("=============== Struk Pembayaran ===============");
            System.out.println("Menu Makanan :" + namaMakanan + " =Rp : " + hargaMakanan);
            System.out.println("Menu Minuman :" + namaMinuman + " =Rp : " + hargaMinuman);
            System.out.println("Total yang harus dibayar :" + totalHarga);
            System.out.println("=============== Terimakasih ===============");
        }

    }
}

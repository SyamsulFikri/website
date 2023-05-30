import java.util.Scanner;

public class MenuMakanan {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Login
      System.out.print("Masukkan username: ");
      String username = input.nextLine();

      System.out.print("Masukkan password: ");
      String password = input.nextLine();

      if (username.equals("user") && password.equals("1234")) {
         System.out.println("Login berhasil!");
         System.out.println();

         // Menu Makanan
         System.out.println("Silakan pilih menu makanan:");
         System.out.println("1. Nasi Goreng (Rp 15.000)");
         System.out.println("2. Mie Goreng (Rp 12.000)");
         System.out.println("3. Ayam Goreng (Rp 20.000)");
         System.out.println("4. Sate Ayam (Rp 25.000)");

         System.out.print("Masukkan nomor menu makanan: ");
         int nomorMakanan = input.nextInt();

         double hargaMakanan = 0;
         String namaMakanan = "";

         switch (nomorMakanan) {
            case 1:
               hargaMakanan = 15000;
               namaMakanan = "Nasi Goreng";
               break;
            case 2:
               hargaMakanan = 12000;
               namaMakanan = "Mie Goreng";
               break;
            case 3:
               hargaMakanan = 20000;
               namaMakanan = "Ayam Goreng";
               break;
            case 4:
               hargaMakanan = 25000;
               namaMakanan = "Sate Ayam";
               break;
            default:
               System.out.println("Nomor menu makanan yang dimasukkan salah.");
               System.exit(0);
         }

         // Menu Minuman
         System.out.println("Silakan pilih menu minuman:");
         System.out.println("1. Teh Manis (Rp 3.000)");
         System.out.println("2. Es Jeruk (Rp 5.000)");
         System.out.println("3. Es Teh (Rp 4.000)");
         System.out.println("4. Jus Alpukat (Rp 8.000)");

         System.out.print("Masukkan nomor menu minuman: ");
         int nomorMinuman = input.nextInt();

         double hargaMinuman = 0;
         String namaMinuman = "";

         switch (nomorMinuman) {
            case 1:
               hargaMinuman = 3000;
               namaMinuman = "Teh Manis";
               break;
            case 2:
               hargaMinuman = 5000;
               namaMinuman = "Es Jeruk";
               break;
            case 3:
               hargaMinuman = 4000;
               namaMinuman = "Es Teh";
               break;
            case 4:
               hargaMinuman = 8000;
               namaMinuman = "Jus Alpukat";
               break;
            default:
               System.out.println("Nomor menu minuman yang dimasukkan salah.");
               System.exit(0);
         }

         double totalHarga = hargaMakanan + hargaMinuman;

         // Cetak Struk Pembayaran
         System.out.println();
         System.out.println("========== Struk Pembayaran ==========");
         System.out.println("Menu Makanan: " + namaMakanan + " (Rp :" + hargaMakanan);
         System.out.println("Menu Minuman: " + namaMinuman + " (Rp :" + hargaMinuman);
         System.out.println("Total Harga :" + totalHarga);
         System.out.println("       Terima kasih telah berkunjung       ");
      }
   }
}

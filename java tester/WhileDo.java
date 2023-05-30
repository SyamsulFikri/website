import java.util.Scanner;

public class WhileDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan: ");
        int angka = input.nextInt();

        int i = 0;
        int j = 0;

        System.out.println("10 bilangan utama kelipatan " + angka + " adalah: ");

        while (j < 10) {
            i += angka;
            System.out.print(i + " ");
            j++;
        }

    }
}
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        int i = 0;
        int j = angka;

        System.out.println("10 deret bilangan pertama yang merupakan kelipatan dari " + angka + " dan dapat dibagi 2:");

        do {
            if (j % 2 == 0) {
                System.out.print(j + " ");
                i++;
            }
            j += angka;
        } while (i < 10);
    }
}

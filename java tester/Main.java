import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)
			throws IOException {
		int nilaiRataRata;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Nilai rata-rata = ");
		nilaiRataRata = Integer.parseInt(reader.readLine());

		if (nilaiRataRata <= 70) {
			if (nilaiRataRata <= 60) {
				System.out.println("Keterangan : Tidak Lulus");
				System.out.print("Predikat : Kurang ");
			} else if ((nilaiRataRata <= 70) && (nilaiRataRata > 60)) {
				System.out.println("Keterangan : Tidak Lulus");
				System.out.print("Predikat : Cukup");
			}
		} else if (nilaiRataRata > 70) {
			if ((nilaiRataRata > 70) && (nilaiRataRata <= 80)) {
				System.out.println("Keterangan : Lulus");
				System.out.print("Predikat : Baik");
			} else if ((nilaiRataRata > 80) && (nilaiRataRata <= 90)) {
				System.out.println("Keterangan : Lulus");
				System.out.println("Predikat : Memuaskan");
			} else if (nilaiRataRata > 90) {
				System.out.println("Keterangan : Lulus");
				System.out.print("Predikat : Sangat Memuaskan");
			}
		}
	}
}
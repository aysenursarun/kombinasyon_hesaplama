package kombinasyon_hesaplama;

import java.util.Scanner;

public class kombinasyon_hesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Kümedeki eleman sayısını girin: ");
		int n = scan.nextInt();

		System.out.print("Kaç elemanlı gruplar oluşturmak istiyorsunuz: ");
		int r = scan.nextInt();

		if (r > n) {
			System.out.println(
					"Geçersiz veri girildi. Oluşturulacak gruptaki eleman sayısı kümedeki eleman sayısından fazla olamaz.");
		}

		int n_total = 1;
		int r_total = 1;
		int x_total = 1;
		int x = n - r;

		for (int i = 1; i <= n; i++) {
			n_total = n_total * i;
		}

		for (int i = 1; i <= r; i++) {
			r_total = r_total * i;
		}

		for (int i = 1; i <= x; i++) {
			x_total = x_total * i;
		}

		int sonuc = n_total / (r_total * x_total);

		System.out.println(sonuc);

	}

}

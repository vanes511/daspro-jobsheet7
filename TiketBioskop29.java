import java.util.Scanner;
public class TiketBioskop29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        int persenDiskon;
        double diskon, potongan, totalHarga;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break; 
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
                persenDiskon = 15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
                persenDiskon = 10;
            } else {
                diskon = 0;
                persenDiskon = 0;
            }

            totalHarga = jumlahTiket * hargaTiket;
            potongan = totalHarga * diskon;
            totalHarga = totalHarga - potongan;
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Diskon: " + persenDiskon + "%");
            System.out.println("Potongan harga: Rp " + potongan);
            System.out.println("Total harga setelah diskon: Rp " + totalHarga);
            System.out.println("---------------------------");

        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
 }


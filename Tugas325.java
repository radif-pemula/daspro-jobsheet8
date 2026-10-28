import java.util.Scanner;
public class Tugas325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int nomorToko = 1;
            int totalSemuaBarang = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;
            String rekap = "";
            while (nomorToko <= jumlahToko) {
                System.out.println("Toko " + nomorToko);
                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);
                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) { 
                    int barang;
                    do {
                        System.out.print("    Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("    Jumlah barang tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }
                rekap += "Toko " + nomorToko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko + "\n";
                totalSemuaBarang += totalBarangToko;
                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = nomorToko;
                }
                nomorToko++;
            }
            System.out.println();
            System.out.print(rekap);
            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
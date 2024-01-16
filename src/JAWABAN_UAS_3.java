import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JAWABAN_UAS_3 {
    public static void main(String[] args) {
        ArrayList<Integer> biruList = new ArrayList<>();
        ArrayList<Integer> merahList = new ArrayList<>();
        ArrayList<Integer> hijauList = new ArrayList<>();
        ArrayList<Integer> oranyeList = new ArrayList<>();
        ArrayList<Integer> hitamList = new ArrayList<>();
        ArrayList<Integer> unguList = new ArrayList<>();

        tambahProduksi(biruList);
        tambahProduksi(merahList);
        tambahProduksi(hijauList);
        tambahProduksi(oranyeList);
        tambahProduksi(hitamList);
        tambahProduksi(unguList);

        tampilkanJumlahPensil(biruList, "Biru");
        tampilkanJumlahPensil(merahList, "Merah");
        tampilkanJumlahPensil(hijauList, "Hijau");
        tampilkanJumlahPensil(oranyeList, "Oranye");
        tampilkanJumlahPensil(hitamList, "Hitam");
        tampilkanJumlahPensil(unguList, "Ungu");

        tampilkanProduksiMaksMin(biruList,"Biru");
        tampilkanProduksiMaksMin(merahList,"Merah");
        tampilkanProduksiMaksMin(hijauList,"Hijau");
        tampilkanProduksiMaksMin(oranyeList,"Oranye");
        tampilkanProduksiMaksMin(hitamList,"Hitam");
        tampilkanProduksiMaksMin(unguList,"Ungu");
    }

    public static void tambahProduksi(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i <5000; i++) {
            list.add(random.nextInt(3333));
        }

    }

    public static void tampilkanJumlahPensil(ArrayList<Integer> list, String warna) {
        System.out.println("Jumlah pensil " + warna + list.size());
    }

    public static void tampilkanProduksiMaksMin(ArrayList<Integer> list, String warna) {
        int maxProduksi = Collections.max(list);
        int minProduksi = Collections.min(list);
        System.out.println("Produksi maksimun pensil " + warna + ": " + maxProduksi);
        System.out.println("Produksi minimum pensil" + warna + ": " + minProduksi);
    }
}

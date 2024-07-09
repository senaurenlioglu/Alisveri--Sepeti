import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShoppingCart sepet = new ShoppingCart();
        boolean devam = true;

        while (devam) {
            System.out.print("Ürün Adı: ");
            String urunAdi = scanner.nextLine();
            System.out.print("Tedarikçi Adı: ");
            String tedarikciAdi = scanner.nextLine();
            System.out.print("Satış Fiyatı: ");
            double satisFiyati = scanner.nextDouble();
            System.out.print("Alış Fiyatı: ");
            double alisFiyati = scanner.nextDouble();
            scanner.nextLine();

            Item urun = new Item(urunAdi, tedarikciAdi, satisFiyati, alisFiyati);

            System.out.println("\nÜrün Bilgileri: " + urun.urunBilgileriniGoster());

            urun.satisFiyatiArttir();

            double kar = urun.karHesapla();
            System.out.println("Kar: " + kar);

            sepet.urunEkle(urun);

            System.out.print("Başka bir ürün eklemek ister misiniz? (Evet için 'E', Hayır için 'H' yazın): ");
            String cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase("H")) {
                devam = false;
            }
        }

        System.out.println("\nSepetteki Ürünler:");
        sepet.sepetiListele();
        double toplamFiyat = sepet.toplamFiyat();
        System.out.println("Sepetteki Ürünlerin Toplam Fiyatı: " + toplamFiyat);

    }
}
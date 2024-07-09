import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> sepet;

    // Constructor
    public ShoppingCart() {
        this.sepet = new ArrayList<>();
    }


    public void urunEkle(Item item) {
        sepet.add(item);
    }


    public double toplamFiyat() {
        double toplam = 0.0;
        for (Item item : sepet) {
            toplam += item.getSatisFiyati();
        }
        return toplam;
    }


    public void sepetiListele() {
        for (Item item : sepet) {
            System.out.println(item.urunBilgileriniGoster());
        }
    }

}

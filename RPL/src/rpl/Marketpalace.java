package rpl;

/**
 *
 * @author ridho
 */
public class Marketpalace {
    public Barang[] UnvItem = new Barang[100];

    public Barang[] getUnvItem() {
        return UnvItem;
    }

    public void setUnvItem(Barang[] UnvItem) {
        this.UnvItem = UnvItem;
    }

    public void uploadToMarketplace(Barang newBarang) {
        for (int i = 0; i < UnvItem.length; i++) {
            if (UnvItem[i] == null) {
                UnvItem[i] = newBarang;
                break; // Stop after adding the new Barang.
            }
        }
    }
}

public class Sulfuras extends Item{
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateParams() {
        // Does nothing because for some reason Sulfuras doesn't need any update quality
    }
}

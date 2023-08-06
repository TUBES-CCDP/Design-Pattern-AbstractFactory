public class Main {
    public static void main(String[] args) {
        AbstractFactory lingkaranFactory = new LingkaranFactory();
        AbstractFactory persegiFactory = new PersegiFactory();

        BangunDatar lingkaran = lingkaranFactory.createBangunDatar();
        BangunDatar persegi = persegiFactory.createBangunDatar();

        lingkaran.gambar();
        persegi.gambar();
    }
}

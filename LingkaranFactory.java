public class LingkaranFactory implements AbstractFactory {
    @Override
    public BangunDatar createBangunDatar() {
        return new Lingkaran();
    }
}

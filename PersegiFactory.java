public class PersegiFactory implements AbstractFactory {
    @Override
    public BangunDatar createBangunDatar() {
        return new Persegi();
    }
}

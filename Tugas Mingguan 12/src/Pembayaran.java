abstract public class Pembayaran {
    int biaya;

    Pembayaran(int biaya){
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    abstract int pembayaran();
}

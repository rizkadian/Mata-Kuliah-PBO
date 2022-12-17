public class Bayarsewa extends Pembayaran{

    Bayarsewa(int biaya){
        super(biaya);
    }

    @Override
    int pembayaran() {
        return super.getBiaya();
    }
}

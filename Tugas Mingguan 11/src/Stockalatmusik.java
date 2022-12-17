public class Stockalatmusik implements Stock{
    @Override
    public int jumlahstock(int ga, int gb, int ka, int kb, int dr) {
        return ga+gb+ka+kb+dr;
    }
}

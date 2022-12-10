public class Drum extends Alat_musik{
    String isi_drum="3 set drum";
    public final void view_data(){
        System.out.println(" 11               Drum                     90.000");
        System.out.println(" Isi drum : "+isi_drum);
    }
    public String note(){
        return " - Alat musik drum";
    }
}

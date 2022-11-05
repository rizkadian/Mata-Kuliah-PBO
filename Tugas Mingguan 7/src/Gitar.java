public class Gitar extends Alat_musik{
    String[] jenis_gitar = {"Akustik", "Lisrik"};
    public final void view_data(){
        System.out.println("-----------------------------------------------------");
        System.out.println(" 31               Gitar                    40.000");
        System.out.println(" Jenis gitar : " + jenis_gitar[0]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 32               Gitar                    60.000");
        System.out.println(" Jenis gitar : " + jenis_gitar[1]);
    }
    public String note(){
        return " - Alat musik gitar";
    }
}

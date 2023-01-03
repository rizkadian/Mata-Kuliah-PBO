public class Alat_musik {
    protected int id_alatmusik;
    protected String nama_alatmusik;
    protected int harga;

    public int getId_alatmusik() {
        return id_alatmusik;
    }

    public void setId_alatmusik(int id_alatmusik) {
        this.id_alatmusik = id_alatmusik;
    }

    public String getNama_alatmusik() {
        return nama_alatmusik;
    }

    public void setNama_alatmusik(String nama_alatmusik) {
        this.nama_alatmusik = nama_alatmusik;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    protected void view_data() {
        Drum Drum = new Drum();
        Keyboard Keyboard = new Keyboard();
        Gitar Gitar = new Gitar();
        System.out.println("=====================================================");
        System.out.println("                   DAFTAR ALAT MUSIK");
        System.out.println("=====================================================");
        System.out.println(" ID |        Nama Alat Musik         |   Harga Sewa  ");
        System.out.println("=====================================================");
        Drum.view_data();
        Keyboard.view_data();
        Gitar.view_data();
        System.out.println("=====================================================");
    }

    public String note(){
        return "DAFTAR ALAT MUSIK";
    }
}

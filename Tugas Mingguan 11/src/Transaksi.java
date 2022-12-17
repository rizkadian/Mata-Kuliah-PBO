import java.util.Scanner;
public class Transaksi {
    private String jaminan;
    private int tanggal_sewa;
    private int jumlah_hari, jumlah_item;
    private int pilih, bayar;
    Scanner input = new Scanner(System.in);
    Anggota Anggota = new Anggota();
    Alat_musik Alat = new Alat_musik();
    public Transaksi(){ //konstruktor
        System.out.print("      Harga di atas merupakan harga perharinya");
    }
    public Transaksi(String note){ //konstruktor overriding
        System.out.print(note);
    }
    public void pilih_alatmusik(){
        System.out.print("Masukkan ID Alat musik yang akan dipilih : ");
        pilih = input.nextInt();
        if(pilih==11){
            Alat.setId_alatmusik(11);
            Alat.setNama_alatmusik("Drum");
            Alat.setHarga(90000);
        } else if(pilih==21){
            Alat.setId_alatmusik(21);
            Alat.setNama_alatmusik("Keyboard");
            Alat.setHarga(55000);
        } else if(pilih==22){
            Alat.setId_alatmusik(22);
            Alat.setNama_alatmusik("Keyboard");
            Alat.setHarga(60000);
        } else if(pilih==31){
            Alat.setId_alatmusik(31);
            Alat.setNama_alatmusik("Gitar");
            Alat.setHarga(40000);
        } else if(pilih==32){
            Alat.setId_alatmusik(32);
            Alat.setNama_alatmusik("Gitar");
            Alat.setHarga(60000);
        } else {
            System.out.println("Maaf pilihan menu sewa tidak tersedia.");
            pilih_alatmusik();
        }
    }
    void insert_data(){
        System.out.println();
        System.out.println("DETAIL PENYEWAAN");
        System.out.print("Masukkan jaminan : ");
        jaminan = input.next();
        System.out.print("Masukkan tanggal sewa : ");
        tanggal_sewa = input.nextInt();
        System.out.print("Masukkan jumlah hari : ");
        jumlah_hari = input.nextInt();
        System.out.print("Masukkan jumlah item : ");
        jumlah_item = input.nextInt();
    }
    public int jumlah(int a, int b){
        return a+b;
    }
    public int jumlah(int c, int d, int e){
        return ((c*d)+(d*e));
    }
    protected int jumlah(int f){
        return f-jumlah(jumlah_hari, Alat.getHarga(), jumlah_item);
    }
    public void view_data(){
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                  DETAIL PENYEWAAN ");
        System.out.println("=====================================================");
        System.out.println(" Nama Alat Musik - "+Alat.getId_alatmusik()+" "+Alat.getNama_alatmusik());
        System.out.println(" Jaminan         : "+jaminan);
        System.out.println(" Tanggal Sewa    : "+tanggal_sewa);
        System.out.println(" Tanggal Kembali : "+jumlah(tanggal_sewa, jumlah_hari));
        System.out.println(" Jumlah          : "+jumlah_item);
        System.out.println("-----------------------------------------------------");
        System.out.println(" Harga                                    : "+Alat.getHarga());
        System.out.println(" Total                                    : "+jumlah(jumlah_hari, Alat.getHarga(), jumlah_item));
        System.out.print(" Bayar                                    : ");
        bayar = input.nextInt();
        System.out.println("=====================================================");
    }
    public void cetak_data(){
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                   STRUCK PENYEWAAN ");
        System.out.println("=====================================================");
        System.out.println(" Nama Penyewa    : "+Anggota.nama_anggota);
        System.out.println(" Alamat Penyewa  : "+Anggota.alamat);
        System.out.println(" Telepon Penyewa : "+Anggota.telepon);
        System.out.println(" Jaminan         : "+jaminan);
        System.out.println(" Tanggal Sewa    : "+tanggal_sewa);
        System.out.println(" Tanggal Kembali : "+jumlah(tanggal_sewa, jumlah_hari));
        System.out.println("-----------------------------------------------------");
        System.out.println(" Nama Alat Musik - "+Alat.getId_alatmusik()+" "+Alat.getNama_alatmusik());
        System.out.println(" Jumlah                                   : "+jumlah_item);
        System.out.println(" Harga                                    : "+Alat.getHarga());
        System.out.println("-----------------------------------------------------");
        System.out.println(" Total                                    : "+jumlah(jumlah_hari, Alat.getHarga(), jumlah_item));
        System.out.println(" Bayar                                    : "+bayar);
        System.out.println(" Kembali                                  : "+jumlah(bayar));
        System.out.println("=====================================================");
    }
}

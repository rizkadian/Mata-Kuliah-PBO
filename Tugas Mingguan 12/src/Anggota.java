import java.util.Scanner;
import java.io.FileNotFoundException;
public class Anggota {
    public String id_anggota;
    public String nama_anggota;
    public String alamat;
    public long telepon;

    public void insert_data(){
        Scanner input = new Scanner(System.in);
        System.out.println("DATA ANGGOTA");
        System.out.print("Masukkan ID anggota : ");
        id_anggota = input.nextLine();
        System.out.print("Masukkan nama anggota : ");
        nama_anggota = input.nextLine();
        System.out.print("Masukkan alamat anggota : ");
        alamat = input.nextLine();
        System.out.print("Masukkan telepon anggota : ");
        telepon = input.nextLong();
    }

    public void cetak_data(){
        java.io.File file = new java.io.File("Data Penyewa.txt");
        try {

            java.io.PrintWriter out = new java.io.PrintWriter(file);

            out.println("=====================================================");
            out.println("                   DATA PENYEWAAN ");
            out.println("=====================================================");
            out.println(" Nama Penyewa    : " + nama_anggota);
            out.println(" Alamat Penyewa  : " + alamat);
            out.println(" Telepon Penyewa : " + telepon);
            out.println("=====================================================");
            out.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Cetak File Gagal");
        }
    }
}

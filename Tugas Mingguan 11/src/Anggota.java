import java.util.Scanner;
public class Anggota {
    public int id_anggota;
    public String nama_anggota;
    public String alamat;
    public long telepon;
    public void insert_data(){
        Scanner input = new Scanner(System.in);
        System.out.println("DATA ANGGOTA");
        System.out.print("Masukkan ID anggota : ");
        id_anggota = input.nextInt();
        System.out.print("Masukkan nama anggota : ");
        nama_anggota = input.nextLine();
        System.out.print("Masukkan alamat anggota : ");
        alamat = input.nextLine();
        System.out.print("Masukkan telepon anggota : ");
        telepon = input.nextLong();
    }
}

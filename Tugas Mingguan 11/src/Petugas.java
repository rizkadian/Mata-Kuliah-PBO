import java.util.Scanner;
public class Petugas {
    public int id_petugas;
    public String nama_petugas;
    private String username;
    private String password;

    public void insert_data(){
        Scanner input = new Scanner(System.in);
        System.out.println("DATA PETUGAS");
        System.out.print("Masukkan ID petugas : ");
        id_petugas = input.nextInt();
        System.out.print("Masukkan nama petugas : ");
        nama_petugas = input.next();
    }

    public final String getUsername() {
        return "a";
    }
    public final String getPassword() {
        return "aa";
    }
}

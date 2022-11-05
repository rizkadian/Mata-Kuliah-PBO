import java.util.Scanner;
public class Main {
    protected static void loginpage(){
        Petugas Petugas = new Petugas();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        System.out.print("Masukkan Password : ");
        String password = input.nextLine();
        if ((username==Petugas.getUsername()) && (password==Petugas.getPassword())){
            sapa("Petugas");
            sapa(1);
        }
        /*else{
            System.out.println("Password atau Username Anda salah.");
            System.out.println();
            loginpage();
        }*/
    }

    static void sapa(String hai){
        System.out.println("Selamat Datang "+hai);
    }
    static void sapa(int hai){
        System.out.println("Admin Ke - "+hai);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        loginpage();
        System.out.println();
        Petugas Petugas = new Petugas();
        Petugas.insert_data();
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("         MENU APLIKASI PENYEWAAN ALAT MUSIK");
        System.out.println("=====================================================");
        System.out.println(" 1. Daftar Anggota ");
        System.out.println(" 2. Menyewa Alat Musik");
        System.out.println(" 3. Daftar Petugas");
        System.out.println(" 4. Daftar Alat Musik ");
        System.out.println("=====================================================");
        System.out.print("Masukkan pilihan menu : ");
        int menu = input.nextInt();
        if (menu==1){
            System.out.println();
            Anggota Anggota = new Anggota();
            Anggota.insert_data();
            System.out.println();
        }
        if (menu==2){
            System.out.println();
            Anggota Anggota = new Anggota();
            Anggota.insert_data();
            System.out.println();
            Alat_musik Alat = new Alat_musik();
            Alat.view_data();
            Transaksi Transaksi = new Transaksi();
            System.out.println();
            Transaksi Transaksi2 = new Transaksi("     Penyewa dapat menyewa lebih dari satu hari");
            System.out.println();
            System.out.println("=====================================================");
            Transaksi.pilih_alatmusik();
            Transaksi.insert_data();
            Transaksi.view_data();
            Transaksi.cetak_data();
        }
        if (menu==3){
            Petugas.insert_data();
            System.out.println();
        }
        if (menu==4){
            System.out.println();
            Alat_musik Alat = new Alat_musik();
            System.out.println(Alat.note());
            Keyboard Keyboard = new Keyboard();
            System.out.println(Keyboard.note());
            Gitar Gitar = new Gitar();
            System.out.println(Gitar.note());
            Drum Drum = new Drum();
            System.out.println(Drum.note());
        }
    }
}
import java.util.Scanner;

public class Main {
    protected static void loginpage(){
        Petugas Petugas = new Petugas();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        System.out.print("Masukkan Password : ");
        String password = input.nextLine();

        if (Petugas.getUsername()==username){
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
        System.out.println(" 1. Menyewa Alat Musik");
        System.out.println(" 2. Daftar Anggota");
        System.out.println(" 3. Daftar Petugas");
        System.out.println(" 4. Daftar Alat Musik");
        System.out.println(" 5. Lihat Harga Sewa Alat Musik (abstrac)");
        System.out.println(" 6. Stock Alat Musik (interface)");
        System.out.println("=====================================================");
        System.out.print("Masukkan pilihan menu : ");
        int menu = input.nextInt();
        if (menu==2){
            System.out.println();
            Anggota Anggota = new Anggota();
            Anggota.insert_data();
            System.out.println();
        }
        if (menu==1){
            System.out.println();
            Anggota Anggota = new Anggota();
            Anggota.insert_data();
            Anggota.cetak_data();
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
        if (menu==5){
            System.out.println();
            System.out.println("=====================================================");
            System.out.println("              LIHAT HARGA SEWA ALAT MUSIK");
            System.out.println("-----------------------------------------------------");
            System.out.println("1. Gitar Jenis Austik");
            System.out.println("2. Gitar Jenis Listrik");
            System.out.println("3. Keyboard Merek Yamaha");
            System.out.println("4. Keyboard Merek Samson");
            System.out.println("5. Drum 3 Set ");
            System.out.println("=====================================================");
            System.out.print("Masukkan pilihan menu : ");
            int pilih = input.nextInt();
            if (pilih==1){
                Bayarsewa p = new Bayarsewa(40000);
                System.out.println("Harga Sewa : " + p.pembayaran());
            }
            else if (pilih==2){
                Bayarsewa p = new Bayarsewa(60000);
                System.out.println("Harga Sewa : " + p.pembayaran());
            }
            else if (pilih==3){
                Bayarsewa p = new Bayarsewa(55000);
                System.out.println("Harga Sewa : " + p.pembayaran());
            }
            else if (pilih==4){
                Bayarsewa p = new Bayarsewa(60000);
                System.out.println("Harga Sewa : " + p.pembayaran());
            }
            else if (pilih==5){
                Bayarsewa p = new Bayarsewa(90000);
                System.out.println("Harga Sewa : " + p.pembayaran());
            }
            else {
                System.out.println("Pilihan menu tidak ada");
            }
        }
        if (menu==6){
            Stockalatmusik sam = new Stockalatmusik();
            System.out.println();
            System.out.println("=====================================================");
            System.out.println("                   STOCK ALAT MUSIK");
            System.out.println("-----------------------------------------------------");
            System.out.print("Masukkan jumlah alat musik Gitar Jenis Austik : ");
            int ga = input.nextInt();
            System.out.print("Masukkan jumlah alat musik Gitar Jenis Listrik : ");
            int gb = input.nextInt();
            System.out.print("Masukkan jumlah alat musik Keyboard Merek Yamaha : ");
            int ka = input.nextInt();
            System.out.print("Masukkan jumlah alat musik Keyboard Merek Samson : ");
            int kb = input.nextInt();
            System.out.print("Masukkan jumlah alat musik Drum 3 Set : ");
            int dr = input.nextInt();
            System.out.println("=====================================================");
            System.out.println("Jumlah stock alat musik : "+sam.jumlahstock(ga, gb, ka, kb, dr));

        }
    }
}
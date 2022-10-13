import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int pilih;
        String data1 = "Hallo";
        String data2 = "Selamat datang";
        String data3 = "Rizka Dianrani";
        Scanner input = new Scanner(System.in); //Scanner untuk input
        System.out.println("===============================");
        System.out.println("      PROGRAM JAVA DASAR       ");
        System.out.println("===============================");
        System.out.println("1. Perulangan For");
        System.out.println("2. Perulangan While");
        System.out.println("3. Perulangan Do While");
        System.out.println("4. Array 1 Dimensi");
        System.out.println("5. Array Multidimensi");
        System.out.println();
        System.out.print("Masukan Pilihan Anda : ");
        pilih= input.nextInt();
        if(pilih==1){
            System.out.println();
            System.out.println("Perulangan Menggunakan For");
            System.out.println();
            for(int i=0; i<5; i++){
                System.out.println(data1);
            }
        } else if (pilih==2) {
            System.out.println();
            System.out.println("Perulangan Menggunakan While");
            System.out.println();
            int i=1;
            while (i <=5 ){
                System.out.println(data2);
                i++;
            }
        } else if (pilih==3) {
            System.out.println();
            System.out.println("Perulangan Menggunakan Do-While");
            System.out.println();
            int i=1;
            do{
                System.out.println(data3);
                i++;
            }while (i<=5);
            System.out.println(data3);
        } else if (pilih==4) {
            System.out.println();
            System.out.println("Array 1 Dimensi");
            System.out.println();
            int[] array = new int[10];
            for(int i=1; i<=5; i++){
                System.out.print("Masukan data ke - "+i+" = ");
                array[i]= input.nextInt();
            }
            System.out.println();
            for(int i=1; i<=5; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        } else if (pilih==5) {
            System.out.println();
            System.out.println("Array Multidimensi");
            System.out.println();
            int[][] array = new int[10][10];
            for(int i=1; i<=3; i++){
                for(int j=1; j<=3; j++) {
                    System.out.print("Masukan data ke - "+i+" = ");
                    array[i][j]= input.nextInt();
                }
                System.out.println();
            }
            for(int i=1; i<=3; i++){
                for(int j=1; j<=3; j++) {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
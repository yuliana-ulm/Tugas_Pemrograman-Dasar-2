import java.util.Scanner;

public class Tugas3_PEMDAS2 {
    public static void main(String [] arguments) {
        int satu, dua, hasil, operasi;

        System.out.print("Masukkan angka pertama = ");
        satu = keyboard.nextInt();
        System.out.print("Masukkan angka kedua = ");
        dua = keyboard.nextInt();
        System.out.print("Sistem Operasi = ");
        operasi = keyboard.nextInt();

        if (operasi == 1){
            hasil = satu + dua;
            System.out.println("Penambahan = " + hasil);
        } else if(operasi == 2){
            hasil = satu - dua;
            System.out.println("Pengurangan = " + hasil);
        } else if(operasi == 3){
            hasil = satu * dua;
            System.out.println("Perkalian = " + hasil);
        } else if(operasi == 4){
            hasil = satu / dua;
            System.out.println("Pembagian = " + hasil);
        } else {
            System.out.println("Operasi tidak ada");
        }
    }
}

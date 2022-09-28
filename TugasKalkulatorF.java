import java.util.Scanner;

public class TugasKalkulatorF{
    public static void main(String[] arguments){
        Scanner keyboard = new Scanner(System.in);
        String operasi;
        double pertama, kedua, hasil;


        System.out.print("Masukkan bilangan bulat pertama = "); 
        pertama = keyboard.nextInt();
        
        System.out.print("Masukkan bilangan bulat kedua = ");
        kedua = keyboard.nextInt();

        System.out.print("Operasi (+, -, x, /) = ");
        operasi = keyboard.next();
        
            switch(operasi){
                case "+":                           
                    hasil = penjumlahan(pertama, kedua);
                    System.out.println(pertama + " + " + kedua + " = " + hasil);
                    break;
                case "-":                           
                    hasil = pengurangan(pertama, kedua);
                    System.out.println(pertama + " - " + kedua + " = " + hasil);
                    break;
                case "x":                           
                    hasil = perkalian(pertama, kedua);
                    System.out.println(pertama + " x " + kedua + " = " + hasil);
                    break;
                case "/":                           
                    hasil = pembagian(pertama, kedua);
                    System.out.println(pertama + " / " + kedua + " = " + hasil);
                    break;
                default:
                    System.out.println("Operasi tidak ada, Silahkan pilih yang lain");
                // default:
            
        }

    }
    static double penjumlahan(double a, double b){
        double hasil;
        hasil = a + b;
        return hasil;
    }
        static double pengurangan(double a, double b){
        double hasil;
        hasil = a - b;
        return hasil;
    }
        static double perkalian(double a, double b){
        double hasil;
        hasil = a * b;
        return hasil;
    }
        static double pembagian(double a, double b){
        double hasil;
        hasil = a / b;
        return hasil;
    }
}

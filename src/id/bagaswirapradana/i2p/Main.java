package id.bagaswirapradana.i2p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // variabel
        int value;

        // input
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Angka antara 1 - 100 : ");

        // validation integer or not
        if (!masukan.hasNextInt()) {
            System.out.println("Data yang dimasukkan hanya bisa berupa bilangan bulat saja.");
            masukan.close();
        }

        value = masukan.nextInt();
        // validation range 1 until 100 or not
        if (value < 1 || value > 100) {
            System.out.println("Data yang dimasukkan harus dalam rentang dari 1 sampai 100.");
        } else {
            /*
              - if n odd, print "AJAIB"
              - if n even and still range of 2-5 print "Tidak AJAIB"
              - if n even and stiil range of 6 - 20, print "AJAIB"
              - if n even and more than 20, print "Tidak AJAIB"
             */
            System.out.println(value % 2 != 0 || value >= 6 && value <= 20 ? "AJAIB" : "Tidak AJAIB");
        }
        masukan.close();
    }
}

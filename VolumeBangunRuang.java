import java.util.*;
import java.lang.Math;

public class VolumeBangunRuang {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /*
            Pada hari senin andi dan dodi sedang ulangan pelajaran matematika.
            namaun ketika ulangan berlangsung andi dan dodi ketahuan menyontek satu sama lain.
            atas perbuatan itu mereka berdua mendapat tambahan tugas matematika,
            yaitu mencari volume bangun ruang kubus, persegi panjang, tabung, kerucut.
            buatlah program menghitung volume bangun ruang guna membantu andi dan dodi !
        */
        int pilih;
        
        System.out.println("PROGRAM MENGHITUNG VOLUME BANGUN RUANG");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Volume Persegi Panjang");
        System.out.println("3. Volume Tabung");
        System.out.println("4. Volume Kerucut");
        pilih = input.nextInt();
        if (pilih == 1) {
            kubus();
        } else {
            if (pilih == 2) {
                persegiPanjang();
            } else {
                if (pilih == 3) {
                    tabung();
                } else {
                    if (pilih == 4) {
                        kerucut();
                    } else {
                        System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK SESUAI, SILAHKAN COBALAGI :)");
                    }
                }
            }
        }
        System.out.println("TERIMAKASIH TELAH MENCOBA :)");
    }
    
    public static void kerucut() {
        int r, t, v;
        
        System.out.println("JARI-JARI:");
        r = input.nextInt();
        System.out.println("TINGGI:");
        t = input.nextInt();
        v = (int) ((double) 1 / 3 * 22 / 7 * r * r * t);
        System.out.println("Volume Kerucut = " + v);
    }
    
    public static void kubus() {
        int v, s;
        
        System.out.println("PANJANG SISI =");
        s = input.nextInt();
        v = s * s * s;
        System.out.println("Volume Kubus = " + v);
    }
    
    public static void persegiPanjang() {
        int p, l, t, v;
        
        System.out.println("PANJANG:");
        p = input.nextInt();
        System.out.println("LEBAR:");
        l = input.nextInt();
        System.out.println("TINGGI:");
        t = input.nextInt();
        v = p * l * t;
        System.out.println("Volume Persegi Panjang =" + v);
    }
    
    public static void tabung() {
        int r, t, v;
        
        System.out.println("JARI-JARI:");
        r = input.nextInt();
        System.out.println("TINGGI:");
        t = input.nextInt();
        v = (int) ((double) 22 / 7 * r * r * t);
        System.out.println("Volume Tabung = " + v);
    }
}

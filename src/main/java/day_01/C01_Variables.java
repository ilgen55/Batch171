package day_01;

public class C01_Variables {

    public static void main(String[] args) {
        //
        int yas = 35;
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);

        // bir veriable olusturun ve sayi = 50 seklinde yazdirin
        int sayi = 50;
        System.out.println("sayi = " + sayi);
        // bir veriable yi etiketiyle yazdirmanin kisa yolu = soutv
        System.out.println("yas = " + yas);

        // String bir veriable olusturalim
        String isim = "Ali";
        System.out.println("isim = " + isim);

        // olusturdugumuz bir veriablei farkli bir veriable e kopyala
        int benimYasim = yas;
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        // ayni satir da coklu veriable deklare et
        int yil = 2023, ay = 5, gun = 15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        // bir variable degerini guncelle
        isim = "Veli";
        System.out.println("isim = " + isim);


        //       //Bir variable deklere et : x
           double x;

        //        //Bir variable baslat : y
           double y = 12.5;
        //        //Başka bir variable başlat : z
           double z = 33;
        //        //x degişkenini y degişkeni ile başlat
           x = y;
        //        //Variable y'i guncelle
           y = 21.5;
        //        //Degişkenleri yazdır
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        System.out.println("z = " + z);


    }


}

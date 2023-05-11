package day_01;

public class C05_MethodCreation {


     //iki sayının kareleri toplamını bulan
    // ve yazdıran bır method olusturunuz

    public static void main(String[] args) {
        int karelerToplami =toplam(5,7);
        System.out.println("karelerToplami = " + karelerToplami);

        // 2. yol
        int a = 5;
        int b = 7;
        sonuc(a,b);


    }

    private static void sonuc(int a, int b) {
        System.out.println("kareler toplamı = " + (a*a)+(b*b));
    }

    // 1 . yol
    public static int toplam(int a, int b){
        return(a*a)+(b*b);

    }



}

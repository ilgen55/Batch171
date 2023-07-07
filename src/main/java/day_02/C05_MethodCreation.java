package day_02;

public class C05_MethodCreation {

      /*
        1- Verilen a ve b variable'larinin degerlerini degistiren (SWAP)
        ve yazdıran bir method  yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
      public static void main(String[] args) {
          // swap oncesi
          int a = 10 ;
          int b = 20 ;
          System.out.println("swaptan önce a :" + a);
          System.out.println("swaptan önce b :" + b);
          swaplaYazdır(a,b);


      }

    private static void swaplaYazdır(int a, int b) {
          int temp;
          temp = a;
          a =b;
          b= temp;
        System.out.println("swaptan sonra a :" + a);
        System.out.println("swaptan sonra b :" + b);
    }
}

package day_02;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit cinsi bir sıcaklık girin");
        double fahr = scan.nextDouble();
        System.out.println("fahr = " + fahr);

        double selcius = fahrToCels(fahr);
        System.out.println("selcius = " + selcius);


    }

    private static double fahrToCels(double fahr) {
        double selcius = (fahr -32)/1.8;
        return selcius;
    }


    // kullanıcıdan fahrenayt cinsi bir drğer ğirmesini isteyiniz
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8

    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli


}

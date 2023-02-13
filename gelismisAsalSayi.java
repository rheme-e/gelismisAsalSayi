package Giris;
import java.util.Scanner;
public class gelismisAsalSayi {
    static int asal(int n){
        int asalDegil=0;
        for(int i=2 ; i<n ; i++){
            if(n%i==0){
                asalDegil=1;
                break;
            }
        }
        if(asalDegil==0){
            System.out.println(n+" asaldır.");
        }else{
            System.out.println(n+" asal değlldir.");

        }
        return 1;
    }



    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int n= inp.nextInt();
        System.out.println(asal(n));
    }

}

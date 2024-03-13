import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy= input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo= input.nextDouble();

        indeks=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz:" +indeks);
    }
}
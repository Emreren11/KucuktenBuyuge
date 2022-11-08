import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int a,b,c;

        System.out.print("1. sayıyı giriniz: ");
        a= inp.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        do {                // sayıların aynı olma durumu için kullandım
            b= inp.nextInt();
            if (a==b)
                System.out.print("2. sayı 1. sayıyla aynı olamaz. Lütfen 2. sayıyı tekrar giriniz: ");
        }while(a==b);


        System.out.print("3. sayıyı giriniz: ");
        do {
            c= inp.nextInt();
            if (c==a || c==b)
                System.out.print("3. sayı 1. veya 2. sayıyla aynı olamaz. Lütfen 3. sayıyı tekrar giriniz: ");
        }while(c==a || c==b);


        if (a<b && a<c)
        {
            if (b<c)
                System.out.println(a+" < "+b+" < "+c);
            else
                System.out.println(a+" < "+c+" < "+b);
        }

        if (b<a && b<c)
        {
            if (a<c)
                System.out.println(b+" < "+a+" < "+c);
            else
                System.out.println(b+" < "+c+" < "+a);
        }

        if (c<a && c<b)
        {
            if (a<b)
                System.out.println(c+" < "+a+" < "+b);
            else
                System.out.println(c+" < "+b+" < "+a);
        }
    }
}
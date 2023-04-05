import java.util.Scanner;

public class Banknotes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        System.out.println(total);
        System.out.println((total/100)+" nota(s) de R$ 100,00");
        total=total%100;
        System.out.println((total/50)+" nota(s) de R$ 50,00");
        total=total%50;
        System.out.println((total/20)+" nota(s) de R$ 20,00");
        total=total%20;
        System.out.println((total/10)+" nota(s) de R$ 10,00");
        total=total%10;
        System.out.println((total/5)+" nota(s) de R$ 5,00");
        total=total%5;
        System.out.println((total/2)+" nota(s) de R$ 2,00");
        total=total%2;
        System.out.println((total/1)+" nota(s) de R$ 1,00");
        total=total%1;


    }
}

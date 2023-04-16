import java.util.Scanner;

public class Average  {
    public static void main(String[] args) {
       float A,B,C;

        Scanner sc = new Scanner(System.in);
        A= sc.nextFloat();
        B= sc.nextFloat();
        C=sc.nextFloat();
        float X= ((A*2)+(B*3)+(C*5))/(2+3+5);
        System.out.println("MEDIA = "+String.format("%.1f",X));

    }
}

import java.text.DecimalFormat;
import java.util.Scanner;


public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance, x, y;

        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();

        distance = Math.sqrt(Math.pow(x=(x2-x1),2) + Math.pow(y=(y2-y1),2));

        System.out.printf("%.4f\n",distance);


    }



}

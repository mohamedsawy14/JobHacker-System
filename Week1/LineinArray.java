import java.util.Scanner;

public class LineinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[][] = new double[12][12];
        int n = sc.nextInt();
        char x = sc.next().charAt(0);
        double sum=0, avg=0;
        for (int i =0; i< arr.length; i++){
            for (int j = 0; j < arr.length ; j++) {
                arr[i][j]= sc.nextDouble();
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(n==i) {
                for (int j = 0; j < arr.length; j++) {
                    sum +=arr[i][j];

                }
                break;
            }
        }
        avg=(sum/3.0);
        if (x=='S'){
            System.out.printf("%.1f\n",sum);
        } else if (x=='M') {
            System.out.printf("%.1f\n",avg);
        }
    }
}

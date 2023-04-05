import java.util.Scanner;

public class ColumninArray {
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
        for (int j = 0; j < arr.length ; j++) {
            if(n==j) {
                for (int i = 0; i < arr.length; i++) {
                    sum +=arr[i][j];

                }
                break;
            }
        }
        avg=(sum/12.0);
        if (x=='S'){
            System.out.printf("%.1f\n",sum);
        } else if (x=='M') {
            System.out.printf("%.1f\n",avg);
        }
    }
}

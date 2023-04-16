import java.util.Scanner;

public class Arraychange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[]= new int[4];
        int revarr[] = new int[4];
        for (int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for (int i = arr.length-1, j=0; i>=0; i--, j++){
            revarr[j]= arr[i];
        }
        for (int i= 0 ; i<revarr.length; i++){
            System.out.println("N["+i+"] = "+revarr[i]);
        }
    }
}

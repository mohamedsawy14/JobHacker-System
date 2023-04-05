import java.util.Scanner;

public class ArrayFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        int t= sc.nextInt();
        int x=0, count=1;

        for (int i =0 ; i<arr.length; i++){

            arr[i]= x;
            x++;
            if (count==t){
                count=0;
                x=0;
            }
            count++;
            //System.out.println("N["+i+"] = "+x--);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("N["+i+"] = "+arr[i]);
        }
    }
}

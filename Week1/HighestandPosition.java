import java.util.Scanner;

public class HighestandPosition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n , pos=0;
        int max= sc.nextInt();
        for (int i =0 ; i<9; i++){
            n= sc.nextInt();
            if (n>max){
                max=n;
                pos=i+2;
            }

        }
        System.out.println(max);
        System.out.println(pos);
    }
}

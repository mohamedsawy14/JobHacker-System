import java.util.Scanner;

public class EvenOddPositiveandNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int x , evn=0 , odd=0,pos=0, neg=0;

      for (int i=0; i<5; i++){
          x= sc.nextInt();

          if (x%2==0){
              evn++;
          }else {odd++;}

          if (x>0){
              pos++;
          } else if (x<0) {
              neg++;
          }

      }
        System.out.println(evn+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(pos+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativo(s)");


    }
}

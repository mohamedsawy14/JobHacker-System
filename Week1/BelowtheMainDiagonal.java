import java.util.Scanner;

public class BelowtheMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] x = new float[12][12];
        float total = 0;

        char c = sc.next().charAt(0);

        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                x[i][j] = sc.nextFloat();
            }
        }

        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < i; j++)
            {
                total += x[i][j];
            }
        }

        if (c == 'S')
        {
            System.out.printf("%.1f\n",total);
        }
        else if (c == 'M')
        {
            System.out.printf("%.1f\n",total/66.0f);
        }

    }
}

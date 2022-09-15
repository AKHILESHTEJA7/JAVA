import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();

        System.out.println( "Factors of " + num + " are " );

        // finding and printing factors b/w 1 to num
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i + " ");
        }

    }
}

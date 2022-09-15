import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("Factors of " + num + " are ");
        int sum = 0;
        // finding and printing factors b/w 1 to num
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
                sum = sum + i;
            }
        }
            if (sum == num)
                System.out.println(num +"  num is perfect number");
            else
                System.out.println(num +"  is not a perfect number.");


        }

    }



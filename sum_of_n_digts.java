import java.util.Scanner;
public class sum_of_n_digts {
    public static void main(String[] args){
        int sum;
        System.out.println("ENTER N VALUE= ");
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        System.out.println("enter "+N+" digit numbers is ");
        int value=in.nextInt();
        for (sum=0;value!=0;value=value/10){
            sum=sum+value%10;}
        System.out.println("sum of n digit number is "+sum);
        }
    }

import java.util.Scanner;
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a starting value=");
        int start =in.nextInt();
        System.out.print("enter a ending value=");
        int end =in.nextInt();
        int count = 0;
        int i = 1;

        System.out.format("Composite Numbers between %d and %d:\n", start, end);
        for(start=start; start<=end; start++)
        {
            for(i=1; i<=start; i++)
            {
                if(start % i == 0)
                    count++;
            }
            if(count > 2)
                System.out.format("%d ", start);
            count = 0;
        }
    }
}
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number below");
        int number =in.nextInt(), reverse = 0;
//we have not mentioned the initialization part of the for loop
        for( ;number != 0; number=number/10) {
                    int remainder = number % 10;
                    reverse = reverse * 10 + remainder;}
                System.out.println("The reverse of the given number is: " + reverse);
            }
        }
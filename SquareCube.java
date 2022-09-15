import java.util.Scanner;
public class SquareCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A DECIMAL= ");
        float n= in.nextFloat();
        System.out.println("SQUARE IS "+(n*n));
        System.out.println("CUBE IS  "+(n*n*n));
    }
}

import java.util.Scanner;
public class findvowels {
    public static void main(String [] args){
        int count=0;
        System.out.println("enter a sentance:");
        Scanner in=new Scanner(System.in);
        String sentance=in.nextLine();

        for (int i=0;i<sentance.length();i++){
            char ch=sentance.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;

            }
        }
        System.out.println("number of vowels in the given sentance is"+count);
    }
}

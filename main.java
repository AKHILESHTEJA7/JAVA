import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfLines = in.nextInt();
        Main obj = new Main();
        obj.patternPrint((numOfLines+numOfLines-1)-1);
        System.out.print("1");
        obj.patternPrint((numOfLines+numOfLines-1)-1);
        System.out.println();
        obj.patternPrint((numOfLines+numOfLines-1)-3);
        System.out.print("1 1");
        obj.patternPrint((numOfLines+numOfLines-1)-3);
        System.out.println();

        int[] array = new int[numOfLines];
        array[0]=1;
        array[1]=1;
        for (int i=3;i<=numOfLines;i++){
            int[] tempArray = new int[i];
            int i1 = (numOfLines + numOfLines - 1) - (i + i - 1);
            obj.patternPrint(i1);
            System.out.print("1 ");
            tempArray[0]=1;
            for (int j=0;j<i-2;j++){
                int sum = array[j]+array[j+1];
                tempArray[j+1]=sum;
                System.out.print(sum+" ");
            }
            System.out.print("1");
            obj.patternPrint(i1);
            System.out.println();
            tempArray[i-1]=1;

            for (int k=0;k<tempArray.length;k++){
                array[k]=tempArray[k];
            }
        }
    }

    public void patternPrint(int x) {
        int spaceToBePrinted = x/2;
        for (int i=0;i<spaceToBePrinted;i++){
            System.out.print(" ");
        }
    }
}
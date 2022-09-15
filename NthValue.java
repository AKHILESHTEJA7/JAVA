public class NthValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();}
        int Nth=in.nextInt();
        System.out.println(array[Nth-1]);
    }
}

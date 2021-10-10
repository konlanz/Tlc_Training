public class arrayOne {
    public static void main(String[] args) {
        int[] first = new int[10];
        for (int i = 0; i < first.length; i++){
            first[i] = i+1;
        }
        System.out.println(first[9]);
    }

}

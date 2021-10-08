public class Multiply {
    public static void main(String[] args) {
        System.out.println("Hello this world!");
        multiplicationTable();
    }

    public static void multiplicationTable(){
        int count = 1;
        while(count <= 10){
            System.out.println("===========");
            for(int i = 1; i <=12; i++){
                int mul = count*i;
                System.out.println(count + " * "+ i + " = " + mul);
            }
            count++;

        }
    }
}

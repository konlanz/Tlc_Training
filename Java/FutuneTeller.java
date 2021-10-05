import java.util.Scanner;

public class FutuneTeller {
    public static void main(String[] args) {
        System.out.println("welcome to the funtune tell program\n");
        System.out.println("Please pick a number between 1 and 10");
        int Number;
        Scanner input  = new Scanner(System.in);
        Number = input.nextInt();
        input.close();
        if (Number<5){
            System.out.println("Enjoy you hava good luck today");
        }else{
            System.out.println("This is your lucky day, you have won a shoe");
        }
    }
}

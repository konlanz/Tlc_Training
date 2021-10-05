import java.util.Scanner;

public class DevTeaTime {
    public static void annouceDevTeaTime(){
        System.out.println("waiting for dev tea time\n");
        System.out.println("Please enter dev tea time in min\n");
        Scanner input = new Scanner(System.in);
        double timeEntered;
        timeEntered = input.nextDouble();
        input.close();
        System.out.println(timeEntered);



    }
    public static void main(String[] args) {
        annouceDevTeaTime();
    }
}

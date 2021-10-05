import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        double StudentGPA;
        String StudentName;
        int StudentAge;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your Name?");
        StudentName = input.nextLine();
        System.out.println("Please input your age?");
        StudentAge = input.nextInt();
        System.out.println("Please input your GPA?");
        StudentGPA = input.nextDouble();
        input.close();
        System.out.println("Your Name is "+ StudentName+ " and your age is "+ StudentAge +" And your gpa is  "+ StudentGPA);

    }
}

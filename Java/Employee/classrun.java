package Employee;
public class classrun {
    public static void main(String[] args) {
        System.out.println("this is a Java class of emplyee");
        Emoployee employee = new Emoployee("Konlan Mikpekoah","Ghana", 289458.26, 25 );
        double increasedSalary = employee.raiseSalary(10000);
        System.out.println(employee.name + " salary has been raised by this" + " " + increasedSalary);

    }    
}

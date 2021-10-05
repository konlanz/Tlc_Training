package Employee;

public class Emoployee {
    public String name;
    public String Location;
    public double Salary;
    public int age;
    public Emoployee(String name, String Location, double Salary, int age){
        this.Salary = Salary;
        this.Location = Location;
        this.name = name;
        this.age = age;
    }

   public double raiseSalary(double raisedAmount){
        this.Salary += raisedAmount;
        return this.Salary;
    }
    
}



public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent){
        if(percent>0){
            double raiseAmount = salary*(percent/100);
            salary+=raiseAmount;
            System.out.println(name+"Salary raised by " + percent + " % , New Salary :"+ salary);
        }else{
            System.out.println("Invalid Percentage! Salary remains unchanged");
        }
    }
    public String toString(){
        return "Employee ID : "+id+" , Name : "+name+" , Salary : "+salary;
    }
    public static void main(String[] args) {
        Employee employee = new Employee(1, "XYZ", 80000);
        System.out.println("Initial Employee Details : ");
        System.out.println(employee);
        employee.raiseSalary(5);
        System.out.println("\nEmployee details of salary Raise : ");
        System.out.println(employee);
    }
}

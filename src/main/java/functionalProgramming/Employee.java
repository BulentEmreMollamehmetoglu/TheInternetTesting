package functionalProgramming;

public class Employee {
    private String ename;
    private int salary;
    public Employee(String name,int salary){
        this.ename = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

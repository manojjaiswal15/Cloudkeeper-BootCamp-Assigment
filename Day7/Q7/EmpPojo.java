
class Employee{
    private int id;
    private String name;
    private double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public double calculateSalary(){
        return salary;
    }
    public void Show(){
        System.out.println("ID: "+id+" EmpName: "+name+" Salary: "+salary);
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + " name= " + name + " salary=" + calculateSalary() + "}";
    }
}

class FullTimeEmployee extends Employee{
    int bonus=0;
    public FullTimeEmployee(int id,String name,double salary,int bonus){
        super(id,name,salary);
        this.bonus=bonus;
    }
    @Override
    public double calculateSalary(){
        return getSalary()+bonus;
    }
}

class PartTimeEmployee extends  Employee{
    private int hrswork;
    private int hrssal;
    public PartTimeEmployee(int id,String name,int hrswork,int hrssal){
        super(id,name,0.0);
        this.hrswork=hrswork;
        this.hrssal=hrssal;
    }
    @Override
    public double calculateSalary(){
        return hrswork*hrssal;
    }
}
public class EmpSystem {
    public static void main(String[] args) {
        FullTimeEmployee f1=new FullTimeEmployee(1,"manoj",20000,10000);
        PartTimeEmployee p1=new PartTimeEmployee(2,"manojpart",8,2000);
        System.out.println("Full Emp:- "+f1.calculateSalary());
        System.out.println("Part Emp:- "+ p1.calculateSalary());
        f1.Show();
        p1.Show();
    }
}

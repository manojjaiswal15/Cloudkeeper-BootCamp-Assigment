
class Customer{
    private int id;
    private String name;
    private String email;
    public Customer(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + name + ", Email=" + email + "]";
    }
}

public class pojo {
    public static void main(String[] args) {
        Customer c1=new Customer(12,"manoj","abc@gmail.com");
        Customer c2=new Customer(123,"hello","ac@gmail.com");
        Customer c3=new Customer(14,"Anil","abcd@gmail.com");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}

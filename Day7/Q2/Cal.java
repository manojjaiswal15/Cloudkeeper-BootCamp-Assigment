class Calculator{
    public int add(int a,int c){
        return a+c;
    }
    public int sub(int a,int c){
        return a-c;
    }
    public int mul(int a,int c){
        return a*c;
    }
    public int div(int a,int c){
        return a/c;
    }
}

public class Main(){
    public static void main(String args[]){
        Calculator obj=new Calculator();
       int a=5; int b=5;
       System.out.println("Add"+obj.add(a,b));
       System.out.println("Sub"+obj.sub(a,b));
       System.out.println("Mul"+obj.mul(a,b));
       System.out.println("Div"+obj.div(a,b));
    }
}

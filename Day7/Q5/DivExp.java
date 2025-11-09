import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        int a,b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number");
        a=sc.nextInt();
        System.out.print("Enter 2st Number");
        b=sc.nextInt();
        try{
            c=a/b;
        }catch(Exception e){
            System.out.println("Divided by Zero Error");
        }finally {
            System.out.println("Division completed");
        }
    }
}

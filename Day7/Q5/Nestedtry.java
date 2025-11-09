import java.util.*;
public class Nestedtry {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number");
        a=sc.nextInt();
        System.out.print("Enter 2st Number");
        b=sc.nextInt();
        try{
           try{
              int c=a/b;
              System.out.println("c ="+c);
           }catch(ArithmeticException e){
               System.out.println(e.getMessage());
           }
            int arr[]={3,10,5};
            int val=arr[10];
            System.out.println("Array val "+val);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}

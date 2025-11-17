import java.util.*;
public class Q1 {
    void sumDigit(){
        int num;
        int res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number");
        num=sc.nextInt();
        while(num>0){
            res+=num%10;
            num/=10;
        }
        System.out.print("Total is: "+res);
    }

    void mulNum(){
        int num;
        System.out.print("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" x"+" "+i+" = "+num*i);
        }
    }

    void fact(){
        int num;
        int res=1;
        System.out.print("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            res*=i;
        }
        System.out.println("Factorial is :- "+res);
    }

    void rev(){
        int num;
        int res=0;
        System.out.print("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num>0){
            res=res*10+(num%10);
            num/=10;
        }
        System.out.print("res num is:- "+res);
    }

    public static void main(String[] args){
        Q1 obj=new Q1();
        obj.sumDigit();
        obj.mulNum();
        obj.fact();
        obj.rev();
    }
}



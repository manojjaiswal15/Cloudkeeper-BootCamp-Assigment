import java.math.*;

class Counter{
    static int count=0;
    Counter() {
        count += 1;
    }
    void show(){
        System.out.println("total obj is created = "+count);
    }
}

class MathUtils{
   static void maxi(int a,int b){
       int res=Math.max(a,b);
       System.out.println("Maximum= "+res);
   }
    static void mini(int a,int b){
        int res=Math.min(a,b);
        System.out.println("Minimum= "+res);
    }
    static void avg(int a,int b){
        double res=(a+b)/2.0;
        System.out.println("Maximum= "+res);
    }
}


public class Q3 {
public static  void main(String args[]){
    MathUtils.maxi(2,10);
    MathUtils.mini(2,10);
    MathUtils.avg(2,10);
}
}

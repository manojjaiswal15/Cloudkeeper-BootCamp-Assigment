
class Counter{
    static int count=0;
    Counter() {
        count += 1;
    }
    void show(){
        System.out.println("total obj is created = "+count);
    }
}

public class Count {
public static  void main(String args[]){
    Counter obj=new Counter();
    Counter obj1=new Counter();
    obj1.show();
}
}

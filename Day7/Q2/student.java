class Student{
    int total=0;
    double avg=0;
    String name;
    public void TotalMark(String name,int sub1,int sub2,int sub3){
        this.name=name;
        total= sub1+sub2+sub3;
        Avg();
    }
    public void Avg(){
        avg= total/3;
        show();
    }
    void show(){
        System.out.println(name+" Total Mark "+total+" and Average is "+avg);
    }

}


public class Q2 {
    public static void main(String []args){
       Student stu=new Student();
       stu.TotalMark("Manoj",77,88,77);
    }
}

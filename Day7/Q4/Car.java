
class Car{
  Car(String name,int model,int price){
      System.out.println("name: "+name+" model: "+model+" price: "+price);
  }
  Car(String name,int model,double price){
      System.out.println("name: "+name+" model: "+model+" price: "+price);
  }
}

public class Main {
    public static void main(String args[]){
        Car c1=new Car("Auto",2004,50000);
        Car c2=new Car("BMW",2007,3000000);
    }
}

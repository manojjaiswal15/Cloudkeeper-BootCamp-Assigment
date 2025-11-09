
class InvalidPrice extends  Exception{
   InvalidPrice(String msg){
       super(msg);
   }
}

class Product{
    private int id;
    private String name;
    private int price;
    Product(int id,String name,int productprice) throws InvalidPrice{
        this.id=id;
        this.name=name;
       if(productprice<0){
           throw  new InvalidPrice("Negative price is not possible for product");
       }else{
           this.price=productprice;
       }
    }
     void display(){
        System.out.println("id :- "+id+" Product Name: "+name+" price: "+price);
    }
}
public class ProductInfo{
    public static void main(String[] args) {
    try {
        Product p1=new Product(1,"Toy",5000);
        Product p2=new Product(2,"Shoe",3000);
        Product p3=new Product(3,"Shirt",-800);
        p1.display();
        p2.display();
        p3.display();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}


class Book{
    String title;
    String author;
    int price;
    Book(){}
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void Show(){
        System.out.println(title+" "+author+" "+price);
    }
}
public class Book {
    public static void main(String args[]){
        Book obj=new Book("Java","Manish",600);
        obj.Show();
    }
}

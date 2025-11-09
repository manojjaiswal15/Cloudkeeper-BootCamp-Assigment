
class MethodChainJava {
    void m3(){
        int result=10/0;
        System.out.println("Result: " + result);
    }
    void m2(){
        m3();
    }
    void m1(){
        try{
           m2(); 
        }catch(Exception e){
            System.out.println("Divded By Zero");
        }
    }
    public static void main(String[] args) {
        MethodChainJava obj =new MethodChainJava();
       obj.m1();
    }
}

class InvalidEmailException extends Exception{
    InvalidEmailException(String s){
        super(s);
    }
}

class CheckMail{
    CheckMail(String s) throws InvalidEmailException{
        boolean valid=false;
       for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='@'){
                valid=true;
                break;
            }
        }
        if(valid){
            System.out.println("Valid Mail");
        }else{
            throw new InvalidEmailException("InValid Email");
        }
    }
}
class Main {
    public static void main(String[] args) {
      try{
          CheckMail obj=new CheckMail("abc.com");
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
    }
}
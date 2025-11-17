import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface NumberRule{
    boolean apply(int n);
}

public class Stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3, 10, 15, 8, 21, 14, 7);
        NumberRule isEven=n->n%2==0;
        NumberRule isPrime=n-> {
             if(n<=1){
                 return false;
             }else{
                 for(int i=2;i<n;i++){
                     if(n%i==0){
                         return false;
                     }
                 }
             }
             return true;
        };

        List<Integer> list=nums.stream().filter(n->isEven.apply(n) && isPrime.apply(n)).map(n->n*n).collect(Collectors.toList());
        System.out.println(list);
        Optional<Integer> firstValue=list.stream().findFirst();
        if(firstValue.isPresent()){
            System.out.println(firstValue.get());
        }else{
            System.out.println("No matching number found");
        }
    }
}

 import java.util.*;
public class optPrime {
    public static boolean isPrime(int n ){
        n = (int) n;
        int limit =  (int) Math.sqrt(n);
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i<=limit;i+=6){//every prime number is of the from of 6K+-1}
        if(n%i==0 || n%(i+2)==0) return false;
        //bleh
        }
        // just some renadome changes}
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");    

        
    }
    
}
}

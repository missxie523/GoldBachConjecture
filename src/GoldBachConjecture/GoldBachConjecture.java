package GoldBachConjecture;

/* Every even integer greater than 2 can be expressed as the sum of two primes.
* Write a program to check whether this is true, starting from 4.
*/

public class GoldBachConjecture {
    public static void check(){
        for(int i = 4; i < 1000000000; i += 2){
            if(isCounterExample(i)){
                System.out.println("Congratulations! You won the field prize!");
                break;
            }else{
                System.out.println(i + " is ok.");
            }
        }
    }
    private static boolean isPrime(int n){
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    private static boolean isCounterExample(int n){
        for(int i = 2; i <= n/2; i++){
            if(isPrime(i) && isPrime(n - i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        check();
    }
}

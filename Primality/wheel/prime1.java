/*
 * Prime numbers :- 
 * 1......firstPrimeFactoe....sqrt(N)....PAIRS.....N/fpf..No Factor zone..(N-1)..N
 * Theorem 1 :
 * Every Composite number X has atleast One prime number factor less than or equal to sqrt(X)
 * Theorem 2 :
 * Every prime number (X>3) is of the form "(6*n+1)" or "(6*n-1)".
 */
public class prime1 {
    public static void main(String[] args) {
        long num;
        num=10000000019l;
        long start_milli=System.currentTimeMillis();
        long start_nano=System.nanoTime();
        long end_milli;
        long end_nano;
        int rem = (int) (num % 30);
        // switch(rem)
        // {
        //     case 7:
        //     case 13:
        //     case 17:
        //     case 19:
        //     case 23:
        //     case 29:  System.out.println("Yes"); break;
        //     default : System.out.println("Yes");
        // }
        if(num ==2 || num ==3 || num ==5  || rem == 7 || rem == 11 || rem == 13 || rem == 17 || rem == 19 || rem == 23 || rem == 29)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("Yes");
        }
        end_milli=System.currentTimeMillis();
        end_nano=System.nanoTime();
        System.out.println("Time : "+(end_milli-start_milli)/1000.0);
        System.out.println((end_nano-start_nano));
    }
    
}

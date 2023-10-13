//ArrayList.get(i) takes O(1)


import java.util.*;

public class optimizedWheel_V2{
    private static ArrayList<Integer> myPrimeNumber = new ArrayList<>(); 
    // Main List of validated Prime Numbers
    private static HashSet<Integer> myExceptionalcases = new HashSet<>(); 
    // it contains all the expectional number to avoid while operating betweenmilestone
    private static int expectionalIndex ;
    private static ArrayList<Integer> myTroubleList = new ArrayList<>(); 
    private static ArrayList<Integer> troubleRes = new ArrayList<>(); 

    public static boolean isPrime(int num)
    {
        int limit = (int) Math.sqrt(num); 
        // check divisibility by all prime number
        int index=1; // as our myPrimeNumber contains 1 at the starting
        int currentPrime = myPrimeNumber.get(index);
        while( currentPrime <= limit)
        {   
            if(num%currentPrime==0) return false;
            currentPrime = myPrimeNumber.get(++index);
        }
        return true;
    }
    public static void main(String[] args) {

        HashSet<Integer> cntmap = new HashSet<>();
        long start_milli=System.currentTimeMillis();
        long start_nano=System.nanoTime();
        long end_milli;
        long end_nano;
        // all variable declarations;
        int current_mileStone;
        int nextMileStone ;
        int mileStoneMultiple;
        int range;
        int current_prime_index;
        int limiting_index;
        int suspected_prime;
        int check;
        boolean breakingFlag;

        myPrimeNumber.add(1);
        myPrimeNumber.add(2);
        myPrimeNumber.add(3);
        myPrimeNumber.add(5);

        myExceptionalcases.add(2);
        myExceptionalcases.add(3);
        
        current_mileStone = 6;
        breakingFlag = false;
        nextMileStone = 30;
        range = 10000;
        expectionalIndex = 3;
        mileStoneMultiple = 6;
        
        while(current_mileStone < range)
        {
            
            limiting_index = myPrimeNumber.size();
            while(mileStoneMultiple < nextMileStone) 
            {
                current_prime_index =0;
                while(current_prime_index < limiting_index)
                {
                    check =  myPrimeNumber.get(current_prime_index);
                    if(!myExceptionalcases.contains(check))
                    {
                        suspected_prime = mileStoneMultiple + check;
                        if(suspected_prime > range)
                        {   
                            breakingFlag = true;
                            break;
                        }
                        if(isPrime(suspected_prime))
                        {
                            myPrimeNumber.add(suspected_prime);
                        }
                        else if(suspected_prime % myPrimeNumber.get(expectionalIndex+1)==0)
                        {
                            myTroubleList.add(suspected_prime);
                        }
                    }
                    current_prime_index++;
                }
                for(int t : myTroubleList)
                {
                    suspected_prime = mileStoneMultiple + t;

                    if(suspected_prime > range)
                    {
                        continue;
                    }
                    else if(isPrime( suspected_prime)) troubleRes.add(suspected_prime);
                }
                if(breakingFlag)
                {
                    break;
                } 
                mileStoneMultiple+=current_mileStone;
            }
            if(breakingFlag) break;
            current_mileStone = nextMileStone;
            nextMileStone =  current_mileStone * myPrimeNumber.get(expectionalIndex+1);
            myExceptionalcases.add(myPrimeNumber.get(expectionalIndex));
            ++expectionalIndex;
        }
        // int count =-1;
        for(int a:myPrimeNumber)
        {
                cntmap.add(a);
                System.out.println(a);
            }
        for(int a:troubleRes)
        {
                cntmap.add(a);
                System.out.println(a);
        }

        System.out.println("My Final : "+cntmap.size());


        end_milli=System.currentTimeMillis();
        end_nano=System.nanoTime();
        System.out.println("Time : "+(end_milli-start_milli)/1000.0);
        System.out.println((end_nano-start_nano));

    }
}

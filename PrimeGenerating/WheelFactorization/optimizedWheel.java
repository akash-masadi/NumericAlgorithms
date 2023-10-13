//ArrayList.get(i) takes O(1)


import java.util.*;

public class optimizedWheel {
    private static ArrayList<Integer> myPrimeNumber = new ArrayList<>(); 
    // Main List of validated Prime Numbers
    private static HashSet<Integer> myExceptionalcases = new HashSet<>(); 
    // it contains all the expectional number to avoid while operating betweenmilestone
    private static int expectionalIndex ;
    private static ArrayList<Integer> myTroubleList = new ArrayList<>(); 
    private static ArrayList<Integer> troubleRes = new ArrayList<>(); 

    public static boolean isTrouble(int num)
    {
        if(num % myPrimeNumber.get(expectionalIndex+1)==0)
        {
            if(myPrimeNumber.get(expectionalIndex+1)>11)System.out.println("checking with "+ myPrimeNumber.get(expectionalIndex+1) +"\ttrouble :"+num);
            return true;
        } 
        
        return false;
    }
    public static boolean isPrime(int num)
    {
        // System.out.println("I'm Validating :"+num);
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

        HashMap<Integer,Integer> cntmap = new HashMap<>();
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
        
        // for(int i =0;i<4;i++)
        //     System.out.println(myPrimeNumber.get(i));
        // System.out.println(isPrime(11));
        
        current_mileStone = 6;
        breakingFlag = false;
        nextMileStone = 30;
        range = 1000;
        expectionalIndex = 3;
        mileStoneMultiple = 6;
        
        while(current_mileStone < range)
        {
            
            limiting_index = myPrimeNumber.size();
            while(mileStoneMultiple < nextMileStone) 
            {
                current_prime_index =0;
                System.out.println("My Limiting Index :"+limiting_index);
                while(current_prime_index < limiting_index)
                {
                    check =  myPrimeNumber.get(current_prime_index);
                    // System.out.println("check: "+check+" \tIsExcepv: "+myExceptionalcases.contains(check));
                    if(!myExceptionalcases.contains(check))
                    {
                        suspected_prime = mileStoneMultiple + check;
                        if(suspected_prime > range)
                        {
                            System.out.println("\n1.I'm Breaking here "+suspected_prime+"at what point :"+mileStoneMultiple+" check :"+check);
                            
                            breakingFlag = true;
                            break;
                        }
                        if(isPrime(suspected_prime))
                        {
                            myPrimeNumber.add(suspected_prime);
                        }
                        else if(isTrouble(suspected_prime))
                        {
                            // System.out.println("\nSuspected: "+suspected_prime);
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
                        // System.out.println("\n2..I'm Breaking here "+suspected_prime+" t "+t);
                        continue;
                    }
                    else if(isPrime( suspected_prime)) troubleRes.add(suspected_prime);
                }
                if(breakingFlag)
                {
                    // System.out.println("\nMilestone Mul "+mileStoneMultiple);
                    break;
                } 
                mileStoneMultiple+=current_mileStone;
            }
            if(breakingFlag) break;
            // System.out.println(" excepee Prime "+myPrimeNumber.get(expectionalIndex));
            current_mileStone = nextMileStone;
            nextMileStone =  current_mileStone * myPrimeNumber.get(expectionalIndex+1);
            for(int a:myTroubleList ) {
                System.out.println(a);
            }
            myTroubleList = new ArrayList<>();
            myExceptionalcases.add(myPrimeNumber.get(expectionalIndex));
            // System.out.println(nextMileStone+" cur "+current_mileStone+" next "+nextMileStone +" exce"+expectionalIndex);
            ++expectionalIndex;
        }
        int count =-1;
        for(int a:myPrimeNumber)
        {
            if(cntmap.containsKey(a)) 
            {
                int temp = cntmap.get(a);
                cntmap.put(a,++temp);

            }
            else{
                cntmap.put(a,1);
            }
            // System.out.println(a);
            count++;
        }

        System.out.println("Counting numn :" +count  +"\n My Trouble List : -"+troubleRes.size());
        
        for(int  a: cntmap.keySet())
        {
            System.out.println(" "+a+" -> "+cntmap.get(a));
        }
        System.out.println("Counting numn :" +cntmap.size());


        end_milli=System.currentTimeMillis();
        end_nano=System.nanoTime();
        System.out.println("Time : "+(end_milli-start_milli)/1000.0);
        System.out.println((end_nano-start_nano));

    }
}

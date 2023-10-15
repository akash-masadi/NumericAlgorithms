
public class wheel {
    
    public static boolean isPrime(int[] myPrimeNumber,int num)
    {
        int limit = (int) Math.sqrt(num); 
        // check divisibility by all prime number
        int index=0; // as our myPrimeNumber contains 1 at the starting
        while( myPrimeNumber[index] <= limit )
        {   
            if(num % myPrimeNumber[index] == 0 ) return false;
            index++;
        }
        // System.out.println((num)+" Val");
        return true;
    }
    public static void main(String[] args) {
        long start_milli=System.currentTimeMillis();
        long start_nano=System.nanoTime();
        long end_milli;
        long end_nano;
        int num;
        int range = 10000000;
        
        int count = 0 ;
        int[] myPrimeNumber = new int[range];
        myPrimeNumber[count++]=2;
        myPrimeNumber[count++]=3;
        myPrimeNumber[count++]=5;
        myPrimeNumber[count++]=7;
        myPrimeNumber[count++]=11;
        myPrimeNumber[count++]=13;
        myPrimeNumber[count++]=17;
        myPrimeNumber[count++]=19;
        myPrimeNumber[count++]=23;
        myPrimeNumber[count++]=29;
        myPrimeNumber[count++]=31;



        for(num = 30;  num <=range ;num+=30)
        {
            for(int i = 3; i < 11;i++)
            {
                // System.out.println(myPrimeNumber[i]+num);   
                if(myPrimeNumber[i]+num <= range && isPrime(myPrimeNumber, myPrimeNumber[i]+num) ) myPrimeNumber[count++]=(myPrimeNumber[i]+num);
            }
            // System.out.println((num+1)+"\n"+(num+7)+"\n"+(num+11)+"\n"+(num+13)+"\n"+(num+17)+"\n"+(num+19)+"\n"+(num+23)+"\n"+(num+29)+"\n" );
            // if( num+1<= range &&isPrime(num+1)){ myPrimeNumber.add(num+1);count++;}
            // if(num+7<= range && isPrime(num+7)) { myPrimeNumber.add(num+7);count++;}
            // if( num+11<= range &&isPrime(num+11)) { myPrimeNumber.add(num+11);count++;}
            // if(num+13<= range &&isPrime(num+13)) { myPrimeNumber.add(num+13);count++;}
            // if(num+17<= range &&isPrime(num +17)) { myPrimeNumber.add(num+17);count++;}
            // if(num+19<= range &&isPrime(num+19)) { myPrimeNumber.add(num+19);count++;}
            // if(num+23<= range && isPrime(num+23)) { myPrimeNumber.add(num+23);count++;}
            // if(num+29<= range && isPrime(num+29)) { myPrimeNumber.add(num+29);count++;}
            // if((num+29)<range)
            // {
            //     System.out.println((num+7)+"\n"+(num+11)+"\n"+(num+13)+"\n"+(num+17)+"\n"+(num+19)+"\n"+(num+23)+"\n"+(num+29)+"\n" );
            //     count+=7;
            // }
            // else if((num+23)<=range)
            // {
            //     System.out.println((num+7)+"\n"+(num+11)+"\n"+(num+13)+"\n"+(num+17)+"\n"+(num+19)+"\n"+(num+23)+"\n" );
            //     count+=6;
            // }
            // else if((num+19)<=range)
            // {
            //     System.out.println((num+7)+"\n"+(num+11)+"\n"+(num+13)+"\n"+(num+17)+"\n"+(num+19)+"\n");
            //     count+=5;
            // }
            // else if((num+17)<=range)
            // {
            //     System.out.println((num+7)+"\n"+(num+11)+"\n"+(num+13)+"\n"+(num+17)+"\n");
            //     count+=4;
            // }
            // else if((num+13)<=range)
            // {
            //     System.out.println((num+7)+"\n"+(num+11)+"\n"+(num+13)+"\n");
            //     count+=3;
            // }
            // else if((num+11)<=range)
            // {
                // System.out.println((num+7)+"\n"+(num+11)+"\n");
            //     count+=2;
            // }
            // else if((num+7)<=range)
            // {
                //     count+=1;
                // }
            }
            // count = 3 + (range/30) * 7;
            // System.out.println("\n");
        // for(int a : myPrimeNumber)
        // {
        //     System.out.println(a+"\t");

        // }
        System.out.println(count+"\n");
        // int k = range % 30;
        // if(k>=7 && k<11) count+=1;
        // else if (k<13) count+=2;
        // else if (k<17) count+=3;
        // else if (k<19) count+=4;
        // else if (k<23) count+=5;
        // else if (k<29) count+=6;
        // else if(k==29) count +=7;
        // System.out.println("Count :"+count);
        end_milli=System.currentTimeMillis();
        end_nano=System.nanoTime();
        System.out.println("Time : "+(end_milli-start_milli)/1000.0);
        System.out.println((end_nano-start_nano));
    }
    
}

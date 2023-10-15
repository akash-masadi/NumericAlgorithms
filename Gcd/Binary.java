package Gcd;
public class Binary 
{
    public static int binaryGCD(int a, int b) 
    {
        int count=0;
        if (b == 0) 
            return a;
        if (a == 0)
            return b;
        while((a & 1) == 0 && (b & 1)==0)
        {
            a>>=1;
            b>>=1;
            count+=1;
        }
        while( (a & 1)== 0)
            a>>=1;
        while((b & 1) == 0)
            b>>=1;
        while(b!=0)
        {
            if(a>b)
            {
                int temp=a;
                a=b;
                b=temp;
            }
            b-=a;
        }
         return a<<count;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        long start=System.currentTimeMillis();
        int gcd = binaryGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        long end=System.currentTimeMillis();
        System.out.println((end-start)/1000.0);
    }
}

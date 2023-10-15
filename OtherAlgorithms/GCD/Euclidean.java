package OtherAlgorithms.GCD;

public class Euclidean {
    public static int RecGCD(int a, int b)
    {
        if( b==0 ) return a;
        return RecGCD(b,a%b);
    }
    public static int GCD(int a, int b)
    {
        int t;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public static void main(String[] args) {
        long start_nano;
        long end_nano;


        start_nano=System.nanoTime();
        System.out.println(RecGCD(108,21));
        end_nano=System.nanoTime();
        System.out.println((end_nano-start_nano));



        start_nano=System.nanoTime();
        System.out.println(GCD(108,21));
        end_nano=System.nanoTime();
        System.out.println((end_nano-start_nano));
    }
}

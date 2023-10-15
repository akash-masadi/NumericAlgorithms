//an implementation of the square root calculation using the Babylonian method, also known as Heron's method
import java.lang.Math;
public class IntegerSqrt
{
	public static void main(String[] args) {
    long start_milli;
    long start_nano;
    long end_milli;
    long end_nano;

    System.out.println("\n Math.sqrt() :");
    start_milli=System.currentTimeMillis();
    start_nano=System.nanoTime();
    //Math.sqrt()
    // System.out.println((int)Math.sqrt(000000));
    System.out.println(Math.sqrt(1000000));


    end_milli=System.currentTimeMillis();
    end_nano=System.nanoTime();
    System.out.println("Time : "+(end_milli-start_milli)/1000.0);
    System.out.println((end_nano-start_nano));
    
    
    // my Integer sqrt()
    System.out.println("\n Integer sqrt Method :");
    start_milli=System.currentTimeMillis();
    start_nano=System.nanoTime();

    System.out.println(sqrt(1000000));

    end_milli=System.currentTimeMillis();
    end_nano=System.nanoTime();
    System.out.println("Time : "+(end_milli-start_milli)/1000.0);
    System.out.println((end_nano-start_nano));

    
    }

	public static int sqrt(int num) 
    {
        if (num <2) {
            return (num==0?0:1);
        } else {
            double n1 = num / 2.0;
            double n2 = (n1 + num / n1) / 2;
            while (n2 < n1) {
                n1 = n2;
                n2 = (n1 + num / n1) / 2;
            }
            return (int)n2;
        }
    }

    
    
}
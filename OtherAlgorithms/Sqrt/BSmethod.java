//Binary Search Method
import java.lang.Math;
public class BSmethod {
    public static double sqrt(double y)
    {
        double L = 0;
	    double M;
	    double R = y + 1;

        while ((int)(L -R + 1)!=0)
        {
            M = L + (R-L) / 2;

            if (M * M <= y)
                L = M;
            else
                R = M;
        }

        return L;
    }
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
        System.out.println(Math.sqrt(100000));
    
    
        end_milli=System.currentTimeMillis();
        end_nano=System.nanoTime();
        System.out.println("Time : "+(end_milli-start_milli)/1000.0);
        System.out.println((end_nano-start_nano));
        
        
        // my Integer sqrt()
        System.out.println("\n Integer sqrt Method :");
        start_milli=System.currentTimeMillis();
        start_nano=System.nanoTime();
    
        System.out.println(sqrt(100000));
    
        end_milli=System.currentTimeMillis();
        end_nano=System.nanoTime();
        System.out.println("Time : "+(end_milli-start_milli)/1000.0);
        System.out.println((end_nano-start_nano));
        }
}

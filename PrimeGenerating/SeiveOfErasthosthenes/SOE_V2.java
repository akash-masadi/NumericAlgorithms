import java.lang.Math;
import java.util.HashSet;
public class SOE_V2 {
   public static void main(String args[ ])
   {
    long start_milli=System.currentTimeMillis();
    long start_nano=System.nanoTime();
    long end_milli;
    long end_nano;

	int range=10000000;
	HashSet<Integer> array  = new HashSet<>();
	array.add(2);
	for(int i=3;i<=range;i+=2)
	{
		array.add(i);
	}
	int square_of_num=(int)Math.sqrt(range);
	for(int start=3;start<= square_of_num;start+=2)
	{
	   if(array.contains(start))
	   {
    	for(int condition = start * start ; condition < range ; condition +=start )
		    array.remove(condition);
	   }
    }
	// int count=0;
    // for(int i : array)
	// 		 count++;
	System.out.println(array.size());

    end_milli=System.currentTimeMillis();
    end_nano=System.nanoTime();
    System.out.println("Time : "+(end_milli-start_milli)/1000.0);
    System.out.println((end_nano-start_nano));
	}
}

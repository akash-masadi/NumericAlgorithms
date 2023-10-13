import java.lang.Math;
public class SOE {
   public static void main(String args[ ])
   {
    long start_milli=System.currentTimeMillis();
    long start_nano=System.nanoTime();
    long end_milli;
    long end_nano;

	int range=10000;
	boolean array[]=new boolean[range];
	int square_of_num=(int)Math.sqrt(range);
	for(int start=2;start<= square_of_num;start++)
	{
	   if(!array[start])
	   {
    for(int condition = start * start ; condition < range ; condition +=start )
		    array[condition]=true;
	   }
    }
	int count=0;
       	for(int index=2;index<array.length;index++)
         if(!array[index])
		 {
			 
			 count++;
		 }
	System.out.println(count);

    end_milli=System.currentTimeMillis();
    end_nano=System.nanoTime();
    System.out.println("Time : "+(end_milli-start_milli)/1000.0);
    System.out.println((end_nano-start_nano));
	}
}

public class sieveOfAtkins
{
    public static void main(String[] args) {
        int limit = 10000000;
        boolean[] list = new boolean[limit];
        int x;
        int y;
        int n;

        long start_milli=System.currentTimeMillis();
        long start_nano=System.nanoTime();
        long end_milli;
        long end_nano;

        for(x=1;(x*x)<=limit;x++)
        {
            for(y=1;(y*y)<=limit;y++)
            {
                int sqX = x*x;
                int sqY = y*y;
                n = 4 * sqX + sqY;
                if(n<=limit && (n%12==1 || n%12 == 5))
                {
                    list[n]^=true;
                }
                // n = 3 * sqX + sqY;
                n-=sqX;
                if(n<=limit && (n%12==7))
                {
                    list[n]^=true;
                }
                // n = 3 * sqX - sqY;
                n-=2*sqY;
                if(x>y && n<=limit && (n%12==11))
                {
                    list[n]^=true;
                }

            }
        }
        for(n=5;(n*n)<=limit;n++)
        {
            if(list[n])
            {
                for(int i = n*n;i<limit;i+=n*n)
                {
                    list[i]=false;
                }
            }
        }
        int count=2;
        for(n=5;n<limit;n+=2)
        {
            if(list[n]) count++;
        }
        System.out.println(count);

        end_milli=System.currentTimeMillis();
        end_nano=System.nanoTime();
        System.out.println("Time : "+(end_milli-start_milli)/1000.0);
        System.out.println((end_nano-start_nano));
    }
}
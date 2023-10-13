package Primality.SOS;
class sundaram {
    public static void main(String[] args) 
    {
        int num=10000000;
        int range=(num-1)/2;
        int count=1;
        long start=System.currentTimeMillis();
        boolean array[]=new boolean[range+1];
        for(int check1=1;check1<=range;check1++)
        {
            int check2=check1;
            long limit = check1+check2+2l*check1*check2;
            while(range>=limit)
            {
                
                array[(int)limit]=true;
                check2+=1;
                limit=check1+check2+2l*check1*check2;
            }
        }
        for(int index=1;index<range;index++)
        {
            if(array[index]==false)
            {
            //System.out.println(2*i+1);
            count+=1;
            }
        }
        System.out.println(count);
        long end=System.currentTimeMillis();
        System.out.println((end-start)/1000.0);
    }
}

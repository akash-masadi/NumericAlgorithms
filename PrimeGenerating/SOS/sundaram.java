class sundaram {
    public static void main(String[] args) 
    {
        int num=100;
        int range=(num-1)/2;
        int count=1;
        long start=System.currentTimeMillis();
        boolean array[]=new boolean[range+1];

        
        /* SEIVE */
        int maxVal = 0;
        int denominator = 0;
        for (int i = 1; i < range; i++)
        {
            denominator = (i << 1) + 1;
            maxVal = (range - i) / denominator;
            for (int j = i; j <= maxVal; j++)
            {
                array[i + j * denominator] = false;
            }
        }
        int prime= 0;
        for (int i = 1; i < range; i++)
        {
            if (array[i])
            {
                count++;
                prime = (i << 1) + 1; 
            }
}
        // for(int check1=1;check1<=range;check1++)
        // {
        //     int check2=check1;
        //     long limit = check1+check2+2l*check1*check2;
        //     while(range>=limit)
        //     {
        //         array[(int)limit]=true;
        //         check2+=1;
        //         limit=check1+check2+2l*check1*check2;
        //     }
        // }
        // for(int index=1;index<range;index++)
        // {
        //     if(array[index]==false)
        //     {
        //     count+=1;
        //     }
        // }
        System.out.println(count);
        long end=System.currentTimeMillis();
        System.out.println((end-start)/1000.0);
    }
}

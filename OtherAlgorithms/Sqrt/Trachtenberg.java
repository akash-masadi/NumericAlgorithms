public class Trachtenberg 
{
    public static void main(String[] args) 
    {
        int num1=1234;
        int num2=1234;
        int result=0;
        int factor=1;
        int carry=0;
        long start=System.nanoTime();
        while(num1>0)
        {
            int ones = num1%10;
            num1 = num1/10;
            int next=(ones*num2)+carry;
            int place=next%10;
            carry=next/10;
            result+=place*factor;
            factor*=10;
        }
        System.out.println(result+(carry*factor));
        long end=System.nanoTime();
        System.out.println(end-start);


        start=System.nanoTime();
        System.out.println(1234* 1234);
        end=System.nanoTime();
        System.out.println(end-start);
    }
}

#include <iostream>
#include <math.h>
using namespace std;
    
bool isPrime(short int myPrimeNumber[],int num)
{
        int limit = (int)sqrt(num); 
        // check divisibility by all prime number
        int index=0; // as our myPrimeNumber contains 1 at the starting
        while( myPrimeNumber[index] <= limit )
        {   
            if(num % myPrimeNumber[index] == 0 ) return false;
            index++;
        }
        return true;
}
int main() 
{
        int num;
        int range = 1000000;
        int count = 0 ;
        short int myPrimeNumber[range+1] ={0};
        myPrimeNumber[count++]=2;
        myPrimeNumber[count++]=3;
        myPrimeNumber[count++]=5;
        myPrimeNumber[count++]=7;
        myPrimeNumber[count++]=11;
        myPrimeNumber[count++]=13;
        myPrimeNumber[count++]=17;
        myPrimeNumber[count++]=19;
        myPrimeNumber[count++]=23;
        myPrimeNumber[count++]=29;
        myPrimeNumber[count++]=31;



        for(num = 30;  num <=range ;num+=30)
        {
            for(int i = 3; i < 11;i++)
			{
	            if(myPrimeNumber[i]+num <= range && isPrime(myPrimeNumber, myPrimeNumber[i]+num) ) myPrimeNumber[count++]=(myPrimeNumber[i]+num);
            }
        }
        cout<<count<<"\n";
        return 0;
    
}


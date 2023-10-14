#include <iostream>
using namespace std;

int main()
{        
        long long int limit = 1000000;
        bool list[limit]={0};
        long long int x;
        long long int y;
        long long int n;

        for(x=1;(x*x)<=limit;x++)
        {
            for(y=1;(y*y)<=limit;y++)
            {    
                long long int sqX = x*x;
                long long int sqY = y*y;
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
                for(long long int i = n*n;i<limit;i+=n*n)
                {
                    list[i]=false;
                }
            }
        } 
        long long int count=2;
        for(n=5;n<limit;n+=2)
        {           
            if(list[n]) count++;
        }
        cout << count << endl;
        return 0;
}

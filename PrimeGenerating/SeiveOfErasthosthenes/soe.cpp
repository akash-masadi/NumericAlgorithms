#include <iostream>
#include <math.h>
using namespace std;
int main() 
{
    int a=1000000;
    bool arr[a+1]={true};
    long long int b=sqrt(a);
    for(long long int i=2;i<=b;i++)
    {
        if(arr[i]==0)
        {
            for(long long int j=i*i;j<a;j+=i)
                arr[j]=1;
        }
    }
    int count=0;
    for(long long int i=2;i<a;i++)
        if(arr[i]==0)
            count+=1;
    cout<<count<<endl;
    return 0;
}


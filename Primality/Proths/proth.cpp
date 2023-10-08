#include <iostream>
using namespace std;
long powGen(long base,long pow)
{
    long multiplier = base;
    while(pow--)
    {
        base*= multiplier;
    }
    return base;
}
int main()
{
    long num = 13;
    long a = 1;
    long pow = (num-1)/2;
    while(true)
    {
        if((powGen(a,pow)+1)%num == -1)
        {
            cout<<a<<"Yes";
            return 0;
        }
        a++;
    }
    cout<<"No";
    return 0;

}

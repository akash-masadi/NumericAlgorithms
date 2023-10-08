#include <iostream>
using namespace std;
int main()
{
    long long num = 10000000019;
    int rem = num % 30;
    // switch(rem)
    if(num ==2 || num ==3 || num ==5  || rem == 7 || rem == 11 || rem == 13 || rem == 17 || rem == 19 || rem == 23 || rem == 29)
    {
        cout<<"Yes";
    }
    else 
    {
        cout << "NO";
    }
    // {
    //     case 7:
    //     case 13:
    //     case 17:
    //     case 19:
    //     case 23:
    //     case 29: cout << "Yes"; break;
    //     default : cout << "NO";
    // }
    return 0;

}

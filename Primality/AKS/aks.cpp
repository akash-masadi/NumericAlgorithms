#include<iostream>
#include<math.h>
bool isPerfect(int n);
int checkMulti (int N)
{
    float lbF = log(N);
    int lowerBound = ceil(lbF*lbF) ;
    for(int i = lowerBound;;i++)
    {
    int A = i;
    int multiplier = A;
    int k=1;
    int rem=A%N;
    while(rem!=1)
    {
        A*=multiplier;
        rem = A%N; 
        k+=1;
    }
    }
}
bool isPerfect(int n)
{
    int sqr = sqrt(n);
    for(int i=1;i<=sqr;i++)
    {
        if(i*i==n) return true;
    }
    return false;
}
int main()
{
    printf("%s",isPerfect(14)?"true":"false");
}

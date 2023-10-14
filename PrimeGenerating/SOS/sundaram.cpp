#include<iostream>
using namespace std;
int main()
{
	long long int num=1000000;
	long long int range=(num-1)/2;
	bool array[range+1]={false};
	long long int check2=0,check1=0,count=0;
	long long int index=0;
	for(check1=1;check1<=range;check1+=1)
	{
		check2 = check1;
		unsigned long long int limit=check1+check2+2*check1*check2;
//		cout<<"fgfgdf"<<limit;
		while(limit<=range)
		{
			array[limit]=true;
			check2+=1;
			limit=check1+check2+2l*check1*check2;
		}
	}
	for(index=0;index<range;index+=1)
	{
		if(array[index]==false)
			count+=1;
	}
	cout<<count;
	return 0;
}

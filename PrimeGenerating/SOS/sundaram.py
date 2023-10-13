num=10000000
range1=(num-1)//2
list=[True]*(range1+1)
for check1 in range(1,range1+1):
    check2=check1
    while (check1+check2+2*check1*check2)<=range1:
        list[check1+check2+2*check1*check2]=False
        check2+=1
count=1
for i in range(1,range1+1):
    if list[i]==True:
        count+=1
print(count)
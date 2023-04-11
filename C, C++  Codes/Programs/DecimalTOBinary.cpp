#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int input;
    cin>>input;
    int ans=0;
    int i=0;
    do
    {
        
    } while (1);
    
    while(input!=0){
        int bit=input&1;
        ans=(int)(bit*(pow(10,i))+ans);
        input=input>>1;
        i++;
    }
    cout<<ans;
    }

#include <cstdio>
#include <iostream>
using namespace std;
int main(){
    int *i, ip;
    int &y = ip;
    ip = 78;
    i= &ip;
    cout<<i<<y<<endl;
    int arr [] = {1,3,5,7,8,9};
    for(int i : arr){
        cout<<(i);
    }


    return 0;
    }
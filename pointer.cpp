#include<iostream>

using namespace std;

int main(){

    int a=10;
    int &b=a;
    b=b+1;
   // it is storing address of that so it will cange value also
   // cout<<a<<" "<<b<<endl;

    int a1=10;
    int *b1=&a1;

    // cout<<sizeof(a1)<<endl;
    // cout<<sizeof(b1)<<endl;

    // cout<<*b1;

    ////

    char c='a';

    void* p= &a1;
   // cout<<p<<endl;

    p=&c;
   // cout<<p<<endl;


    int x=10;
    int *ptr= &x;

    cout<<x<<endl;
    cout<<&x<<endl;
    cout<<ptr<<endl;
    cout<<*ptr<<endl;
    cout<<&ptr<<endl;
    cout<<*&x<<endl;
    cout<<&(*ptr)<<endl;
    cout<<*(&ptr)<<endl;
    cout<<"________________________"<<endl;
    cout<<*ptr+1<<endl;



}
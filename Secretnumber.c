#include<stdio.h>
int main()
{
    int a=121;
    int b;
    printf("Enter a number");
    scanf("%d",&b);
    if(a<b){
        printf("Too long");
    }
    else if(a==b)
    {
        printf("You Win");
    }
    else
    {
        printf("Too samll");
    }
    
}


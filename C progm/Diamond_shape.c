#include<stdio.h>

int main(){
    int n=5;
    int star,space;
    int i,j,k;
    for(i=1;i<=2*n-1;i++){
    	
    space=(i<=n)?(n-i):(i-n);
    
    star=(i<=n)? (2*i-1):(2*(2*n-i)-1);
    
    for( j=1;j<=space;j++){
        printf(" ");
    }
    
    for( k=1;k<=star;k++){
        printf("*");
    }
    
    printf("\n");
}
    return 0;
}

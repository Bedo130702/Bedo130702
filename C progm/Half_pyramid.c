#include <stdio.h>

//    Question-1

int main(){
int n,i,j;
printf("Enter the numbers of rows:\n");
scanf("%d",&n);

for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        printf("*");
    }
    printf("\n");
}
	return 0;
}

#include <stdio.h>


//		Question-4

int main(){
int n,i,j,k;
printf("Enter the numbers of rows:\n");
scanf("%d",&n);

for(i=1;i<=n;i++){
	for(j=i;j<n;j++){
        printf(" ");
    }
    for(k=1;k<=i;k++){
        printf("*");
    }
    printf("\n");
}
	return 0;
}
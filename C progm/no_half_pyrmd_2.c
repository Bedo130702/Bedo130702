#include <stdio.h>


//		Question-3

int main(){
int n,i,j;
int asc=1;
printf("Enter the numbers of rows:\n");
scanf("%d",&n);

for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        printf("%d",asc);
        asc++;
    }
    printf("\n");
}
	return 0;
}


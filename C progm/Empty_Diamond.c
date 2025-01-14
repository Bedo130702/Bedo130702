#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int n=5;
	int i,j,k;
	int star,space;
	for(i=1;i<=2*n-1;i++){
		
		space=(i<=n)?(n-i):(i-n);
		
		star=(i<=n)?(2*i-1):(2*(2*n-i)-1);
		
		for(j=0;j<space;j++){
			printf(" ");
		}
		for(k=0;k<star;k++){
			if(k==0 || k==star-1){
			printf("*");
			}
			else{
				printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}

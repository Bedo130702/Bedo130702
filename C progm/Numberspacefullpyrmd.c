#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

#include <stdio.h>
int main() {
   int n, coef = 1, space, i, j;
   printf("Enter the number of rows: ");
   scanf("%d", &n);
   for (i = 0; i < n; i++) {
      for (space = 1; space <= n - i; space++)
         printf("  ");
      for (j = 0; j <= i; j++) {
         if (j == 0 || i == 0)
            coef = 1;
         else
            coef = coef * (i - j + 1) / j;
         printf("%4d", coef);
      }
      printf("\n");
   }
   return 0;
}

	
	
	
	
	
	
	


#include <stdio.h>

int main() {
    int rows, cols,i,j;

    // Input number of rows and columns for the rectangle
    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    // Loop to print the rectangle
    for ( i = 0; i < rows; i++) {
        for ( j = 0; j < cols; j++) {
            
            if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}


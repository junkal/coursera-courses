#include <stdio.h>

int main()
{
  int i = 0;
  int number_1, number_2, number_3;

  printf( "Printing 6 fibonacci numbers\n" );
  for (i = 0; i < 6; i++){
    //set the first number
    if (i == 0){
      number_1 = i;
      printf("%d\n", number_1);
      continue;
    }

    //set the second number
    if (i == 1){
      number_2 = i;
      printf("%d\n", number_2);
      continue;
    }

    //set the subsequent fibonacci number
    number_3 = number_2 + number_1;
    printf("%d\n", number_3);
    number_1 = number_2;
    number_2 = number_3;
  }

  return 0;
}

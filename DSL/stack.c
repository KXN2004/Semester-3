/* Programme to showcase stack using arrays in C */
#include <stdio.h>
#define max 5

int top = -1;
int stack[max];

void push() // Append value to the stack
{
  if (top == max - 1) 
  {
      printf("The stack is full!\n\n");
      return;
  }
  int value;
  printf("Enter the value to push to stack: ");
  scanf("%d", &value);
  top++;
  stack[top] = value;
  printf("Pushed %d to the stack\n\n", stack[top]);
}

void pop() // Remove last added value from the stack
{
  if (top == -1)
  {
    printf("The stack is empty!\n\n");
    return;
  }
  printf("Popped %d from the stack\n\n", stack[top]);
  top--;
}

void peek() // Print the last added value to the stack
{
  printf("The topmost value of the stack is: %d\n\n", stack[top]);
}

void display() // Display all the elements of the stack
{
  printf("The stack is: ");
  for (int i = top; i >=0 ; i--)
    printf("%d ", stack[i]);
  printf("\n\n");
}

int main()
{
  int choice, cont = 1;

  while (cont == 1) {
    printf("1: Push\n2: Pop\n3: Peek\n4: Display\nEnter your choice: ");
    scanf("%d", &choice);

    switch (choice)
    {
      case 1:
        push();
        break;
      case 2:
        pop();
        break;
      case 3:
        peek();
        break;
      case 4:
        display();
        break;
      default:
        printf("You have entered an invalid value!");
    }
    printf("Do you want to continue?(1 for yes, 0 for no): ");
    scanf("%d", &cont);
    printf("\n");
  }
  return 0;
}
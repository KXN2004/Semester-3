#include <stdio.h>
#include <malloc.h>

struct node
{
    int info;
    struct node *next;
} *start, *q, *r;

int main()
{
    start = NULL;
    int on = 1, choice, cont, value;
    
    void createlist(int data)
    {
        struct node *temp;
        temp = malloc(sizeof(struct node));
        temp -> info = data;
        temp -> next = NULL;

        if (start == NULL)
        {
            printf("List is empty!\n");
            start = temp;
        }
        else
        {
            q = start;
            while (q -> next != NULL)
                q = q -> next;

            q -> next = temp;
        }
    }

    void displaylist()
    {
        q = start;
        if (start ==  NULL)
            printf("The lust is empty!\n");
        else
        {
            printf("The list is: ");
            while(q != NULL)
            {
                printf("%d ", q -> info);
                q = q -> next;
            }
            printf("\n");
        }
    }

    void insertAtBegining(int data)
    {
        struct node *temp;
        temp = malloc(sizeof(struct node));
        temp -> info = data;
        temp -> next = NULL;

        if (start == NULL)
        {
            printf("List is empty!\n");
            start = temp;
        }
        else
        {
            temp -> next = start;
            start = temp;
        }
    }

    void deleteAtStart()
    {
        if (start == NULL)
            printf("The list is empty!\n");
        else
        {
            q = start;
            start = start -> next;
        }
    }

    void deleteAtEnd()
    {
        if (start == NULL)
            printf("List is empty!\n");
        else
        {
            q = start;
            while (q -> next != NULL){
                r = q;
                q = q -> next;
            }
            r -> next = NULL;
            free(q);
        }
    }
    
    void insertAfterGivenNode(int data)
    {
        struct node *temp;
        temp = malloc(sizeof(struct node));
        temp -> info = data;
        temp -> next = NULL
        
        if (start == NULL)
            printf("The list is empty!\n");
        else
        {

        }
    }

    while (on == 1)
    {
        printf("Press 1 to add element in the end of the list\n");
        printf("Press 2 to display list\n");
        printf("Press 3 to add element in the begining of the list\n");
        printf("Press 4 to delete element in the start of the list\n");
        printf("Press 5 to delete element from the end of the list\n");
        printf("Press 6 to add element after a node in the list\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:
                printf("Enter the value to add to the list: ");
                scanf("%d", &value);
                createlist(value);
                break;
            case 2:
                displaylist();
                break;
            case 3:
                printf("Enter the value to add to the list: ");
                scanf("%d", &value);
                insertAtBegining(value);
                break;
            case 4:
                deleteAtStart();
                break;
            case 5:
                deleteAtEnd();
                break;
            case 6:
                printf("Enter the value to add to the list: ");
                scanf("%d", &value)
                insertAfterGivenNode(value);
                break;
            default:
                printf("You have entered an invalid number!\n");
        }
        printf("Do you want to continue?(0 for no): ");
        scanf("%d", &cont);
        printf("\n");
        if (!cont)
            break;
    }

    return 0;
}
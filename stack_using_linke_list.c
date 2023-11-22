#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL;

void push()
{
	struct node *newNode = malloc(sizeof(struct node));
	int val;
	printf("enter the value to be push : ");
	scanf("%d",&val);
    	newNode->data = val;
	newNode->next = head;
	head = newNode;
	printf("value after inserted\n");
	show();
}

void pop()
{
	struct node *temp;
	if(head == NULL)
        	printf("Stack is Empty\n");
    	else
    	{
        	printf("Poped element = %d\n", head->data);
                temp = head;
	     	head = head->next;
	        free(temp);
		printf("value after pop:\n");
		show();
    	}
}
void isempty()
{
	if(head == NULL)
		printf("true\n");
	else
		printf("false\n");
}

void show()
{
	struct node *temp = head;
	while(temp != NULL)
    	{
        	printf("%d->", temp->data);
        	temp = temp->next;
    	}
    	printf("NULL\n");
}
int choice=0;
int main()
{
	while(choice != 5)  
    	{  
        	printf("Chose one from the below options...\n");  
        	printf("\n1.Push\n2.Pop\n3.Show\n4.isempty\n5.Exit");  
        	printf("\n Enter your choice \n");        
        	scanf("%d",&choice);  
        	switch(choice)  
        	{
			case 1:
			{   
                		push();  
                		continue;
			}  
			case 2:  
            		{  
                		pop();  
                		continue; 
            		}  
            		case 3:  
            		{  
                		show();  
                		continue; 
            		}  
                	case 4:  
            		{  
                		isempty();  
                		continue; 
			}               		
            		case 5:   
            		{  
                		printf("Exiting....");  
                		break;   
            		}  
            		default:  
            		{  
                		printf("Please Enter valid choice ");  
            		}   
        	}
	}
   	return 0;
}
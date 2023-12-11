#include <stdio.h>  
 
int stack[100],i,j,choice=0,n,top=-1,k=1;  

void push();  
void pop();  
void display();  
void topval();
void isempty();


void main ()  
{
	printf("Enter the number of elements in the stack ");
	scanf("%d",&n);
	printf("*********Stack operations using array*********");
	printf("\n----------------------------------------------\n");  
    	while(k)  
    	{  
        	printf("Chose one from the below options...\n");  
        	printf("\n1.Push\n2.Pop\n3.display\n4.top\n5.isempty\n");  
        	printf("\n Enter your choice :");        
        	scanf("%d",&choice);  
        	switch(choice)  
        	{
			case 1:
			{   
                		push();  
                		printf("\ndo you want to continue 1-yes 0-no  ");
            			scanf("%d",&k);
                		continue;
			}  
			case 2:  
            		{  
                		pop();  
                		printf("\ndo you want to continue 1-yes 0-no  ");
            			scanf("%d",&k);
                		continue; 
            		}  
            		case 3:  
            		{  
                		display(); 
                		printf("\ndo you want to continue 1-yes 0-no  ");
            			scanf("%d",&k);
                		continue; 
            		}  
			case 4:  
            		{
				topval();  
				printf("\ndo you want to continue 1-yes 0-no  ");
            			scanf("%d",&k);
                		continue; 
			}
                	case 5:  
            		{  
                		isempty(); 
                		printf("\ndo you want to continue 1-yes 0-no  ");
            			scanf("%d",&k);
                		continue; 
			}          		
            		default:  
            		{  
                		printf("Please Enter valid choice \n");  
            		}   
        	}
           	printf("\ndo you want to continue 1-yes 0-no  ");
            	scanf("%d",&k);
    	}  
}   
  
void push ()  
{  
    int val;      
    if (top == n )   
    	printf("\n Overflow");   
    else   
    {  
        printf("Enter the value?");  
        scanf("%d",&val);         
        top = top +1;   
        stack[top] = val;  
    }
	display();
}   
  
void pop ()   
{   
    if(top == -1)   
    	printf("Underflow");  
    else  
    	top = top -1;   
	display();
}   
void display()  
{  
    for (i=top;i>=0;i--)  
    {  
        printf("%d\n",stack[i]);  
    }  
    if(top == -1)   
    {  
        printf("Stack is empty");  
    }  
}  

void topval()
{
	printf("%d",stack[top]);
}
void isempty()
{
	if(top<0)
		printf("\nit is empty");
	else
		printf("\nit is not empty ");
}

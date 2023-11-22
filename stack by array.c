#include <stdio.h>  
 
int stack[100],i,j,choice=0,n,top=-1;  

void push();  
void pop();  
void show();  
void top();
void isempty();
void size();

void main ()  
{
	printf("Enter the number of elements in the stack ");
	scanf("%d",&n);
	printf("*********Stack operations using array*********");
	printf("\n----------------------------------------------\n");  
    	while(choice != 7)  
    	{  
        	printf("Chose one from the below options...\n");  
        	printf("\n1.Push\n2.Pop\n3.Show\n4.top\n5.isempty\n6.size\n7.Exit");  
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
				top();  
                		continue; 
			}
                	case 5:  
            		{  
                		isempty();  
                		continue; 
			}
			case 6:  
            		{  
				size();  
                		continue; 
			}                		
            		case 7:   
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
}   
  
void pop ()   
{   
    if(top == -1)   
    printf("Underflow");  
    else  
    top = top -1;   
}   
void show()  
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

void top()
{
	printf("%d",stack[top]);
}
void isempty()
{
	if(top<0)
		printf("true");
	else
		printf("false");
}
void size()
{
	printf("%d",top);
}
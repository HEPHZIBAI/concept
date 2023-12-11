import java.util.Scanner;  
class Stack
{  
    int top;   
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
      
      
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    Stack()  
    {  
        top = -1;  
    }  
    boolean push (Scanner sc)  
    {  
        if(top == maxsize)  
        {  
            System.out.println("\n Overflow");  
            return false;  
        }  
        else   
        {  
            System.out.print("\nEnter the value? ");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            display();
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow");  
            return false;  
        }  
        else   
        {  
            top --;   
            display();
            return true;  
        }  
    }  
    void display ()  
    {  
        //System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }  
    void topval()
    {
        System.out.println(arr[top]);
    }
}  
public class stack_by_array
{  
    public static void main(String[] args) 
    {  
        int choice=0;  
        Scanner sc = new Scanner(System.in);  
        Stack s = new Stack();
        int k=1;
        System.out.print("Enter the number of elements in the stack ");
        s.maxsize=sc.nextInt();
        System.out.println("*********Stack operations using array*********\n");  
        System.out.println("\n------------------------------------------------\n");  
        while(k==1)  
        {  
            System.out.println("\nChose one from the below options...\n");  
            System.out.println("\n1.Push\n2.Pop\n3.display\n4.top\n5.isempty\n");  
            System.out.print("\n Enter your choice : ");        
            choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                {   
                    s.push(sc);
                    System.out.println("\ndo you want to continue 1-yes 0-no  ");
            		k=sc.nextInt();
                    continue; 
                }  
                case 2:  
                {  
                    s.pop();  
                    System.out.println("\ndo you want to continue 1-yes 0-no  ");
            		k=sc.nextInt();
                    continue; 
                }  
                case 3:  
                {  
                    s.display(); 
                    System.out.println("\ndo you want to continue 1-yes 0-no  ");
            		k=sc.nextInt();
                    continue; 
                }  
                case 4:   
                {  
                    s.topval();
                    System.out.println("\ndo you want to continue 1-yes 0-no  ");
            		k=sc.nextInt();
                    continue;   
                }  
                case 5:  
            	{  
                	s.isEmpty(); 
                	System.out.println("\ndo you want to continue 1-yes 0-no  ");
            		k=sc.nextInt();
            		continue; 
	        	} 
                default:  
                {  
                    System.out.println("Please Enter valid choice ");  
                }   
            }
        }  
    }  
}  

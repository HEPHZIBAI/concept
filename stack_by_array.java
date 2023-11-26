import java.util.Scanner;  
class stack_by_array  
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
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
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
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            display()
            return true;  
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }  
}  
public class Stack_Operations 
{  
    public static void main(String[] args) 
    {  
        int choice=0;  
        Scanner sc = new Scanner(System.in);  
        Stack s = new Stack();  
        System.out.println("*********Stack operations using array*********\n");  
        System.out.println("\n------------------------------------------------\n");  
        while(choice != 4)  
        {  
            System.out.println("\nChose one from the below options...\n");  
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
            System.out.println("\n Enter your choice \n");        
            choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                {   
                    s.push(sc);  
                    continue; 
                }  
                case 2:  
                {  
                    s.pop();  
                    continue; 
                }  
                case 3:  
                {  
                    s.display();  
                    continue; 
                }  
                case 4:   
                {  
                    System.out.println("Exiting....");  
                    break;   
                }  
                default:  
                {  
                    System.out.println("Please Enter valid choice ");  
                }   
            }
        }  
    }  
}  

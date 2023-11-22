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
public class Stack_Operations {  
public static void main(String[] args) {  
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
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4:   
            {  
                System.out.println("Exiting....");  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Please Enter valid choice ");  
            }   
        };  
    }  
}  
}  
C# Program

using System;  
  
public class Stack  
{  
    int top;  
    int maxsize=10;  
    int[] arr = new int[10];  
    public static void Main()  
    {  
    Stack st = new Stack();  
    st.top=-1;  
    int choice=0;  
    Console.WriteLine("*********Stack operations using array*********");  
    Console.WriteLine("\n----------------------------------------------\n");  
    while(choice != 4)  
    {  
        Console.WriteLine("Chose one from the below options...\n");  
        Console.WriteLine("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
        Console.WriteLine("\n Enter your choice \n");         
        choice = Convert.ToInt32(Console.ReadLine());  
        switch(choice)  
        {  
            case 1:  
            {   
                st.push();  
                break;  
            }  
            case 2:  
            {  
                st.pop();  
                break;  
            }  
            case 3:  
            {  
                st.show();  
                break;  
            }  
            case 4:   
            {  
            Console.WriteLine("Exiting....");  
                break;   
            }  
            default:  
            {  
                Console.WriteLine("Please Enter valid choice ");  
                break;  
            }   
        };  
    }  
}   
  
Boolean push ()  
{  
    int val;      
    if(top == maxsize-1)   
    {  
          
        Console.WriteLine("\n Overflow");  
        return false;  
    }  
    else   
    {  
        Console.WriteLine("Enter the value?");  
        val = Convert.ToInt32(Console.ReadLine());        
        top = top +1;   
        arr[top] = val;  
        Console.WriteLine("Item pushed");  
        return true;  
    }   
}   
  
Boolean pop ()   
{   
    if (top == -1)   
    {  
        Console.WriteLine("Underflow");  
        return false;  
    }  
      
    else  
      
    {  
        top = top -1;  
        Console.WriteLine("Item popped");  
        return true;  
    }  
}   
void show()  
{  
      
    for (int i=top;i>=0;i--)  
    {  
        Console.WriteLine(arr[i]);  
    }  
    if(top == -1)   
    {  
        Console.WriteLine("Stack is empty");  
    }  
}  
}  

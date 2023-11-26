import static java.lang.System.exit;

class stack_using_linke_list
{
	public static void main(String[] args)
	{
		
		StackUsingLinkedlist obj= new StackUsingLinkedlist();
		int choice=0;  
        	Scanner sc = new Scanner(System.in);   
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
class StackUsingLinkedlist 
{
	private class Node 
	{
		int data;
		Node link; 
	}
	Node top;

	// Constructor

	StackUsingLinkedlist() 
	{ 
		this.top = null; 
	}

	
	public void push(int x) 
	{
		Node temp = new Node();
		if (temp == null) 
		{
			System.out.print("\nHeap Overflow");
			return;
		}

		temp.data = x;

		temp.link = top;

		top = temp;
	}

	public boolean isEmpty() 
	{ 
		return top == null; 
	}

	public int topvalue()
	{
		
		if (!isEmpty()) 
		{
			return top.data;
		}
		else 
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() 
	{
		if (top == null) 
		{
			System.out.print("\nStack Underflow");
			return;
		}
		top = (top).link;
	}

	public void display()
	{
		if (top == null) 
		{
			System.out.printf("\nStack Underflow");
		}
		else 
		{
			Node temp = top;
			while (temp != null) 
			{
				System.out.print(temp.data);
				temp = temp.link;
				if(temp != null)
					System.out.print(" -> ");
			}
		}
	}
}

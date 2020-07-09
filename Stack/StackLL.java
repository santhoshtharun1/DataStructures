package Stack;

class Node_1
{
	public Node_1 next;
	public int data;
	
	public String toString()
	{
		return data+" ";
	}
}

public class StackLL {
	
	public Node_1 top;
	public int size;
	
	public StackLL()
	{
		this.top=null;
		size=-1;
	}
	
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		return false;
	}
	
	public void push(int value)
	{
		Node_1 node = new Node_1();
		node.data=value;
		node.next=top;
		top=node;
		size++;
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Doesnt exist");
		}
		else
		{
			System.out.print(top);
			top=top.next;
		}
		size--;
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			System.out.println(top);
		}
	}
	public void deletestack()
	{
		top=null;
	}
	
	public static void main(String[] args)
	{
		StackLL l =new StackLL();
		l.push(12);
		l.push(23);
		l.push(24);
		l.pop();
		l.pop();
		l.pop();
		l.pop();
		l.push(13);
		l.peek();
		l.deletestack();
		l.peek();
		
		/*s.push(10);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(30);
		s.push(90);
		s.pop();
		s.pop();
		s.pop(); 
		s.pop();
		s.pop();
		s.pop(); 
		s.pop();
		s.pop();
		s.pop(); 
		s.pop();
		s.pop();
		s.pop(); */
		
		
	}
}

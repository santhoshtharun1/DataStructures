package Stack;

public class Stack {
	
	int[] arr=null;
	int topOfStack;
	
	public Stack(int size)
	{
		this.arr=new int[size];
		this.topOfStack=-1;
	}
	public boolean isFull()
	{
		if(topOfStack==arr.length-1)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public boolean isEmpty()
	{
		if(topOfStack==-1)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			arr[topOfStack+1]=value;
			topOfStack++;
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println(arr[topOfStack]);
			topOfStack--;
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println(arr[topOfStack]);
		}
	}
	public void delete()
	{
		arr=null;
	}
	
	public static void main(String[] args)
	{
		Stack s =new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.peek();
		s.push(50);
		s.push(30);
		s.push(20);
		s.peek();
		s.push(30);
		s.push(20);
		//s.push(40);
		s.pop();
		
		
	}

}

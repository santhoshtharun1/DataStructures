package Queue;

public class LinearQueue {
	int[] arr=null;
	public int front,rear;
	
	public LinearQueue(int size)
	{
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(rear==arr.length-1)
		{
			return true;
		}
		return false;
	}
	public void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else if(isEmpty())
		{
			front=0;
			arr[rear+1]=value;
			rear++;
		}
		else
		{
			arr[rear+1]=value;
			rear++;
		}
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
		}
		else if(front>rear)
		{
			front=rear=-1;
		}
		else
		{
			System.out.println(arr[front]);
			front++;
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		System.out.println(arr[front]);
	}
	
	public static void main(String[]  args)
	{
		LinearQueue l =new LinearQueue(8);
		l.enqueue(10);
		l.enqueue(20);
		l.enqueue(30);
		l.enqueue(40);
		l.dequeue();
		l.dequeue();
		l.dequeue();
		l.dequeue();
		l.enqueue(50);
		l.peek();
		l.enqueue(60);
		l.enqueue(80);
		l.enqueue(70);
		l.dequeue();
		l.dequeue();
		l.peek();
	}
}

package Queue;

public class queue {
	public int arr[];
	public int front;
	public int rear;
	
	public queue(int size)
	{
		arr=new int[size];
		front=rear=-1;
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
	
	public void enQueue(int value)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else if(isEmpty())
		{
			front =0;
			arr[rear+1]=value; 
			rear++;
		}
		else
		{
			arr[rear+1]=value;
			rear++;
		}
	}
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("queue not exist");
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
		else
		{
			System.out.print(arr[front]);
		}
	}
	public void delete()
	{
		arr=null;
	}
	public static void main(String[] args)
	{
		queue q =new queue(5);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.peek();
		
	}
}
